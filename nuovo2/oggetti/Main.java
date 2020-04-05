package oggetti;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		ClasseDiAlunniSerializable c = new ClasseDiAlunniSerializable();
		
		System.out.println("Cosa vuoi fare?");
		int a = sc.nextInt();
		
		switch(a) {
		case 1:
			c.aggiungiAlunno();
			break;
		case 2:
			c.visualizza();
			break;
		default:
			break;
		}
	}
}
