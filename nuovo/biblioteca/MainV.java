package biblioteca;
import java.util.*;
public class MainV {

	public static void main(String[] args) {
		
		Vector<Biblioteca> v = new Vector<Biblioteca>();
		
		Biblioteca b = new Biblioteca();
		b.inserisci();
		v.add(b);
		v.toString();
		
	}

}
