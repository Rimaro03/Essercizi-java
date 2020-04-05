package rubrica_ovidio;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Telefono {

	private String  Nome;
	private String Cognome;
	private String Numero;
	private String email;
	

	
	public Telefono() {
		Nome="";
		Cognome="";
		Numero="";
		email="";
		
	}
	
	
	//cotruttore con parametri
	/**
	 * @param nome
	 * @param cognome
	 * @param numero
	 * @param email
	 */
	
	
	public  Telefono(String nome, String cognome, String numero, String email) {
		this.Nome=nome;
		this.Cognome=cognome;
		this.Numero=numero;
		this.email=email;
	}
	
	public void inserisci() {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci il nome del contatto(*prima lettera mauscola*)");
		Nome=tastiera.nextLine();
		System.out.println("Inserisci il cognome del contatto(*prima lettera mauscola*)");
		Cognome=tastiera.nextLine();
		boolean vero=false;
		
		do {
			
			System.out.println("Inserisci il numero del contatto: ");
			Numero = tastiera.nextLine();
			int lunghezza=Numero.length();
			if (lunghezza<1 || lunghezza>10) {
				System.out.println("Inserisci un numero di 10 numeri");
			} else {
				vero=true;
			}
			
		}while(vero==false);
		System.out.println("Inserisci l'email del contatto");
		email=tastiera.nextLine();
		
		String nomeFile = "Contatto.txt";
		PrintWriter pw;
		try {
			FileWriter fw = new FileWriter(nomeFile,true);
			pw=new PrintWriter(fw);
			pw.print(Nome+",");
			pw.print(Cognome+",");
			pw.print(Numero+",");
			pw.println(email+";");
			pw.close();
			System.out.println("Scrittura sul file " +  nomeFile + " avvenuta con successo");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("Errore: scrittura sul file " +  nomeFile + " interrotta");

		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("Errore: scrittura sul file " +  nomeFile + " interrotta");

		}
	}
	
	//visualizza
	
	public void visualizza() {
		
		try {

			File nomeFile = new File("Contatto.txt");
			String linea;
			FileInputStream fin;

			fin = new FileInputStream(nomeFile);

			Scanner in = new Scanner(fin);

			String c="",n="",t="",m="";

			while(in.hasNextLine())
			{
				linea = in.nextLine();
				String st1[] = linea.split(";");
				for(int i=0; i<st1.length; i++) {
					String st2[] = st1[i].split(",");
					for(i=0; i<st2.length; i++) {
						c = st2[0];
						n = st2[1];
						t = st2[2];
						m = st2[3];
					}
					System.out.println();
					System.out.println("Cognome="+c);
					System.out.println("Nome="+n);
					System.out.println("Tel="+t);
					System.out.println("Mail="+m);

				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*System.out.println("-------------------------------------------------");
		System.out.println("Il nome del contatto e': " +Nome);
		System.out.println("Il cognome del contatto e': " +Cognome);
		System.out.println("Il numero del contatto e': " +Numero);
		System.out.println("L'email del contatto e': " +email);
		System.out.println("-------------------------------------------------");*/
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public String getCognome() {
		return Cognome;
	}


	public void setCognome(String cognome) {
		Cognome = cognome;
	}


	public String getNumero() {
		return Numero;
	}


	public void setNumero(String numero) {
		Numero = numero;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Telefono [Nome=" + Nome + ", Cognome=" + Cognome + ", Numero=" + Numero + ", email=" + email + "]";
	}
	
	
	
}
