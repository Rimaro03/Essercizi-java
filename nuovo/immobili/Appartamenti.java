package immobili;
import java.util.*;
public class Appartamenti extends Immobili {

	Scanner sc = new Scanner(System.in);

	private String cognome;
	private String nome;
	private String indirizzo;
	private int superficie;
	private boolean garage;
	private int stanze;
	private double prezzo;
	String scelta;

	public Appartamenti() {
		super();
		this.cognome="";
		this.nome="";
		this.indirizzo="";
		this.superficie=0;
		this.garage = false;
		this.stanze = 0;
		this.prezzo = 0;
	}

	public Appartamenti(Scanner sc, String cognome, String nome, String indirizzo, int superficie, boolean garage,
			int stanze, double prezzo) {
		this.cognome = cognome;
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.superficie = superficie;
		this.garage = garage;
		this.stanze = stanze;
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

	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	public int getStanze() {
		return stanze;
	}

	public void setStanze(int stanze) {
		this.stanze = stanze;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = superficie*1500+stanze*1000;
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
		System.out.print("Stanze: ");
		stanze=sc.nextInt();
		System.out.print("Garage: ");
		scelta=sc.nextLine();
		if(scelta.equalsIgnoreCase("si")) {
			garage=true;
		}
	}

	public void visualizza() {
		System.out.print("Cognome: "+cognome);
		System.out.print("Nome: "+nome);
		System.out.print("Indirizzo: "+indirizzo);
		System.out.print("Superficie: "+superficie);
		System.out.print("Sup Magazzino: "+stanze);
		if(garage==true) {
			System.out.print("Garage: si");
		}
		else {
			System.out.println("Garage: no");
		}
		System.out.println("Prezzo: "+prezzo);
	}

	public void cerca(int pr) {
		if(prezzo<pr) {
			System.out.print("Cognome: "+cognome);
			System.out.print("Nome: "+nome);
			System.out.print("Indirizzo: "+indirizzo);
			System.out.print("Superficie: "+superficie);
			System.out.print("Sup Magazzino: "+stanze);
			if(garage==true) {
				System.out.print("Garage: si");
			}
			else {
				System.out.println("Garage: no");
			}
			System.out.println("Prezzo: "+prezzo);
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
