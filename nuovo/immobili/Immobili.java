package immobili;
import java.util.*;
public class Immobili {

	Scanner sc = new Scanner(System.in);

	int DIM=500;
	Immobili v[] = new Immobili[DIM];
	int i;

	public void inserisciNegozio() {
		if(DIM>0) {
			Negozi n = new Negozi();
			n.inserisci();
			DIM--;
			System.out.println("Ci sono ancora "+DIM+" posti liberi.");
		}
		else {
			System.out.println("Non c'è più spazio!");
		}
		System.out.println();
	}

	public void inserisciApp() {
		if(DIM>0) {
			Appartamenti a = new Appartamenti();
			a.inserisci();
			DIM--;
			System.out.println("Ci sono ancora "+DIM+" posti liberi.");
		}
		else {
			System.out.println("Non c'è più spazio!");
		}
		System.out.println();
	}

	/*int i;
	public void cerca(int pr) {
		for(i=0; i<DIM; i++) {

		}
	}*/

	public void aggiorna(int agg) {
		System.out.print("Cosa vuoi aggiornare? ");
		String ins = sc.nextLine();
		if(ins.equalsIgnoreCase("casa")) {
			v[agg].inserisciApp();
		}
		else {
			v[agg].inserisciNegozio();
		}
	}


	/*public void elimina(int el) {
		System.out.print("Inserisci il cognome: ");
		String co = sc.nextLine();
		System.out.print("Inserisci il nome ");
		String no = sc.nextLine();
		for(i=0;i<500;i++) {
			if(co.eqalsIgnoreCase(v[i].getCognome()) && no.eqalsIgnoreCase(v[i].getNome()))
				v[i]=null;
		}
	}*/



	public void visualizza() {
		for(i=0;i<500;i++) {
			v[i].visualizza();
			System.out.println();
		}
	}

	public void cerca(int pr) {

	}

	public void elimina() {

	}
}
