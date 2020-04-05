package veicoli;
import java.util.Scanner;
public class Furgone extends VeicoloAMotore {

	private String targa;
	private String marca;
	private String modello;
	private int capCarico;
	
	public Furgone() {
		targa = "";
		marca = "";
		modello = "";
		capCarico = 0;
	}

	public Furgone(String targa, String marca, String modello, int capCarico) {
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		this.capCarico = capCarico;
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

	public int getCapCarico() {
		return capCarico;
	}

	public void setCapCarico(int capCarico) {
		if (capCarico > 0)
			this.capCarico = capCarico;
		else
			this.capCarico = 0;
	}

	public String toString() {
		return "Furgone [targa=" + targa + ", marca=" + marca + ", modello=" + modello + ", capCarico=" + capCarico
				+ "]";
	}
	
	public void visualizza() {
		System.out.println("La targa è: " + targa);
		System.out.println("La marca è: " + marca);
		System.out.println("Il modello è: " + modello);
		System.out.println("Il carico del furgone è: " + capCarico);
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
			System.out.println("Inserisci capacità carico: ");
			capCarico = sc.nextInt();
		}while (capCarico <= 0);
	}
	

}
