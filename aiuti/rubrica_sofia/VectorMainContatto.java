/**
 * 
 */
package rubrica_sofia;
import java.util.Scanner;

import java.io.*;//importo tutti i file di io
import java.util.ArrayList;
/**
 * @author Sofia
 *
 */
public class VectorMainContatto {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<Contatto> v = new ArrayList(1);



		int i;
		int j;
		boolean s = false;

		while(s==false) {
			int a;
			System.out.println();
			System.out.println("------------------------");
			System.out.println("Inserisci il numero della funzione che vuoi eseguire:");
			System.out.println("1- Inserisci le informazioni del contatto dall'input");
			System.out.println("2- Visualizza la rubrica");
			System.out.println("3- Aggiornamento di un numero di telefono di un contatto");
			System.out.println("4- Eliminazione di un contatto in base al cognome e al nome");
			System.out.println("5- Ricerca del numero di telefono in baase a nome e cognome ");
			System.out.println("6- Visualizza data l'iniziale del cognome");
			System.out.println("0- Esci dal programma");
			System.out.println("------------------------");
			System.out.println();
			a = scan.nextInt();

			scan.nextLine();
			switch (a){

			case 1:
				Contatto c = new Contatto();
				boolean found=true;
				c.inseisci();
				for(i=0;i<v.size(); i++) {
					if ((v.get(i).getNome().equals(c.getNome())==true) && (v.get(i).getCognome().equals(c.getNome())==true)) {
						found = false;
					}
				}

				if (found == true) {
					v.add(c);
				}else System.out.println("Nome e Cognome sono già stati inseriti precedentemente");
				break;

			case 2:

				if (v.size() == 0)
					System.out.println("Non ci sono contatti nella rubrica");
				else {

					for (i=0; i<v.size();i++) {
						v.get(i).visualizza();
						System.out.println();

					}
				}
				break;
			case 3:

				System.out.println("Inserisci il numero da cambiare quindi il numero che vuoi modificare: ");
				String num = scan.nextLine();
				boolean t = false;
				i=0;
				while (i<v.size() && t==false) {
					if (v.get(i).getNumero().equals(num)==true) {
						t=true;
						System.out.println("Inserisci il numero cambiato:");
						String num2 = scan.nextLine();
						v.get(i).setNumero(num2);
						System.out.println();
						System.out.println("Numero modificato");
					}else i++;
				}
				break;
			case 4:
				System.out.println("Inserisci nome del contatto da cancellare:");
				String aa = scan.nextLine();
				System.out.println("Inserisci il cognome del contatto che vuoi cancellare");
				String aaa = scan.nextLine();
				boolean cc = false;
				i = 0;
				while (i<v.size() && cc == false) {
					if(v.get(i).getNome().equals(aa)==true && v.get(i).getCognome().equals(aaa)==true) {
						cc = true;
						v.remove(i);
						System.out.println();
						System.out.println("Numero cancellato");
					}else i++;
				}
				break;



			case 5:
				System.out.println("Inserisci nome da cercare");
				String nom = scan.nextLine();
				System.out.println("Inserisci cognome da cercare");
				String cogn = scan.nextLine();

				i = 0;
				boolean trovato = false;
				while (i<v.size() && trovato == false) {
					if (v.get(i).getNome().equals(nom)==true && v.get(i).getCognome().equals(cogn)==true) {
						trovato = true;
					}else i++;
				}

				if (trovato == true) {
					System.out.println("Il numero è: " +v.get(i).getNumero());
				}else System.out.println("Il contatto non esiste");
				break;
			case 6:
				System.out.println("Inserisci la lettera da cercare:");
				String lett = scan.nextLine();
				for(i=0;i<v.size();i++) {
					if(v.get(i).getCognome().indexOf(lett)==0) {
						System.out.println("Ecco i contatti che iniziano con la lettera cercata");
						v.get(i).visualizza();
						System.out.println();
					}else System.out.println("Non ci sono contatti il cui cognome inizia con questa lettera");
				}
				break;
			case 0: 
				System.out.println("Sei uscito dal programma");
				s=true;
				break;



			}
		}

	}

}
