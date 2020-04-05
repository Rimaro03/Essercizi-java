package vector;
import java.util.*;
public class VectorEs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Quadrato>v = new Vector<Quadrato>(3);
		Quadrato q = new Quadrato();
		
		for(int i=0; i<3; i++) {
			q.inserisci();
			v.add(q);
			q.visualizza();
		}
		
		v.clear();
	}

}
