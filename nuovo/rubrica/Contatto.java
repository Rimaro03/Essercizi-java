package rubrica;

import java.util.Scanner;

public class Contatto {

	private String nome;	
	private String cognome;
	private String tel;


	public Contatto() {
		cognome = "";
		tel = "";

	}

	public Contatto(String nome, String cognome, String tel, String editore, double prezzo) {
		this.nome = nome;
		this.cognome = cognome;
		this.tel = tel;
	}

	public String getcognome() {
		return cognome;
	}

	public void setcognome(String cognome) {
		this.cognome = cognome;
	}

	public String gettel() {
		return tel;
	}

	public void settel(String tel) {
		this.tel = tel;
	}

	
	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public void inserisci() {
		Scanner loli = new Scanner(System.in);
		System.out.print("Inserisci il nome: ");
		nome = loli.nextLine();
		System.out.print("Inserisci il cognome: ");
		cognome = loli.nextLine();
		System.out.print("Inserisci il cell: ");
		tel = loli.nextLine();
	}
		
	
	public void visualizza() {
		System.out.println("nome: " + nome);
		System.out.println("cognome: " + cognome);
		System.out.println("numero di telefono: " + tel);
	}
	
	
	
}
