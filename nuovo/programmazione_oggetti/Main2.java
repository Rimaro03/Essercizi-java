package programmazione_oggetti;
import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rettangolo r;
		
		Scanner loli = new Scanner(System.in);
		
		System.out.print("Inserire la base ");
		int base = loli.nextInt();
		
		System.out.print("Inserire l'altezza ");
		int altezza = loli.nextInt();
		
		r=new Rettangolo(base,altezza);
		
		System.out.println("L'area del rettangolo � "+r.calcolaArea());
		System.out.println("Il perimetro del rettangolo � "+r.calcolaPerimetro());
		
		System.out.println("La base � "+r.getBase());
		System.out.println("L'altezza34 � "+r.getAltezza());
	}

}
