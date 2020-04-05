package veicoli;
public class Garage {

	private VeicoloAMotore v[];
	private int nPostiLiberi = 0;
	
	public Garage() {
		v = new VeicoloAMotore[5];
	}
	public void imettiNuovoVeicolo(String s,VeicoloAMotore v1) {
		if (nPostiLiberi < 5) {
			int i;
			if (s.toLowerCase().equalsIgnoreCase("auto")) {
				v1 = new Automobile();
				v1.inserisci();
				for (i = 0; i<5; i++) {
					if (v[i] == null) {
						v[i] = v1;
						break;
					}
				}
				nPostiLiberi++;
			}
			else if (s.toLowerCase().equalsIgnoreCase("moto")) {
				v1 = new Motocicletta();
				v1.inserisci();
				for (i = 0; i<5; i++) {
					if (v[i] == null) {
						v[i] = v1;
						break;
					}
				}
				nPostiLiberi++;
			}
			else {
				v1 = new Furgone();
				v1.inserisci();
				for (i = 0; i<5; i++) {
					if (v[i] == null) {
						v[i] = v1;
						break;
					}
				}
				nPostiLiberi++;
			}
		}
		else
			System.out.println("Il garage è pieno");
	}

	public void estraiVeicolo (int posto) {
		v[posto] = null;
		nPostiLiberi--;
	}
	
	public void stampaSituazionePosti() {
		int i;
		for (i = 0; i<5; i++) {
			if (v[i] != null)
				v[i].toString();
			else
				System.out.println("Posto libero");
		}
	}
	
	public void postiLiberi() {
		System.out.println("I posti liberi totali sono: " + (5 - nPostiLiberi));
	}
	
	
}
