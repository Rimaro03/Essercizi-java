package vettore_misto;
//Data:19-01-2020
//Esercizio: calcolare area e perimetro del cerchio.

import java.util.Scanner;
public class Cerchio {

	//Attributi

	public int raggio;


	//Costruttore
	Cerchio(){

		raggio = 0;  //Questa e la variabile globale

	}

	
	public Cerchio(int raggio) {
		if(raggio>=0)
			this.raggio = raggio;
		else 
			this.raggio = 0;
	}

	// costruttore di copia
	// crea un nuovo cerchio uguale a quello passato come parametro
	public Cerchio(Cerchio cer) {
		
		this.raggio = cer.raggio;
		
	}
	
	
	
	//Metodi

	//Visualizzo il raggio del cerchio
	public void visualizza(){
//		System.out.println("Il raggio del cerchio è        : " + raggio);
//		System.out.println("L'area del cerchio è           : " + calcoloArea());
//		System.out.println("La circonferenza del cerchio è : " + calcoloCirconferenza());
		System.out.printf("\nIl raggio del cerchio è        %7d     ", raggio);
		System.out.printf("\nL'area del cerchio è           %7.2f   ", calcoloArea());
		System.out.printf("\nLa circonferenza del cerchio è %7.2f \n", calcoloCirconferenza());
		
		
	}

	
	
    // set / get
		
	public int getRaggio() {
		return raggio;
	}


	public void setRaggio(int raggio) {
		this.raggio = raggio;
	}
	
	
	
	
	public double calcoloArea() {

		double area;
		area = Math.PI * raggio * raggio;

		return (area);
	}




	public double calcoloCirconferenza() {

		double circonferenza;
		circonferenza = Math.PI * raggio * 2;

		return(circonferenza);

	}






	//inserimento dall'input
	public void inserimento() {
		Scanner tastiera = new Scanner(System.in);

		System.out.println("inserisci il raggio: ");
		raggio = tastiera.nextInt();

		while (raggio <= 0) {
			System.out.println("Inserisci un raggio > 0: ");
			raggio = tastiera.nextInt();
		}
	}

}
