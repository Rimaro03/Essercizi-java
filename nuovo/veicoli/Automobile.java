package veicoli;
import java.util.Scanner;

public class Automobile extends VeicoloAMotore{

	private String targa;
	private String marca;
	private String modello;
	private int nPorte;
	
	public Automobile() {
		targa = "";
		marca = "";
		modello = "";
		nPorte = 0;
	}

	public Automobile(String targa, String marca, String modello, int nPorte) {
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		this.nPorte = nPorte;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		if (targa.length() == 7)
			this.targa = targa;
		else
			this.targa = "";
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

	public int getnPorte() {
		return nPorte;
	}

	public void setnPorte(int nPorte) {
		if ((nPorte >= 2) && (nPorte <= 8))
			this.nPorte = nPorte;
		else
			this.nPorte = 0;
	}

	public String toString() {
		return "Automobile [targa=" + targa + ", marca=" + marca + ", modello=" + modello + ", nPorte=" + nPorte + "]";
	}
	
	public void visualizza() {
		System.out.println("La targa è: " + targa);
		System.out.println("La marca è: " + marca);
		System.out.println("Il modello è: " + modello);
		System.out.println("Il numero di porte è: " + nPorte);
	}

	public void inserisci() {
		Scanner sc = new Scanner (System.in);
		
		do {
			System.out.println("Inserisci targa: ");
			targa = sc.nextLine();
		}while (targa.length() != 7);
		sc.nextLine();
		System.out.println("Inserisci marca: ");
		marca = sc.nextLine();
		System.out.println("Inserisci modello: ");
		modello = sc.nextLine();
		do {
			System.out.println("Inserisci numero delle porte: ");
			nPorte = sc.nextInt();
		}while ((nPorte <2) && (nPorte > 8));
	}
	
}
