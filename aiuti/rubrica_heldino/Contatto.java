package rubrica_heldino;

import java.util.*;
import java.io.*;

public class Contatto {

	private String nome;	
	private String cognome;
	private String num;
	private String mail;


	public Contatto() {
		nome="";
		cognome = "";
		num = "";
		mail="";
	}

	public Contatto(String nome, String cognome, String num, String mail) {
		this.nome = nome;
		this.cognome = cognome;
		this.num = num;
		this.mail = mail;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}


	public void inserisci() {
		

			Scanner kb = new Scanner(System.in);

			System.out.print("Inserisci il nome: ");
			nome = kb.nextLine();
			System.out.print("Inserisci il cognome: ");
			cognome = kb.nextLine();
			System.out.print("Inserisci il numero: ");
			num = kb.nextLine();
			int p=0;
			System.out.print("Inserisci la mail: ");
			mail = kb.nextLine();
			
			String nomeFile = "Rubrica.txt";
			PrintWriter pw;
			try {
				FileWriter fw = new FileWriter(nomeFile,true);
				pw=new PrintWriter(fw);
				pw.print(nome+",");
				pw.print(cognome+",");
				pw.print(num+",");
				pw.println(mail+";");
				pw.close();
				System.out.println("Scrittura sul file " +  nomeFile + " effettuata con successo");
			} catch (FileNotFoundException e) {
				System.out.println("Errore nella scrittura del file in: " +  nomeFile );

			} catch (IOException e) {
				System.out.println("Errore nella scrittura del file in: " +  nomeFile);

			}


	}


	public void visualizza() {
		try {

			String nomeFile = "Rubrica.txt";
			String linea;
			FileInputStream fin;

			fin = new FileInputStream(nomeFile);


			Scanner kb = new Scanner(fin);

			while(kb.hasNextLine())
			{
				linea = kb.nextLine();

				String elementi[] = linea.split(";");

				String nome = elementi[0];
				String cognome = elementi[1];
				String num = elementi[2];
				String mail = elementi[3];
				System.out.println("nome=" + nome);
				System.out.println("cognome=" + cognome);
				System.out.println("numero=" + num);
				System.out.println("mail=" + mail);
				System.out.println();
			}
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}
}
