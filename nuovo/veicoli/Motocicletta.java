package veicoli;
import java.util.Scanner;
public class Motocicletta extends VeicoloAMotore{

	private String targa;
	private String marca;
	private String modello;
	private int cilindrata;
	
	public Motocicletta() {
		targa = "";
		marca = "";
		modello = "";
		cilindrata = 0;
	}

	public Motocicletta(String targa, String marca, String modello, int cilindrata) {
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
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

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		if ((cilindrata == 50) || (cilindrata == 125) || (cilindrata == 600))
			this.cilindrata = cilindrata;
		else
			this.cilindrata = 0;
	}

	public String toString() {
		return "Motocicletta [targa=" + targa + ", marca=" + marca + ", modello=" + modello + ", cilindrata="
				+ cilindrata + "]";
	}

	public void visualizza() {
		System.out.println("La targa è: " + targa);
		System.out.println("La marca è: " + marca);
		System.out.println("Il modello è: " + modello);
		System.out.println("La cilindrata della moto è: " + cilindrata);
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
			System.out.println("Inserisci cilindrata: ");
			cilindrata = sc.nextInt();
		}while ((cilindrata != 50) && (cilindrata != 125) && (cilindrata != 600));
	}
	
}
