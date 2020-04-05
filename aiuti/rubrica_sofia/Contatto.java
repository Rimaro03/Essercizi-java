/**
 * 
 */
package rubrica_sofia;
import java.io.*;
import java.util.Scanner;
/**
 * @author Sofia
 *
 */
public class Contatto {



	private String nome;
	private String cognome;
	private String email;
	private String numero;



	public Contatto() {
		nome = "";
		nome = "";
		email = "";
		numero = "";
	}

	public Contatto(String nome, String cognome, String email, String numero) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.numero = numero;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;

	}

	public void inseisci() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserire il nome: ");
		nome = scan.nextLine();
		System.out.println("Inserire il cognome: ");
		cognome = scan.nextLine();

		String chioc = "@";
		String punt = ".";
		boolean x = false;
		while (x==false) {
			System.out.println("Inseisci la tua email (devono essere presenti punti e chiocciole): ");
			email = scan.nextLine();
			if(email.contains(chioc)&& email.contains(punt)) {
				x=true;
			}
			boolean giusto = false;
			int lung = 0;
			int lungnum = 1;			//lunghezza numero di telefono inserita uguale a 1 per comoditÃ  nel provare il programma, Ã¨ modificabile
			while (lung!=lungnum) {
				System.out.println("Inserisci il numero di telefono di lunghezza uguale a " +lungnum );
				numero = scan.nextLine();
				lung = numero.length();

			}
			System.out.println("contatto scritto");
			String file = "Contatto.txt";
			PrintWriter pw;

			try {

				FileWriter fw = new FileWriter(file,true);		//il printwriter scrive sul filewriter 
				pw=new PrintWriter(fw);								//gli dice di scrivere sul file di testo quello che è stato scritto sul filewriter
				pw.print(nome+",");
				pw.print(cognome+",");
				pw.print(email+",");
				pw.println(numero+";");
				pw.close();
			}	catch(FileNotFoundException e) {	
				//e.printStackTrace();
				System.out.println("File di testo non trovato");
			}   catch (IOException e) {
				//e.printStackTrace();
				System.out.println("Errore nella scrittura");
			}
		}
	}

	@Override
	public String toString() {
		return "Contatto [nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", numero=" + numero + "]";
	}

	public void visualizza() {

		try {
			String file = "Contatto.txt";
			String linea;			//la linea divide le stringhe dentro il file txt
			FileInputStream FIS;	//va a leggere il file e legge cosa c'è dentro gli passo come parametro il file da leggere e serve anche lo scanner
			FIS = new FileInputStream(file);

			Scanner scan = new Scanner(FIS);	//gli passo come parametro fin ed elabora quello che il FIN ha letto. lo scanner dopo lo passa alla stringa
			String N = "", Co="", E="", T="";

			while (scan.hasNextLine()) {		//hasnextline legge finchè c'è qualcosa
				linea=scan.nextLine();					//ora separiamo le varie informazioni che sono divise dal ;
				String s1[] = linea.split(";");			//il metodo split divide secondo un parametro in questo caso divide le info di ogni contatto
				for(int i=0;i<s1.length;i++) {
					String s2[] = s1[i].split(",");
					for(i=0;i<s2.length;i++) {
						N=s2[0];
						Co=s2[1];
						E=s2[2];
						T=s2[3];
					}
					System.out.println("\n nome = "+N);
					System.out.println("\n cognome = " + Co);
					System.out.println("\n email = " +E);
					System.out.println("\n numero = " +T);
				}
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
