/*autore: leonardo ongaro
 * versione 3.0
 * data inizio 25/02/2020
 * data fine 07/03/2020
 */
package rubrica3;
import java.io.*;
import java.util.*;

public class Rubrica implements Serializable{

	Vector <Contatto> v = new Vector <Contatto>();
	boolean p;

	public void inizio() {
		try {
			FileInputStream fi = new FileInputStream("rubrica.dat");
			ObjectInputStream ois = new ObjectInputStream(fi);

			// lettura dal file
			Object ob = ois.readObject();	

			// casting
			Vector classe = (Vector)ob;

			ois.close();
		}  catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	//Metodo per inserire un nuovo contatto con controllo che non esista già
	public void inserisciContatto() {
		p=false;
		Contatto c = new Contatto();
		c.inserisci();
		System.out.println(c);
		int d = v.size();
		if(d<=0) {
			v.add(c);
			try {
				FileOutputStream fo = new FileOutputStream("rubrica.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fo);

				// scrittura su file
				// si salva tutto con una sola istruzione
				oos.writeObject(v);

				oos.flush();
				oos.close();

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			for(int i=0; i<d; i++) {
				if(c.getNome().equalsIgnoreCase(((Contatto) v.get(i)).getNome()) && c.getCognome().equalsIgnoreCase(((Contatto) v.get(i)).getCognome()) && c.getTel().equalsIgnoreCase(((Contatto) v.get(i)).getTel()) && c.getMail().equalsIgnoreCase(((Contatto) v.get(i)).getMail())) {
					p=false;
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
				String nomeFile = "rubrica.dat";
				System.out.println("Inizio scrittura sul file "+ nomeFile);
				try {
					FileOutputStream fo = new FileOutputStream("rubrica.dat");
					ObjectOutputStream oos = new ObjectOutputStream(fo);

					// scrittura su file
					// si salva tutto con una sola istruzione
					oos.writeObject(v);

					oos.flush();
					oos.close();

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
		//((Contatto) v.get(i)).visualizza();
		System.out.println();
		try {
			FileInputStream fi = new FileInputStream("rubrica.dat");
			ObjectInputStream ois = new ObjectInputStream(fi);

			// lettura dal file
			Object ob = ois.readObject();	

			// casting
			Vector classe = (Vector)ob;

			System.out.println("Lettura: " + classe);

			ois.close();
		}  catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
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
				((Contatto) v.get(i)).toString();
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
				((Contatto) v.get(i)).toString();
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
				((Contatto) v.get(i)).toString();
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
				((Contatto) v.get(i)).toString();
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
				((Contatto) v.get(i)).toString();
				break;
			}
		}
	}
	//La visualizzazione ordinata non sono riuscito a farla

	public void nuovo() {
		File nomeFile = new File("Contatto.txt");

		if(nomeFile.exists()) //se esiste...
		{
			System.out.println("Il file esiste");
			if(nomeFile.delete()) //prova a eliminarlo...
				System.out.println("Fileinato!"); //e conferma...
		}
		else
		{
			System.out.println("Il non esiste!");//altrimenti avverte l'utente
		}
	}

}
