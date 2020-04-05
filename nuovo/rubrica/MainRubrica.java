package rubrica;
import java.util.*;
public class MainRubrica {
	public static void main(String[] args) {

		Scanner loli = new Scanner(System.in);

		final int DIM = 2;
		Contatto rubrica[] = new Contatto[DIM];
		int i;
		boolean trovato = false;

		for(i=0;i<DIM;i++) {
			Contatto l = new Contatto();
			l.inserisci();
			rubrica[i] = l;
			System.out.println("Contatto registrato!");
			System.out.println();

		}
		
		for(i=0;i<DIM;i++) {
			rubrica[i].visualizza();
			System.out.println();
		}

		loli.nextLine();
		System.out.print("Inserire cell: ");
		String telIns = loli.nextLine();
		trovato=false;
		for(i=0; i<DIM; i++) {
			if(rubrica[i].gettel().equalsIgnoreCase(telIns)==true) {
				trovato=true;
				break;
			}
		}

		if(trovato) {
			rubrica[i].visualizza();
		}
		else {
			System.out.println("Non ho trovato il contatto");
		}

		loli.nextLine();
		System.out.print("Inserisci il nome: ");
		String nomeIns = loli.nextLine();
		System.out.print("Inserisci il cognome: ");
		String cognomeIns = loli.nextLine();
		trovato=false;
		for(i=0; i<DIM; i++) {
			if((rubrica[i].getnome().equalsIgnoreCase(nomeIns)==true)&&(rubrica[i].getcognome().equalsIgnoreCase(cognomeIns)==true)) {
				trovato=true;
				break;
			}
		}

		if(trovato) {
			rubrica[i].visualizza();
		}
		else {
			System.out.println("Non ho trovato il contatto");
		}
		 
		loli.nextLine();
		System.out.print("Inserisci parte del nome: ");
		String no = loli.nextLine();
		trovato=false;
		for(i=0; i<DIM; i++) {
			if(rubrica[i].getnome().contains(no)) {
				trovato=true;
			}
			if(trovato) {
				rubrica[i].visualizza();	
			}


		}
	}
}

