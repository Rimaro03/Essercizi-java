package rubrica_mattia;

import java.util.*;

//import FileDiOggetti.ClasseDiAlunniSerializableVector;

import java.io.*;

public class RubricaMain {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		Vector<Contatto> v = new Vector<Contatto>();
		String nomeFile = "";
		int n,i; 
		boolean a = false;


		do {
			System.out.println("0-Uscita");
			System.out.println("1-Inserisci nuovo contatto");
			System.out.println("2-Visualizza contatti");
			System.out.println("3-Aggiorna numero di telefono");
			System.out.println("4-Eliminazione di un contatto");
			System.out.println("5-Ricerca attarverso nome e cognome");
			System.out.println("Cosa eseguire ?");
			n = sc.nextInt();
			switch (n) {
			case 0: System.out.println("Uscita");
			a = true;

			break;

			case 1: System.out.println("Inserimento contatto: ");
			boolean b;

			Contatto c = new Contatto();

			try {
				FileOutputStream fo = new FileOutputStream("objectRubrica.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fo);

				do {

					String s = "";
					b = false;

					c.inserimento();

					for (i = 0; i<v.size(); i++) {

						if ((c.getNome().equalsIgnoreCase(v.get(i).getNome()) && (c.getCognome().equalsIgnoreCase(v.get(i).getCognome()) && (c.getNtelefono().equalsIgnoreCase(v.get(i).getNtelefono()))))) {

							System.out.println("Il numero è gia esistente");
							b = true;
						}
					}


				}while(b == true);

				v.add(c);

				String s1 = c.getNome() + "," + c.getCognome() + "," + c.getNtelefono() + "," + c.getMail() + ",";

				oos.writeObject(v);

				oos.flush();
				oos.close();

				System.out.println("Numero inserito!");

			} catch (FileNotFoundException e) {

				System.out.println("Eccezione " + e);
				e.printStackTrace();

			}catch (IOException e) {

				System.out.println("Eccezione " + e);
				e.printStackTrace();

			}

			break;
			case 2: System.out.println("Visualizzazzione contatti: ");
			try {

				FileInputStream fi = new FileInputStream("objectRubrica.dat");
				ObjectInputStream ois = new ObjectInputStream(fi);

				Object ob = ois.readObject();

				if (v.size() == 0)
					System.out.println("Non ci sono contatti");
				else {

					Vector classe = (Vector)ob;

					System.out.println("Lettura: " + classe);

					ois.close();
				}
			} catch (ClassNotFoundException e) {

				System.out.println("Eccezione " + e);
				e.printStackTrace();

			}catch (FileNotFoundException e) {

				System.out.println("Eccezione " + e);
				e.printStackTrace();

			}catch (IOException e) {

				System.out.println("Eccezione " + e);
				e.printStackTrace();

			}

			break;

			case 3: System.out.println("Aggiornamento numero contatto: ");
			try {

				FileOutputStream fo = new FileOutputStream("objectRubrica.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fo);

				sc.nextLine();

				Contatto c3 = new Contatto();
				Contatto c4 = new Contatto();

				boolean bol = false;
				String s,s1;

				if (v.size() == 0)
					System.out.println("Non ci sono contatti in rubrica");
				else {
					do {

						System.out.println("Inserisci numero della persona a cui cambiare il numero: ");
						s = sc.nextLine();

					}while(c3.controlloPresenzaLettere(s));

					c3.setNtelefono(s);

					do {

						System.out.println("Inserisci numero nuovo: ");
						s1 = sc.nextLine();

					}while(c4.controlloPresenzaLettere(s1));

					c4.setNtelefono(s1);

					String s2 = "";

					for (i = 0; i<v.size(); i++) {

						if (v.get(i).getNtelefono().equals(s)) {

							v.get(i).setNtelefono(s1);
							System.out.println("Numero di telefono aggiornato");
							bol = true;

						}

					}

					oos.writeObject(v);

					if (bol == false)
						System.out.println("Il numero di telefono da cambiare non esiste in rubrica");

					oos.flush();
					oos.close();
				}

			}catch (FileNotFoundException e) {

				System.out.println("Eccezione " + e + ", il file non è stato trovato");
				e.printStackTrace();

			}catch(IOException e) {

				System.out.println("Eccezione " + e);
				e.printStackTrace();

			}

			break;

			case 4: System.out.println("Eliminazione contatto: ");
			try {
				FileOutputStream fo = new FileOutputStream("objectRubrica.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fo);



				Contatto c2 = new Contatto();

				sc.nextLine();

				String s2,s3;

				if (v.size() == 0)
					System.out.println("Non ci sono contatti in rubrica");
				else {
					do {

						System.out.println("Inserisci nome della persona da cancellare: ");
						s2 = sc.nextLine();

					}while(c2.controlloPresenzaNumeri(s2) == true);

					c2.setNome(s2);

					do {

						System.out.println("Inserisci cognome della persona da cancellare: ");
						s3 = sc.nextLine();

					}while(c2.controlloPresenzaNumeri(s3) == true);

					c2.setCognome(s3);

					String s = "";

					for (i = 0; i<v.size(); i++) {
						if ((v.get(i).getNome().equalsIgnoreCase(c2.getNome())) && (v.get(i).getCognome().equalsIgnoreCase(c2.getCognome()))) {

							v.remove(i);
							System.out.println("Numero di telefono rimosso");

						}
					}
					oos.writeObject(v);

					oos.flush();
					oos.close();
				}

			}catch(IOException e) {

				System.out.println("Eccezione " + e);
				e.printStackTrace();

			}

			break;

			case 5: System.out.println("Ricerca contatto: ");
			try {

				FileInputStream fi = new FileInputStream("objectRubrica.dat");
				ObjectInputStream ois = new ObjectInputStream(fi);

				Object ob = ois.readObject();

				sc.nextLine();

				Contatto c1 = new Contatto();

				boolean bo = false;
				String s4;

				if (v.size() == 0)
					System.out.println("Non ci sono contatti in rubrica");
				else {
					do {

						System.out.println("Inserisci nome della persona da cercare: ");
						s4 = sc.nextLine();

					}while(c1.controlloPresenzaNumeri(s4) == true);

					c1.setNome(s4);

					String s5;

					do {

						System.out.println("Inserisci cognome della persona da cercare: ");
						s5 = sc.nextLine();

					}while (c1.controlloPresenzaNumeri(s5) == true);

					c1.setCognome(s5);

					for (i = 0; i<v.size(); i++) {

						if ((v.get(i).getNome().equalsIgnoreCase(c1.getNome())) && (v.get(i).getCognome().equalsIgnoreCase(c1.getCognome()))) {
							Vector classe = (Vector)ob;

							System.out.println("Lettura: " + classe);

							bo = true;
						}	
					}

					ois.close();

					if (bo == false)
						System.out.println("Il numero non è presente nella rubrica");
				}
			}catch (ClassNotFoundException e) {

				e.printStackTrace();

			}catch(FileNotFoundException e) {

				System.out.println("Eccezione " + e);
				e.printStackTrace();

			} catch (IOException e) {

				e.printStackTrace();

			} 

			break;

			default: System.out.println("Non esiste nel menu");

			}

		}while(a == false);

	}	
}