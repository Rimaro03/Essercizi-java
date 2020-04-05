package programmazione_oggetti;
/*
 * Descizione: classe quadrato
 * Autore: Leonardo Ongaro
 * Data: 14 01 2020
 * Versione: 0.1
 */
public class Rettangolo {
	
	//Attributi
	private int base;
	private int altezza;// Dichiarazione del lato del quadrato
	
	//Costruttori (sono opzionali ma consigliabili)

	/*Costruttore di default: inizializza l'oggetto con valori standard
	 *Ha lo stesso nome dell'oggetto
	 *Non deve dare nula in output
	 *Non ha "void" o tipo di dato
	*/
	public Rettangolo() {
		base=0;
		altezza=0;
	}

	//Costruttore con parametri: passo il lato(int)
	//Si chiama overloading dei metodi
	//Quando ci sono metodi con lo stesso nome ma parametri diversi
	
	public Rettangolo(int b, int a){	// l=2 l variabile locale
		base=b;
		altezza=a;
	}
	
	//Metodi
	
	//Visualizza il lato del quadrato
	public void visualizza(){
		System.out.println("La base è " + base);
		System.out.println("L'altezza è " + altezza);
	}
	
	// Calcolo area quadrato e la restituisce
	public int calcolaArea(){
		int area;				// Variabile locale
		area = base*altezza;		// Lato è una variabile globale
		return area;
	}
	public int calcolaPerimetro(){
		int perimetro;				// Variabile locale
		perimetro = 2*(base+altezza);		// Lato è una variabile globale
		return perimetro;
	}
	public void setBase(int b) {
		base = b;
	}
	
	public void setAltezza(int a) {
		altezza = a;
	}
	
	public int getBase() {
		return base;
	}

	public int getAltezza() {
		return altezza;
	}
}
