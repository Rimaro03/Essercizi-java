package cerchioPro;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner loli = new Scanner(System.in);
		
		Cerchio ce;
		
		System.out.println("Inserire il raggio: ");
		int raggio = loli.nextInt();
		
		ce=new Cerchio(raggio);
		
		System.out.println("Il raggio � "+ce.getRaggio());
		System.out.println("La circonferenza � "+ce.calcoloCirconferenza());
		System.out.println("L'area � "+ce.calcoloArea());
	}

}
