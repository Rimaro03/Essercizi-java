package veicoli;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		VeicoloAMotore v = new VeicoloAMotore();
		
		v.postiLiberi();
		
		String s;
		do {
			System.out.println("Cosa inserire?");
			System.out.println("Auto");
			System.out.println("Furgone");
			System.out.println("Moto");
			s = sc.nextLine();
		}while((s.toLowerCase().equals("auto") == false) && (s.toLowerCase().equals("furgone") == false) && (s.toLowerCase().equals("moto") == false));
		
		VeicoloAMotore v1 = new VeicoloAMotore();
		
		v.imettiNuovoVeicolo(s,v1);
		
		v.stampaSituazionePosti();

		v.postiLiberi();
		
		v.estraiVeicolo(0);
		
		v.stampaSituazionePosti();
		
		v.postiLiberi();
	}

}
