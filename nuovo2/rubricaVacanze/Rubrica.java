/*autore: leonardo ongaro
 * versione 3.0
 * data inizio 25/02/2020
 * data fine 07/03/2020
 */
package rubricaVacanze;
import java.util.*;

public class Rubrica {

	ArrayList v = new ArrayList(2);
	boolean p;

	//Metodo per inserire un nuovo contatto con controllo che non esista già
	public void inserisciContatto() {
		p=false;
		Contatto2 c = new Contatto2();
		c.inserisci();
		int d = v.size();
		if(d<=0) {
			v.add(c);
		}
		else {
			for(int i=0; i<d; i++) {
				if(c.getNome().equalsIgnoreCase(((Contatto) v.get(i)).getNome()) && c.getCognome().equalsIgnoreCase(((Contatto) v.get(i)).getCognome()) && c.getTel().equalsIgnoreCase(((Contatto) v.get(i)).getTel()) && c.getMail().equalsIgnoreCase(((Contatto) v.get(i)).getMail())) {
				}
				else {
					p=true;
				}
			}
			if(p==false) {
				System.out.println("Il contatto è già esistente!");
			}
			else {
				v.add(c);
			}
		}
	}

	//Metodo per eliminare un contatto
	public void elimina() {
		int d = v.size();
		for(int i=0; i<d; i++) {
			Scanner sc = new Scanner(System.in);
			String c,n;
			System.out.println("Inserisci il cognome: ");
			c=sc.nextLine();
			System.out.println("Inserisci il nome: ");
			n=sc.nextLine();
			if(n.equalsIgnoreCase(((Contatto) v.get(i)).getNome()) && c.equalsIgnoreCase(((Contatto) v.get(i)).getCognome())) {
				v.remove(i);
				break;
			}
			
		}
	}

	//Metodo per cercare il telefono tramite nome e cognome
	public void ricerca() {
		int d = v.size();
		for(int i=0; i<d; i++) {
			Scanner sc = new Scanner(System.in);
			String c,n;
			System.out.println("Inserisci il cognome: ");
			c=sc.nextLine();
			System.out.println("Inserisci il nome: ");
			n=sc.nextLine();
			if(n.equalsIgnoreCase(((Contatto) v.get(i)).getNome()) && c.equalsIgnoreCase(((Contatto) v.get(i)).getCognome())) {
				System.out.println("Il telefono è : "+((Contatto) v.get(i)).getTel());
				break;
			}
		}
	}

	//Metodo per visualizzare l'intera rubrica
	public void visualizzaTutto() {
		int d = v.size();
		for(int i=0; i<d; i++) {
			((Contatto) v.get(i)).visualizza();
			System.out.println();
		}
	}

	//Metodo per aggiornare un numero di telefono
	public void aggiorna() {
		int d = v.size();
		for(int i=0; i<d; i++) {
			Scanner sc = new Scanner(System.in);
			String c,n;
			System.out.println("Inserisci il cognome: ");
			c=sc.nextLine();
			System.out.println("Inserisci il nome: ");
			n=sc.nextLine();
			if(n.equalsIgnoreCase(((Contatto) v.get(i)).getNome()) && c.equalsIgnoreCase(((Contatto) v.get(i)).getCognome())) {
				System.out.println("Inserire il nuovo numero: ");
				String t = sc.nextLine();
				((Contatto) v.get(i)).setTel(t);
				break;
			}
		}
	}

	//Metodo di ricerca per nome
	public void ricercaNome() {
		int d = v.size();
		for(int i=0; i<d; i++) {
			Scanner sc = new Scanner(System.in);
			String n;
			System.out.println("Inserisci il nome: ");
			n=sc.nextLine();
			if(n.equalsIgnoreCase(((Contatto) v.get(i)).getNome())) {
				((Contatto) v.get(i)).visualizza();
				break;
			}
		}
	}

	//Metodo di ricerca per cognome
	public void ricercaCognome() {
		int d = v.size();
		for(int i=0; i<d; i++) {
			Scanner sc = new Scanner(System.in);
			String c;
			System.out.println("Inserisci il cognome: ");
			c=sc.nextLine();
			if(c.equalsIgnoreCase(((Contatto) v.get(i)).getCognome())) {
				((Contatto) v.get(i)).visualizza();
				break;
			}
		}
	}

	//Metodo di ricerca per telefono
	public void ricercaTel() {
		int d = v.size();
		for(int i=0; i<d; i++) {
			Scanner sc = new Scanner(System.in);
			String t;
			System.out.println("Inserisci il telefono: ");
			t=sc.nextLine();
			if(t.equalsIgnoreCase(((Contatto) v.get(i)).getTel())) {
				((Contatto) v.get(i)).visualizza();
				break;
			}
		}
	}

	//Metodo di ricerca per mail
	public void ricercaMail() {
		int d = v.size();
		for(int i=0; i<d; i++) {
			Scanner sc = new Scanner(System.in);
			String m;
			System.out.println("Inserisci la mail: ");
			m=sc.nextLine();
			if(m.equalsIgnoreCase(((Contatto) v.get(i)).getMail())) {
				((Contatto) v.get(i)).visualizza();
				break;
			}
		}
	}
	
	//Metodo di ricerca per prima lettera
	public void lettera() {
		int d = v.size();
		for(int i=0; i<d; i++) {
			Scanner sc = new Scanner(System.in);
			String l;
			System.out.println("Inserisci la lettera: ");
			l=sc.nextLine();
			char m=l.charAt(0);
			if(((Contatto) v.get(i)).getCognome().charAt(0)==m) {
				((Contatto) v.get(i)).visualizza();
				break;
			}
		}
	}
	//La visualizzazione ordinata non sono riuscito a farla
}
