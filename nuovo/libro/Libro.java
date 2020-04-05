package libro;

import java.util.Scanner;

public class Libro {

	private String titolo;
	private String autore;
	private String editore;
	private double prezzo;


	public Libro() {
		titolo = "";
		autore = "";
		editore ="";
		prezzo = 0;

	}

	public Libro(String titolo, String autore, String editore, double prezzo) {
		this.titolo = titolo;
		this.autore = autore;
		this.editore = editore;

		if (prezzo < 0) {
			this.prezzo = 0;
		}
		else 
			this.prezzo = prezzo;
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

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		if (prezzo < 0) {
			this.prezzo = 0;
		}
		else 
			this.prezzo = prezzo;
	}
	
	public void inserisci() {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci il titolo: ");
		titolo = tastiera.nextLine();
		System.out.println("Inserisci l'autore: ");
		autore = tastiera.nextLine();
		System.out.println("Inserisci l'editore: ");
		editore = tastiera.nextLine();
		
		
		
		do {
			System.out.println("Inserisci il prezzo: ");
			prezzo = tastiera.nextDouble();
		}
		while(prezzo<0);
	}
	
	public void visualizza() {
		System.out.println("titolo: " + titolo);
		System.out.println("autore: " + autore);
		System.out.println("casa editrice: " + editore);
		System.out.println("prezzo: " + prezzo);
	}
	
	
	
}