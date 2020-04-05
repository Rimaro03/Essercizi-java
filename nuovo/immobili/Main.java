package immobili;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Immobili m = new Immobili();
		int i;
		
		String cont;
		int s;
		
		System.out.println("Cosa voui fare?");
		System.out.println("-----------------------");
		System.out.println("1-Inserisci casa");
		System.out.println("2-Inserisci negozio");
		System.out.println("3-Cerca (In manutenzione)");
		System.out.println("4-Aggiorna qualcosa");
		System.out.println("5-Cancella qualcosa (In manutenzione)");
		System.out.println("6-Visualizza tutti gli immobili");
		System.out.println("-----------------------");
		
		do {
			System.out.print("Scegli: ");
			s=sc.nextInt();
			switch(s) {
			case 1:
				m.inserisciApp();
				break;
			case 2:
				m.inserisciNegozio();
				break;
			case 3:
				System.out.print("Inserire il prezzo: ");
				int pr = sc.nextInt();
				m.cerca(pr);
				break;
			case 4:
				System.out.print("Quale vuoi aggiornare? ");
				int agg = sc.nextInt();
				m.aggiorna(agg);
			case 5:
				m.elimina();
				break;
			case 6:
				m.visualizza();
			}
			sc.nextLine();
			System.out.print("Vuoi fare altro? ");
			cont=sc.nextLine();
			System.out.println();
		}
		while(cont.equalsIgnoreCase("si"));
	}

}
