package negozio;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vestiti vest1 = new Vestiti();
		Vestiti vest2 = new Vestiti();
		int i;
		final int DIM = 2;
		Vestiti armadio[] = new Vestiti[DIM];
		Vestiti nuovo[] = new Vestiti[DIM];
		
		//vestito 1
		vest1.setMarca("Benetton");
		vest1.setModello("Primavera Uomo");
		vest1.setTaglia("M");
		vest1.setQuantita(40);
		vest1.setPrezzo(25);
		System.out.println(vest1.toString());
		
		//vestito 2
		vest2.setMarca("Nike");
		vest2.setModello("Sport1");
		vest2.setTaglia("L");
		vest2.setQuantita(25);
		vest2.setPrezzo(46);
		System.out.println(vest2.toString());
		
		vest1.vende(10);
		System.out.println("Sono rimasti "+vest1.getQuantita()+" capi");
		
		vest2.sconto(5);
		System.out.println("Il prezzo scontato è "+vest2.getPrezzo());
		
		for(i=0; i<DIM; i++) {
			Vestiti ve = new Vestiti();
			ve.inserisci();
			armadio[i]=ve;
			System.out.println("Capo registrato!");
			System.out.println();
		}
		
		for(i=0; i<DIM; i++) {
			if(armadio[i].getPrezzo() > 100) {
				armadio[i].visualizza();
			}
		}
		
		for(i=0; i<DIM; i++) {
			if(armadio[i].scorta(10)==true) {
				System.out.println("La merce sta per finire");
			}
		}
		
		for(i=0; i<DIM; i++) {
			armadio[i].sconto(30);
			System.out.println("Il prezzo scontato è "+armadio[i].getPrezzo());
		}
		
		for(i=0; i<DIM; i++) {
			Vestiti ve = new Vestiti();
			ve.inserisci();
			nuovo[i]=ve;
			System.out.println("Capo registrato!");
			System.out.println();
		}
		
		for(i=0; i<DIM; i++) {
			if(armadio[i].getMarca().equalsIgnoreCase(nuovo[i].getMarca()) && armadio[i].getModello().equalsIgnoreCase(nuovo[i].getModello()) && armadio[i].getTaglia().equalsIgnoreCase(nuovo[i].getTaglia())) {
				armadio[i].setQuantita(armadio[i].getQuantita()+nuovo[i].getQuantita());
				armadio[i].setPrezzo(nuovo[i].getPrezzo());
				armadio[i].visualizza();
			}
		}
	}

}
