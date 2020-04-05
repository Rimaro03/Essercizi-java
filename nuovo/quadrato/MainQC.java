package quadrato;

public class MainQC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Quadrato q = new Quadrato();
		q.visualizza();
		
		System.out.println();
		
		QC qc = new QC();
		qc.visualizzaQC();
		qc.visualizzaArea();
		
		System.out.println();
		
		QC qc2 = new QC(3,"rosso");
		qc2.visualizzaQC();
		qc2.visualizzaArea();
		
		System.out.println();
		
		System.out.println(qc2.toString());
		
		System.out.println();
		
		if(qc.equals(qc2))
			System.out.println("I due quadrati sono uguali");
		else
			System.out.println("I due quadrati sono diversi");
	}

}
