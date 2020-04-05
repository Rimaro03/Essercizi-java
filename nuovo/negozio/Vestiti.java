/**
 * @author 3AI
 */
package negozio;
import java.util.*;
public class Vestiti {

	String marca;
	String modello;
	String taglia;
	int quantita;
	double prezzo;
	/*
	 * Costruttore id default
	 * 
	 */
	public Vestiti() {
		marca="";
		modello="";
		taglia="";

	}
	/**
	 * 
	 * @param marca
	 * @param modello
	 * @param taglia
	 * @param quantita
	 * @param prezzo
	 */
	public Vestiti(String marca, String modello, String taglia, int quantita, double prezzo) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.taglia = taglia;
		this.quantita = quantita;
		this.prezzo = prezzo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getTaglia() {
		return taglia;
	}

	public void setTaglia(String taglia) {
		this.taglia = taglia;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public void inserisci() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Inserisci la marca: ");
		marca = scan.nextLine();
		System.out.print("Inserisci il modello: ");
		modello = scan.nextLine();
		do {
			System.out.print("Inserire taglia S, M, L: ");
			taglia = scan.nextLine();
		}
		while(!(taglia.equalsIgnoreCase("S") || taglia.equalsIgnoreCase("M") || taglia.equalsIgnoreCase("L")));
		System.out.print("Inserisci la quantità: ");
		quantita = scan.nextInt();
		System.out.print("Inserisci il prezzo: ");
		prezzo = scan.nextInt();
	}

	public String toString() {
		return "Vestiti: marca= "+marca+", modello= "+modello+", taglia= "+taglia+", prezzo= "+prezzo;
	}
	
	public void visualizza() {
		System.out.println("Marca= "+marca);
		System.out.println("Modello= "+modello);
		System.out.println("Taglia= "+taglia);
		System.out.println("Prezzo= "+prezzo);
		System.out.println("Quantità= "+quantita);
	}

	public void sconto(int sc) {
		prezzo = prezzo-prezzo*sc/100;
	}
	
	public void vende(int q) {
		quantita = quantita-q;
	}
	
	public boolean scorta(int sco) {
		if(quantita<sco) {
			System.out.println("La merce sta per finire");
			return true;
		}
		else {
			return false;
		}
	}
}
