package rubrica_ovidio;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/*
 * Author: Ovidio Jimborean
 * Data: 27/03/20
 * Versione: 0.4.0
 */


public class Rubrica_Telefonica {

	public static void main(String[] args) {
		Scanner tastiera=new Scanner(System.in);

		ArrayList <Telefono> rubrica=new ArrayList(1);
		int i;
		int scelta=0;
		boolean found;
		String nomeIns;
		String cognomeIns;
		String numeroIns;
		String numeroCambio;
		String alfabeto="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int l=alfabeto.length();
		PrintWriter pw;
		String nomeFile="Rubrica_Telefonica.txt";

		try {
			String linea;
			FileInputStream fin;

			fin = new FileInputStream(nomeFile);

			Scanner n=new Scanner(fin);

			while(n.hasNextLine())	
			{
				linea=n.nextLine();

				String elementi[]=linea.split(";");
				String nome=elementi[0];
				String cognome=elementi[1];
				String numero=elementi[2];
				String email=elementi[3];
				System.out.println("nome=" + nome);
				System.out.println("cognome=" + cognome);
				System.out.println("numero=" + numero);
				System.out.println("email=" + email);
				System.out.println();

				Telefono t= new Telefono(nome,cognome,numero,email);
				rubrica.add(t);
			}
			System.out.println();
		}catch (FileNotFoundException e) {
			System.out.println(" --- Devi ancora creare il file --- ");
			System.out.println();
		}

		do {
			System.out.println("---------------Menu'------------------");
			System.out.println();
			System.out.println("1-Inserisci un nuovo contatto");
			System.out.println();
			System.out.println("2-Visualizza la rubrica");
			System.out.println();
			System.out.println("3-Aggiornamento del numero di telefono di un contatto avendo inserito il numero");
			System.out.println();
			System.out.println("4-Trova il numero inserendo nome e cognome");
			System.out.println();
			System.out.println("5-Elimina un elemento della rubrica dati nome e cognome");
			System.out.println();
			System.out.println("6-Visualizzazione della rubrica data la prima lettera del cognome");
			System.out.println();
			System.out.println("-----------Scegli l'opzione che desideri  effettuare--------------");

			scelta=tastiera.nextInt();

			tastiera.nextLine();

			switch(scelta) {
			case 0: System.out.println("Fine");
			break;

			case 1: Telefono t = new Telefono();
			found=true;
			t.inserisci();
			for(i=0;i<rubrica.size();i++) {
				if((rubrica.get(i).getNome().equals(t.getNome())==true)&&(rubrica.get(i).getCognome().equals(t.getCognome())==true)) {
					found=false;
				}
			}

			if(found==true) {
				rubrica.add(t);
			}else {
				System.out.println("Hai gia' usato questo nome e cognome");
			}
			System.out.println();
			break;

			case 2:
				if (rubrica.size()>0) {
					for(int y=0;y<26;y++) {
						System.out.println("Contatti con la lettera " + alfabeto.charAt(y));
						System.out.println();
						for(i=0;i<rubrica.size();i++) {
							if (rubrica.get(i).getCognome().indexOf(alfabeto.charAt(y))==0) {
								System.out.println("Contatto: ");
								rubrica.get(i).visualizza();
								System.out.println();	
							}
						}
					}

				} else {
					System.out.println("Non e' presente nessun elemento nella rubrica");
				}
				System.out.println();
				break;

			case 3: System.out.println("Inserisci il numero del contatto che vuoi cambiare:");
			numeroIns=tastiera.nextLine();
			found=false;
			i=0;
			while((i<rubrica.size())&&(found==false)) {
				if(rubrica.get(i).getNumero().equals(numeroIns)==true) {
					found=true;
					System.out.println("Inserisci il numero con il quale vuoi sostituire il contatto: " +rubrica.get(i).toString());
					numeroCambio=tastiera.nextLine();
					rubrica.get(i).setNumero(numeroCambio);	
				} else {
					i++;
				}
			}

			if(found==true) {
				System.out.println("Cambio effettuato");
			} else {
				System.out.println("Contatto non esistente");
			}
			break;

			case 4: System.out.println("Inserisci nome e cognome del contatto che vuoi cercare: ");
			nomeIns=tastiera.nextLine();
			cognomeIns=tastiera.nextLine();
			found=false;
			i=0;
			while((i<rubrica.size())&&(found==false)) {
				if((rubrica.get(i).getNome().equals(nomeIns)==true)&&(rubrica.get(i).getCognome().equals(cognomeIns)==true)) {
					found=true;
					System.out.println("Il numero del contatto e' : " +rubrica.get(i).getNumero());
				} else {
					i++;
				}

			}

			if(found==false) {
				System.out.println("Il contatto non esiste");
			}

			System.out.println();
			break;

			case 5: System.out.println("Inserisci il nome e il cognome del contatto che vuoi cercare ");
			nomeIns=tastiera.nextLine();
			cognomeIns=tastiera.nextLine();
			found=false;
			i=0;
			while((i<rubrica.size())&&(found==false)) {
				if((rubrica.get(i).getNome().equals(nomeIns)==true)&&(rubrica.get(i).getCognome().equals(cognomeIns)==true)) {
					found=true;
					rubrica.remove(i);
				} else {
					i++;
				}
			}

			if(found==true) {
				System.out.println("Contatto eliminato");
				rubrica.trimToSize();
			} else {
				System.out.println("Il contatto non esiste");
			}
			break;

			case 6: System.out.println("Inserisci una lettera per la visualizzazione di tutti i contatti aventi quella lettera come la prima del cognome");
			String lettera=tastiera.nextLine();
			for(i=0;i<rubrica.size();i++)  {
				if(rubrica.get(i).getCognome().indexOf(lettera)==0) {
					rubrica.get(i).visualizza();
					System.out.println();
				}
			}

			break;
			case 7:
				try {
					pw=new PrintWriter(nomeFile);
					for(i=0;i<rubrica.size();i++) {
						pw.print(rubrica.get(i).getNome()+";");
						pw.print(rubrica.get(i).getCognome()+";");
						pw.print(rubrica.get(i).getNumero()+";");
						pw.print(rubrica.get(i).getEmail());
					}
					pw.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			default: System.out.println("Scelta errata");
			System.out.println();
			break;



			}





		}while(scelta!=0);


	}

}



