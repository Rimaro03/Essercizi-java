package immobili;
import java.util.*;
public class Negozi extends Immobili {

	Scanner sc = new Scanner(System.in);

	private String cognome;
	private String nome;
	private String indirizzo;
	private int superficie;
	private int supMagazzino;
	private int vetrine;
	private double prezzo;

	public Negozi() {
		this.cognome = "";
		this.nome = "";
		this.indirizzo = "";
		this.superficie = 0;
		this.supMagazzino = 0;
		this.vetrine = 0;
		this.prezzo = 0;
	}

	public Negozi(Scanner sc, String cognome, String nome, String indirizzo, int superficie, int supMagazzino,
			int vetrine, double prezzo) {
		super();
		this.sc = sc;
		this.cognome = cognome;
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.superficie = superficie;
		this.supMagazzino = supMagazzino;
		this.vetrine = vetrine;
		this.prezzo = prezzo;
	}


	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public int getSupMagazzino() {
		return supMagazzino;
	}

	public void setSupMagazzino(int supMagazzino) {
		this.supMagazzino = supMagazzino;
	}

	public int getVetrine() {
		return vetrine;
	}

	public void setVetrine(int vetrine) {
		this.vetrine = vetrine;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = superficie*1300+supMagazzino*500;
	}

	public void inserisci() {
		System.out.print("Cognome: ");
		cognome=sc.nextLine();
		System.out.print("Nome: ");
		nome=sc.nextLine();
		System.out.print("Indirizzo: ");
		indirizzo=sc.nextLine();
		System.out.print("Superficie: ");
		superficie=sc.nextInt();
		System.out.print("Sup Magazzino: ");
		supMagazzino=sc.nextInt();
		System.out.print("vetrine: ");
		vetrine=sc.nextInt();
	}

	public void visualizza() {
		System.out.print("Cognome: "+cognome);
		System.out.print("Nome: "+nome);
		System.out.print("Indirizzo: "+indirizzo);
		System.out.print("Superficie: "+superficie);
		System.out.print("Sup Magazzino: "+supMagazzino);
		System.out.print("Vetrine: "+vetrine);
		System.out.print("Prezzo: "+prezzo);
	}
	
	public void cerca(int pr) {
		if(prezzo<pr) {
			System.out.print("Cognome: "+cognome);
			System.out.print("Nome: "+nome);
			System.out.print("Indirizzo: "+indirizzo);
			System.out.print("Superficie: "+superficie);
			System.out.print("Sup Magazzino: "+supMagazzino);
			System.out.print("Vetrine: "+vetrine);
			System.out.print("Prezzo: "+prezzo);
		}
	}
	
	public void elimina() {
		System.out.println("Cognome: ");
		String co = sc.nextLine();
		System.out.println("Nome: ");
		String no = sc.nextLine();
		boolean ce=false;
		if(nome.equalsIgnoreCase(no) && cognome.equalsIgnoreCase(co)) {
			ce=true;
		}
	}
}