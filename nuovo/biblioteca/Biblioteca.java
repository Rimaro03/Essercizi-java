package biblioteca;
import java.util.*;
public class Biblioteca {

	Scanner sc = new Scanner(System.in);
	
	private int isbn;
	private String titolo;
	private String autore;
	public String argomento;
	public double prezzo;
	
	public Biblioteca() {
		this.isbn = 0;
		this.titolo = "";
		this.autore = "";
		this.argomento = "";
		this.prezzo = 0;
	}
	
	public Biblioteca(int isbn, String titolo, String autore, String argomento, double prezzo) {
		super();
		this.isbn = isbn;
		this.titolo = titolo;
		this.autore = autore;
		this.argomento = argomento;
		this.prezzo = prezzo;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getArgomento() {
		return argomento;
	}

	public void setArgomento(String argomento) {
		this.argomento = argomento;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Biblioteca [isbn=" + isbn + ", titolo=" + titolo + ", autore=" + autore + ", argomento=" + argomento
				+ ", prezzo=" + prezzo + "]";
	}
	
	public void inserisci() {
		System.out.print("ISBN: ");
		isbn = sc.nextInt();
		sc.nextLine();
		System.out.print("Titolo: ");
		titolo = sc.nextLine();
		System.out.print("Autore: ");
		autore = sc.nextLine();
		System.out.print("Argomento: ");
		argomento = sc.nextLine();
		System.out.print("Prezzo: ");
		prezzo = sc.nextInt();
	}
	
	public void visualizza() {
		System.out.print("ISBN: "+isbn);
		System.out.print("Titolo: "+titolo);
		System.out.print("Autore: "+autore);
		System.out.print("Argomento: "+argomento);
		System.out.print("Prezzo: "+prezzo);
	}
	
	public void cerca(int ce) {
		if(isbn==ce) {
			System.out.print("ISBN: "+isbn);
			System.out.print("Titolo: "+titolo);
			System.out.print("Autore: "+autore);
			System.out.print("Argomento: "+argomento);
			System.out.print("Prezzo: "+prezzo);
		}
	}
	
	/*public void elimina(int ce) {
		if(isbn==ce) {
			
		}
	}*/
}
