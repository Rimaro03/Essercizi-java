package vettore_misto;
import java.util.Scanner;

/*
 * da mettere
 * 
 * Elenco:
 * 	- Costruttore di default -> Rettangolo()
 * 	- Costruttore con 2 parametri -> Rettangolo(base, altezza)
 * 	- SET/GET setBase(b), setAltezza(a), getBase(), getAltezza()
 * 	- Metodo visualizza()
 * 	- Metodo calcoloArea()
 * 	- Metodo calcoloPerimetro()
 */

public class Rettangolo {

	//Attributi
	private int base;
	private int altezza;

	//Costruttori	-> NB: non ci devono essere visualizzazioni
	//				-> NB: non ha input o interazioni con utente

	//Costruttore di default
	public Rettangolo() {
		base=0;
		altezza=0;
	}

	//Parametri: b=base a=altezza
	public Rettangolo(int b, int a) {
		base=b;  
		altezza=a;
	}

	//Metodi

	// Metodi SET
	public void setBase(int b) {
		if(b>=0)
			base = b;
		else 
			base=0;
	}

	public void setAltezza(int a) {
		if(a>=0)
			altezza = a;
		else
			altezza = 0;
	}

	// Metodi GET	->	NB non ci devono essere visualizzazioni!
	public int getBase() {
		return base;	// Restituisce la base del rettangolo
	}

	public int getAltezza() {
		return altezza;	// Restituisce l'altezza del rettangolo
	}

	// Inserisci base
	public void inserisci() {
		Scanner scan = new Scanner(System.in);

		int b;
		do {
			System.out.println("Inserisci la base: ");
			b = scan.nextInt();
		} while (b < 0);
		setBase(b);

		int a;
		do {
			System.out.println("Inserisci l'altezza: ");
			a = scan.nextInt();
		} while (a < 0);
		setBase(a);
	}

	// Visualizza base
	public void visualizzaBase() {
		System.out.println("La base è : " + base);
	}

	// Visualizza altezza
	public void visualizzaAltezza() {
		System.out.println("L'altezza è : " + altezza);
	}

	// Metodo visualizza	
	public void visualizza() {
		visualizzaBase();
		visualizzaAltezza();
		visualizzaArea();
		visualizzaPerimetro();
	}

	// Metodo calcolo area
	public int calcoloArea() {
		int area=base*altezza;	//area -> variabile locale (vive solo li' dentro)
		return area;
	}

	// Metodo visualizza area
	public void visualizzaArea() {
		System.out.println("L'area è: " + calcoloArea());
	}

	// Metodo calcolo perimetro
	public int calcoloPerimetro() {
		int perimetro=2*(base+altezza);
		return perimetro;
	}

	// Metodo visualizza perimetro
	public void visualizzaPerimetro() {
		System.out.println("Il perimetro è : " + calcoloPerimetro());
	}

	// Metodo toString()
	// converte esplicitamente un oggetto (reattangolo) -- > una String
	public String toString() {
		String s="";

		s = s + "\n--  Rettangolo --";
		s = s + "\nBase      = " + base;
		s = s + "\nAltezza   = " + altezza;
		s = s + "\nPerimetro = " + calcoloPerimetro();
		s = s + "\nArea      = " + calcoloArea();
		s = s + "\n";

		
//		s = s + "Rettangolo [Base = " + base + "] [Altezza = " + altezza + "] [Perimetro = " + calcoloPerimetro() + "] [Area = " + calcoloArea() + "]\n";
		
		
		
		return s;
	}


}
