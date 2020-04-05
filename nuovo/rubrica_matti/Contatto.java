package rubrica_matti;

import java.util.Scanner;
import java.io.Serializable;

public class Contatto implements Serializable{
	

		private String nome;
		private String cognome;
		private String ntelefono;
		private String mail;
		
		public Contatto() {
			nome = "";
			cognome = "";
			ntelefono = "";
			mail = "";
		}
		
		public Contatto (String nome, String cognome,String ntelefono,String mail) {
			super();
			this.nome = nome;
			this.cognome = cognome;
			this.ntelefono = ntelefono;
			this.mail = mail;
		}
		
		public void visualizza() {
			System.out.println("Il nome è " + nome);
			System.out.println("Il cognome è " + cognome);
			System.out.println("Il numero di telefono è " + ntelefono);
			System.out.println("La mail è: " + mail);
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			boolean a = false;
			String sn = "1234567890";
			int i,j;
			char c,b;
			for (i = 0; i<nome.length(); i++) {
				b = nome.charAt(i);
				for (j = 0; j<sn.length(); j++) {
					c = sn.charAt(j);
					if (b == c) 
						a = true;
				}
			}
			if (a == true)
				this.nome = "";
			else
				this.nome = nome;
		}
		public String getCognome() {
			return cognome;
		}
		public void setCognome(String cognome) {
			boolean a = true;
			String sn = "1234567890";
			int i,j;
			char c,b;
			a = false;
			for (i = 0; i<cognome.length(); i++) {
				b = cognome.charAt(i);
				for (j = 0; j<sn.length(); j++) {
					c = sn.charAt(j);
					if (b == c) 
						a = true;
				}
			}
			if (a == true)
				this.cognome = "";
			else
				this.cognome = cognome;
		}
		
		public String getNtelefono() {
			return ntelefono;
		}
		public void setNtelefono(String nt) {
			boolean a = true;
			String sl = "qwertyuiopasdfghjklzxcvbnm";
			int i,j;
			char c,b;
			a = false;
			for (i = 0; i<nt.length(); i++) {
				b = nt.charAt(i);
				for (j = 0; j<sl.length(); j++) {
					c = sl.charAt(j);
					if (b == c) 
						a = true;
				}
			}
			if (a == true)
				ntelefono = "";
			else
				ntelefono = nt;

		}
		
		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			int i;
			boolean a = false;
			char b;
			int punto = 0;
			int chiocciola = 0; 
			for (i = 0; i<mail.length(); i++) {
				b = mail.charAt(i);
				if (b == '.')
					punto++;
				if (b == '@')
					chiocciola++;
			}
			if (((punto == 1) && (chiocciola == 1)) || ((punto == 2) && (chiocciola == 1)))
				this.mail = mail;
			else {
				System.out.println("Una mail deve contenere 2 punti e una chiocciola!");
				this.mail = "";
			}
		}

		public void inserimento() {
			Scanner sc = new Scanner (System.in);
			
			boolean a = true;
			String sl = "qwertyuiopasdfghjklzxcvbnm.@#°*+][^?'=)(/&%$£!ç§";
			String sn = "1234567890.@#°*+][^?'=)(/&%$£!ç§";
			int i,j;
			char c,b;
			do {
				System.out.println("Inserisci nome: ");
				nome = sc.nextLine();
				a = false;
				for (i = 0; i<nome.length(); i++) {
					b = nome.charAt(i);
					for (j = 0; j<sn.length(); j++) {
						c = sn.charAt(j);
						if (b == c) 
							a = true;
					}
				}
				if (a == true)
					System.out.println("Il nome non può avere numeri o simboli");
			}while(a == true);
			do {
				System.out.println("Inserisci cognome: ");
				cognome = sc.nextLine();
				a = false;
				for (i = 0; i<cognome.length(); i++) {
					b = cognome.charAt(i);
					for (j = 0; j<sn.length(); j++) {
						c = sn.charAt(j);
						if (b == c) 
							a = true;
					}
				}
				if (a == true)
					System.out.println("Il cognome non può avere numeri o simboli");
			}while(a == true);
			do {
				System.out.println("Inserisci numero di telefono: ");
				ntelefono = sc.nextLine();
				a = false;
				for (i = 0; i<ntelefono.length(); i++) {
					b = ntelefono.charAt(i);
					for (j = 0; j<sl.length(); j++) {
						c = sl.charAt(j);
						if (b == c) 
							a = true;
					}
				}
				if (a == true)
					System.out.println("Il numero di telefono non può avere lettere o simboli");
			}while(a == true);
			do {
				System.out.println("Inserisci la mail: ");
				a = false;
				int punto = 0;
				int chiocciola = 0; 
				mail = sc.nextLine();
				for (i = 0; i<mail.length(); i++) {
					b = mail.charAt(i);
					if (b == '.')
						punto++;
					if (b == '@')
						chiocciola++;
				}
				if (((punto == 1) && (chiocciola == 1)) || ((punto == 2) && (chiocciola == 1)))
					a = true;
				else
					System.out.println("Una mail deve contenere 2 punti e una chiocciola!");	
			}while(a != true);
		}
		
		public String toString() {
			return "Contatto [ nome = " + nome + ", cognome = " + cognome + ", numero = " + ntelefono + " mail = " + mail + "]";
		}
		public boolean controlloPresenzaLettere(String s) {
			boolean a = true;
			String sl = "qwertyuiopasdfghjklzxcvbnm.@#°*+][^?'=)(/&%$£!ç§";
			int i,j;
			char c,b;
			a = false;
			for (i = 0; i<s.length(); i++) {
				b = s.charAt(i);
				for (j = 0; j<sl.length(); j++) {
					c = sl.charAt(j);
					if (b == c) 
						a = true;
				}
			}
			if (a == true) {
				System.out.println("Un numero di telefono non può presentare lettere o simboli!");
				return true;
			}
			else
				return false;
		}
		
		public boolean controlloPresenzaNumeri (String s) {
			boolean a = true;
			String sn = "1234567890.@#°*+][^?'=)(/&%$£!ç§";
			int i,j;
			char c,b;
			a = false;
			for (i = 0; i<s.length(); i++) {
				b = s.charAt(i);
				for (j = 0; j<sn.length(); j++) {
					c = sn.charAt(j);
					if (b == c) 
						a = true;
				}
			}
			if (a == true) {
				System.out.println("Un nome non può avere numeri o simboli!");
				return true;
			}
			else
				return false;
		}
	}


