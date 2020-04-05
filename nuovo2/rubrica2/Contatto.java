/*autore: leonardo ongaro
 * versione 3.0
 * data inizio 25/02/2020
 * data fine 07/03/2020
 */
package rubrica2;
import java.util.*;
import java.io.*;


public class Contatto {
	Scanner sc = new Scanner(System.in);

	private String nome;	
	private String cognome;
	private String tel;
	private String mail;


	public Contatto() {
		nome="";
		cognome = "";
		tel = "";
		mail="";
	}

	public Contatto(String nome, String cognome, String tel, String mail) {
		this.nome = nome;
		this.cognome = cognome;
		this.tel = tel;
		this.mail = mail;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
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

	//qui ho commentato i controlli perché nei metodi della rubrica il carattere @ da problemi. 
	public void inserisci() {		

		Scanner loli = new Scanner(System.in);

		System.out.print("Inserisci il nome: ");
		nome = loli.nextLine();
		System.out.print("Inserisci il cognome: ");
		cognome = loli.nextLine();
		System.out.print("Inserisci il cell: ");
		tel = loli.nextLine();
		int p=0;
		//do {
		System.out.print("Inserisci la mail: ");
		mail = loli.nextLine();
		/*for(int i=0; i<mail.length(); i++) {
				if(mail.charAt(i)=='@') {
					p++;
					break;
				}
			}
		mail = loli.nextLine();
		}while(p<=0); */
	}


	public void visualizza() {
		System.out.println("nome=" + nome);
		System.out.println("cognome=" + cognome);
		System.out.println("tel=" + tel);
		System.out.println("mail=" + mail);
		System.out.println();
	}
}

