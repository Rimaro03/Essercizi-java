package negozio2;
import java.util.*;
public class Prodotto {

	Scanner scan = new Scanner(System.in);
	
	int codice;
	String des;
	int quantita;
	int scorta;
	
	public Prodotto() {
		codice = 0;
		des = "";
		quantita = 0;
		scorta = 0;
	}
	
	public Prodotto(int codice, String des, int quantita, int scorta) {
		this.codice = codice;
		this.des = des;
		this.quantita = quantita;
		this.scorta = scorta;
	}

	public Prodotto(Prodotto pro) {
		this.codice=pro.codice;
		this.des=pro.des;
		this.quantita=pro.quantita;
		this.scorta=pro.scorta;
	}
	
	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public int getScorta() {
		return scorta;
	}

	public void setScorta(int scorta) {
		this.scorta = scorta;
	}
	
	public void inserisci() {
		System.out.print("Inserisci il codice: ");
		codice=scan.nextInt();
		System.out.print("Inserisci la descrizione: ");
		des=scan.nextLine();
		System.out.print("Inserisci la quantità: ");
		quantita=scan.nextInt();
		System.out.print("Inserisci la scorta: ");
		scorta=scan.nextInt();
	}
	
	public void visualizza() {
		System.out.println("Il codice è "+codice);
		System.out.println("La descrizione è "+des);
		System.out.println("La quantità è "+quantita);
		System.out.println("La scorta è "+scorta);
	}
	
	public void aggiungi(int ag) {
		quantita = quantita+ag;
	}
	
	public void elimina(int ag) {
		quantita = quantita-ag;
	}

	public boolean sottoScorta(int sco) {
		if(quantita<sco) {
			return true;
		}
		else {
			return false;
		}
	}
}
