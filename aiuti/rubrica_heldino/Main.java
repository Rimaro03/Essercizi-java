package rubrica_heldino;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;


public class Main {
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		ArrayList<Contatto> v = new ArrayList();
		int a;
		PrintWriter pw;
		String nomeFile="Rubrica.txt";

		try {
			String linea;
			FileInputStream fin;

			fin = new FileInputStream(nomeFile);

			Scanner n=new Scanner(fin);

			while(n.hasNextLine())	
			{
				linea=n.nextLine();

				String elementi[]=linea.split(";");
				String nome=elementi[0];
				String cognome=elementi[1];
				String numero=elementi[2];
				String email=elementi[3];
				System.out.println("nome=" + nome);
				System.out.println("cognome=" + cognome);
				System.out.println("numero=" + numero);
				System.out.println("email=" + email);
				System.out.println();

				Contatto c= new Contatto(nome,cognome,numero,email);
				v.add(c);
			}
			System.out.println();
		}catch (FileNotFoundException e) {
			System.out.println(" --- Devi ancora creare il file --- ");
			System.out.println();
		}
		
		do {


			System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
			System.out.println("1. Inserisci contatto");
			System.out.println("2. Visualizza  rubrica");
			System.out.println("3. Aggiorna un numero");
			System.out.println("4. Elimina un contatto");
			System.out.println("5. Ricerca del numero di telefono");
			System.out.println("6. Ricerca per nome");
			System.out.println("7. Ricerca per cognome");
			System.out.println("8. Ricerca per telefono");
			System.out.println("9. Ricerca per mail");
			System.out.println("10. Ricerca per prima lettera del cognome");
			System.out.println("0. Uscire");
			System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

			System.out.print("Scegli: ");
			a = kb.nextInt();

			switch (a) {
			case 1:

				boolean nuovo=false;
				Contatto c = new Contatto();
				c.inserisci();
				int size = v.size();
				if( size==0 ) {
					v.add(c);
				}
				else {
					for(int i=0; i < size; i++) {
						if(c.getNome().equalsIgnoreCase(((Contatto) v.get(i)).getNome()) && c.getCognome().equalsIgnoreCase(((Contatto) v.get(i)).getCognome()) && c.getNum().equalsIgnoreCase(((Contatto) v.get(i)).getNum()) && c.getMail().equalsIgnoreCase(((Contatto) v.get(i)).getMail())) {
						}
						else {
							nuovo=true;
						}
					}
					if(nuovo==false) {
						System.out.println("Il contatto esiste già");
					}
					else {
						v.add(c);
					}
				}
				break;

			case 2:
				int d = v.size();
				if(d==0) {
					System.out.println("Rubrica vuota");
				}
				for(int i=0; i<d; i++) {
					((Contatto) v.get(i)).visualizza();
					System.out.println();
				}

				
				break;

			case 3:
				size = v.size();
				for(int i=0; i<size; i++) {
					String cog,nom;
					System.out.println("Inserisci il cognome da cercare: ");
					cog=kb.nextLine();
					System.out.println("Inserisci il nome da cercare: ");
					nom=kb.nextLine();
					if(nom.equalsIgnoreCase(((Contatto) v.get(i)).getNome()) && cog.equalsIgnoreCase(((Contatto) v.get(i)).getCognome())) {
						System.out.println("Inserire il nuovo numero: ");
						String t = kb.nextLine();
						((Contatto) v.get(i)).setNum(t);
						break;
					}
				}
				break;

			case 4:
				size = v.size();
				for(int i=0; i<size; i++) {
					System.out.println("Inserisci il cognome: ");
					String cog=kb.nextLine();
					System.out.println("Inserisci il nome: ");
					String nom=kb.nextLine();
					if(nom.equalsIgnoreCase(((Contatto) v.get(i)).getNome()) && cog.equalsIgnoreCase(((Contatto) v.get(i)).getCognome())) {
						v.remove(i);
						break;
					}

				}
				break;

			case 5:
				size = v.size();
				for(int i=0; i<size; i++) {
					String cog,nom;
					System.out.println("Inserisci il cognome: ");
					cog=kb.nextLine();
					System.out.println("Inserisci il nome: ");
					nom=kb.nextLine();
					if(nom.equalsIgnoreCase(((Contatto) v.get(i)).getNome()) && cog.equalsIgnoreCase(((Contatto) v.get(i)).getCognome())) {
						System.out.println("Il telefono è : "+((Contatto) v.get(i)).getNum());
						break;
					}
				}
				break;

			case 6:
				size = v.size();
				for(int i=0; i<size; i++) {
					String nom;
					System.out.println("Inserire il nome da cercare: ");
					nom=kb.nextLine();
					if(nom.equalsIgnoreCase(((Contatto) v.get(i)).getNome())) {
						((Contatto) v.get(i)).visualizza();
						break;
					}
				}
				break;

			case 7:
				size = v.size();
				for(int i=0; i<size; i++) {
					String cog;
					System.out.println("Inserire il cognome da cercare: ");
					cog=kb.nextLine();
					if(cog.equalsIgnoreCase(((Contatto) v.get(i)).getCognome())) {
						((Contatto) v.get(i)).visualizza();
						break;
					}
				}
				break;

			case 8:
			 size = v.size();
				for(int i=0; i<size; i++) {
					String t;
					System.out.println("Inserire il numero da cercare: ");
					t=kb.nextLine();
					if(t.equalsIgnoreCase(((Contatto) v.get(i)).getNum())) {
						((Contatto) v.get(i)).visualizza();
						break;
					}
				}
				break;

			case 9:
				 size = v.size();
				for(int i=0; i<size; i++) {
					String m;
					System.out.println("Inserire la mail da cercare: ");
					m=kb.nextLine();
					if(m.equalsIgnoreCase(((Contatto) v.get(i)).getMail())) {
						((Contatto) v.get(i)).visualizza();
						break;
					}
				}
				break;

			case 10:
				 size = v.size();
				for(int i=0; i<size; i++) {
					String l;
					System.out.println("Inserire la lettera da ricercare: ");
					l=kb.nextLine();
					char m=l.charAt(0);
					if(((Contatto) v.get(i)).getCognome().charAt(0)==m) {
						((Contatto) v.get(i)).visualizza();
						break;
					}else {
						System.out.println("Non trovato");
					}
				}
				break;

			default:
				System.out.println("Selezione non valida");
				break;
			}


		} while (a!=0);
		
		
		//salvare
		
	}

}