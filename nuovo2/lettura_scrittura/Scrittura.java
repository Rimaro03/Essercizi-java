package lettura_scrittura;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;

import java.io.*;
/**
 * Esempio di scrittura di un file di testo.
 * @author Mion Andrea
 * @version 
 */
public class Scrittura {
	
	public static void main(String[] args) {

		String nomeFile = "NomeFile.txt";
		try {

			// fw gestisce il file su disco
			FileWriter fw = new FileWriter(nomeFile);

			// pw permette di scrivere stringhe ed altro con print...
			PrintWriter pw = new PrintWriter(fw);

			pw.println("Ciao Mondo!");
			pw.println(12);
			pw.println(33);
			pw.close();

		} catch (IOException e) {
			System.out.println("Eccezione " + e);
			e.printStackTrace();
		}
	}

}
