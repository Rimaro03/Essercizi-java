/*autore: leonardo ongaro
 * versione 3.0
 * data inizio 25/02/2020
 * data fine 07/03/2020
 */
package rubrica2;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Rubrica c = new Rubrica();

		System.out.println("Vuoi creare una nuova rubrica?");
		String s = sc.nextLine();
		if(s.equalsIgnoreCase("si")){
			c.nuovo();
		}
		else {
			c.inizio();
			System.out.println("Rubrica attuale:");
			c.visualizzaTutto();
		}

		String r;

		do {
			int a;

			System.out.println("----------------------------");
			System.out.println("1-Inserisci contatto");
			System.out.println("2-Visualizza la rubrica");
			System.out.println("3-Aggiorna numero");
			System.out.println("4-Elimina un contatto");
			System.out.println("5-Ricerca del numero di telefono");
			System.out.println("6-Ricerca per nome");
			System.out.println("7-Ricerca per cognome");
			System.out.println("8-Ricerca per telefono");
			System.out.println("9-Ricerca per mail");
			System.out.println("10-Ricerca per prima lettera del cognome");
			System.out.println("----------------------------");

			System.out.print("Scegli: ");
			a = sc.nextInt();

			switch (a) {
			case 1:
				c.inserisciContatto();
				break;

			case 2:
				c.visualizzaTutto();
				break;

			case 3:
				c.aggiorna();
				break;

			case 4:
				c.elimina();
				break;

			case 5:
				c.ricerca();
				break;

			case 6:
				c.ricercaNome();
				break;

			case 7:
				c.ricercaCognome();
				break;

			case 8:
				c.ricercaTel();
				break;

			case 9:
				c.ricercaMail();
				break;

			case 10:
				c.lettera();
				break;

			case 11:
				c.inizio();
				break;
			default:
				break;
			}

			sc.nextLine();
			System.out.println();
			System.out.println("Fare altro?");
			r = sc.nextLine();
			System.out.println();
		} while (r.equalsIgnoreCase("si"));
	}

}