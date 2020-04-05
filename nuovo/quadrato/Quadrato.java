package quadrato;
/*
 * Descrizione: classe quadrato
 * Autore: Cognome nome
 * Data: 14 01 2020
 * Versione: 0.1
 */
import java.util.Scanner;
public class Quadrato {
	
	// Attributi
	
	// Attributi privati -> private
	// Possono essere utilizzati solo all'interno della classe
	// Metodi pubblici -> public
	// Possono essere usati ovunque
	private int lato;	// Dichiarazione lato quadrato
	
	// Costruttori
	
	/* Costruttore di default: inizializza l'oggetto
	*/
	public Quadrato() {
		lato = 0;
	}
	
	/* Costruttore 2 con un parametro: passo il lato (int)
	   Si chiama OVERLOADING DEI METODI: quando ci sono
	   metodi con lo stesso nome ma parametri diversi
	 */
	public Quadrato(int l) {	// l = 2	l variabile locale
		lato = l;
	}
	
	// Metodi
	
	public int getLato() {
		return lato;
	}

	public void setLato(int lato) {
		this.lato = lato;
	}

	// Visualizza il lato del quadrato
	public void visualizza() {
		System.out.println("Il lato del quadrato e': " + lato);
	}
	
	// Calcola l'area del quadrato
	// Restituisce l'area del quadrato
	public int calcolaArea() {
		int area;	// Variabile locale
		area = lato * lato;
		
		return area;
	}
	
	//Visualizza Area
	public void visualizzaArea() {
		
		System.out.println("L'area e': "+ calcolaArea());
		
	}
	
	//Metodo inserimento dall'input
	//Lo Scanner si inserisce all'interno del metodo
	
	public void inserimento() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Inserisci il lato del quadrato: ");
		lato=scan.nextInt();
		while(lato<0) {											//Controllo se il lato è >=0
			System.out.println("Reinserisci il lato >= 0:");	
			lato=scan.nextInt();
		}
	}
	// Main
	// trasferito in Main.java
	
	public boolean equals(Quadrato q) {
		if(this.lato == q.lato)
			return true;
		else
			return false;
	}
}
