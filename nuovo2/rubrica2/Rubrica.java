/*autore: leonardo ongaro
 * versione 3.0
 * data inizio 25/02/2020
 * data fine 07/03/2020
 */
package rubrica2;
import java.io.*;
import java.util.*;

public class Rubrica {

	ArrayList v = new ArrayList(2);
	boolean p;

	public void inizio() {
		try {
			File nomeFile = new File("Contatto.txt");
			String linea;
			FileInputStream fin;

			fin = new FileInputStream(nomeFile);

			Scanner in = new Scanner(fin);

			while(in.hasNextLine())
			{
				linea = in.nextLine();
				String st1[] = linea.split(";");
				for(int i=0; i<st1.length; i++) {
					String st2[] = st1[i].split(",");
					for(i=0; i<st2.length; i++) {
						Contatto c = new Contatto();
						c.setCognome(st2[0]);
						c.setNome(st2[1]);
						c.setTel(st2[2]);
						c.setMail(st2[3]);
						v.add(c);
					}
				}

				System.out.println();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//Metodo per inserire un nuovo contatto con controllo che non esista già
	public void inserisciContatto() {
		p=false;
		Contatto c = new Contatto();
		c.inserisci();
		int d = v.size();
		if(d<=0) {
			v.add(c);
			File nomeFile = new File("Contatto.txt");
			PrintWriter pw;
			try {
				FileWriter fw = new FileWriter(nomeFile,true);
				pw=new PrintWriter(fw);
				pw.print(c.getNome()+",");
				pw.print(c.getCognome()+",");
				pw.print(c.getTel()+",");
				pw.println(c.getMail()+";");
				pw.close();
				System.out.println("Scrittura sul file " +  nomeFile + " avvenuta con successo");
			} catch (FileNotFoundException e) {
				//e.printStackTrace();
				System.out.println("Errore: scrittura sul file " +  nomeFile + " interrotta");

			} catch (IOException e) {
				//e.printStackTrace();
				System.out.println("Errore: scrittura sul file " +  nomeFile + " interrotta");

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
				File nomeFile = new File("Contatto.txt");
				System.out.println("Inizio scrittura sul file "+ nomeFile);
				PrintWriter pw;
				try {
					FileWriter fw = new FileWriter(nomeFile,true);
					pw=new PrintWriter(fw);
					pw.print(c.getNome()+",");
					pw.print(c.getCognome()+",");
					pw.print(c.getTel()+",");
					pw.println(c.getMail()+";");
					pw.close();
					System.out.println("Scrittura sul file " +  nomeFile + " avvenuta con successo");
				} catch (FileNotFoundException e) {
					//e.printStackTrace();
					System.out.println("Errore: scrittura sul file " +  nomeFile + " interrotta");

				} catch (IOException e) {
					//e.printStackTrace();
					System.out.println("Errore: scrittura sul file " +  nomeFile + " interrotta");

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

			File nomeFile = new File("Contatto.txt");
			String linea;
			FileInputStream fin;

			fin = new FileInputStream(nomeFile);

			Scanner in = new Scanner(fin);

			String c="",n="",t="",m="";

			while(in.hasNextLine())
			{
				linea = in.nextLine();
				String st1[] = linea.split(";");
				for(int i=0; i<st1.length; i++) {
					String st2[] = st1[i].split(",");
					for(i=0; i<st2.length; i++) {
						c = st2[0];
						n = st2[1];
						t = st2[2];
						m = st2[3];
					}
					System.out.println();
					System.out.println("Cognome="+c);
					System.out.println("Nome="+n);
					System.out.println("Tel="+t);
					System.out.println("Mail="+m);

				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
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
