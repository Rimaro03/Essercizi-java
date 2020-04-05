package rubrica2;
import java.util.*;

public class Contatto2 extends Contatto {

	Scanner sc = new Scanner(System.in);
	
	private String nCasa;
	private String nLavoro;
	private String nCell;
	
	public Contatto2() {
		super();
		this.nCasa = "";
		this.nLavoro = "";
		this.nCell = "";
	}
	
	public Contatto2(String nCasa, String nLavoro, String nCell) {
		super();
		this.nCasa = nCasa;
		this.nLavoro = nLavoro;
		this.nCell = nCell;
	}

	public String getnCasa() {
		return nCasa;
	}

	public void setnCasa(String nCasa) {
		this.nCasa = nCasa;
	}

	public String getnLavoro() {
		return nLavoro;
	}

	public void setnLavoro(String nLavoro) {
		this.nLavoro = nLavoro;
	}

	public String getnCell() {
		return nCell;
	}

	public void setnCell(String nCell) {
		this.nCell = nCell;
	}
	
	public void inserisci() {
		super.inserisci();
		System.out.println("Inserisci numero casa");
		nCasa=sc.nextLine();
		System.out.println("Inserisci numero lavoro");
		nLavoro=sc.nextLine();
		System.out.println("Inserisci numero cellulare");
		nCell=sc.nextLine();
	}
	
	public void visualizza() {
		super.visualizza();
		System.out.println("Numero casa: "+nCasa);
		System.out.println("Numero lavoro: "+nLavoro);
		System.out.println("Numero cellulare: "+nCell);
	}
	
}
