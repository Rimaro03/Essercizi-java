package FileTesto;
import java.io.*;
import java.util.*;
/**
 * Lettura di un file di prodotti.
 * Lettura di una linea alla volta, 
 * separazione degli elementi con split.
 * @author Mion
 * @version 
 */
public class LeggiFileDiProdotti2 {


	public static void main(String[] args) // throws  IOException
	{

		try {

			String nomeFile = "prodotti.txt";
			String linea;
			FileInputStream fin;

			fin = new FileInputStream(nomeFile);


			Scanner in = new Scanner(fin);

			// finchè ci sono prodotti da leggere 
			while(in.hasNextLine())
			{
				// legge un prodotto
				linea = in.nextLine();

				// divide gli elementi con metodo split(...)
				String elementi[] = linea.split(";");

				String descrizione = elementi[0];
				String peso = elementi[1];
				String prezzo = elementi[2];
				System.out.print("descrizione=" + descrizione);
				System.out.print(" peso=" + peso);
				System.out.print(" prezzo=" + prezzo);
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
