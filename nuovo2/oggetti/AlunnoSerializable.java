
/*
 * Alunno Serializable
 * 
 * Implementa la interfaccia    Serializable
 * per poter salvarlo su file di Oggetti
 * 
 * A scopo solo dimostrativo... non ci sono particolari controlli
 */
package oggetti;
import java.util.*;
import java.io.Serializable;

public class AlunnoSerializable implements Serializable {
	
	//private static final long serialVersionUID = 1353412941467111132L;
	Scanner sc = new Scanner(System.in);
	
	String cognome;
	String nome;
	String annoNascita;
	
	
	/**
	 * 
	 */
	public AlunnoSerializable() {
		this.cognome = null; 
		this.nome = null;
		this.annoNascita = null;	
	}

	/**
	 * @param cognome
	 * @param nome
	 * @param annoNascita
	 */
	public AlunnoSerializable(String cognome, String nome, String annoNascita) {
		super();
		this.cognome = cognome;
		this.nome = nome;
		this.annoNascita = annoNascita;
	}
	
	
	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}
	
	
	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the annoNascita
	 */
	public String getAnnoNascita() {
		return annoNascita;
	}
	/**
	 * @param annoNascita the annoNascita to set
	 */
	public void setAnnoNascita(String annoNascita) {
		this.annoNascita = annoNascita;
	}
	
	public void inserisci() {
		System.out.println("Nome: ");
		nome=sc.nextLine();
		System.out.println("Cognome: ");
		cognome=sc.nextLine();
		System.out.println("Anno: ");
		annoNascita=sc.nextLine();
	}

	@Override
	public String toString() {
		return "Alunno:" + cognome + " " + nome + " nato :" + annoNascita;
	}


}
