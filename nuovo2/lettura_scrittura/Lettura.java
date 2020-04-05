package lettura_scrittura;
import java.io.*;
import java.util.*;
/**
 * Lettura di un file di testo una linea alla volta.
 * @author Mion Andrea
 * @version 
 */
public class Lettura {

	public static void main(String[] args) {

		String nomeFile = "NomeFile.txt";

		try {
			FileInputStream fin = new FileInputStream(nomeFile);

			Scanner in = new Scanner(fin);
			while(in.hasNextLine())
			{
				String linea = in.nextLine();
				System.out.println(linea);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Eccezione " + e);
			e.printStackTrace();
		}
	}

}
