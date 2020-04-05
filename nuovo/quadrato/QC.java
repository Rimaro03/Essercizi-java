package quadrato;
/**
 * La classe QC eredita dalla superclasse Quadrato
 * @author 3AI
 */
public class QC extends Quadrato{

	String colore;

	public QC() {
		super();
		colore="bianco";
	}

	public QC(int lato, String colore) {
		super(lato);	//Richiamo il costruttore con parametri del quadrato
		this.colore=colore;
	}
	
	//overriding
	public void visualizzaQC() {
		super.visualizza();
		System.out.println("Il colore è "+colore);
		
	}
	
	@Override
	public String toString() {
		return "QC [colore=" + colore + ", Lato=" + getLato()+"]";
	}
	
	public boolean equals(QC qc) {
		System.out.println("siamo nel QC");
		if(this.colore.equals(qc.colore) && super.equals(qc)) {
			return true;
		}
		else {
			return false;
		}
			
	}
}
