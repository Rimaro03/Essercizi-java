package esercitazione;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu {

	private Container contenuto = null;
	
	public Menu() {
		JFrame finestra = new JFrame("Esercizio");
		finestra.setBounds(500, 500, 400, 300);
		contenuto = finestra.getContentPane();
		contenuto.setLayout(new BoxLayout(contenuto, BoxLayout.Y_AXIS));
		
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(new BoxLayout(jp1, BoxLayout.X_AXIS));
		contenuto.add(jp1);
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new BoxLayout(jp2, BoxLayout.X_AXIS));
		contenuto.add(jp2);
		
		JPanel jp3 = new JPanel();
		jp3.setLayout(new BoxLayout(jp3, BoxLayout.X_AXIS));
		contenuto.add(jp3);
		
		JPanel jp4 = new JPanel();
		jp4.setLayout(new BoxLayout(jp4, BoxLayout.X_AXIS));
		contenuto.add(jp4);
		
		JPanel jp5 = new JPanel();
		jp5.setLayout(new BoxLayout(jp5, BoxLayout.X_AXIS));
		contenuto.add(jp5);
		
		JPanel jp6 = new JPanel();
		jp6.setLayout(new BoxLayout(jp6, BoxLayout.X_AXIS));
		contenuto.add(jp6);
		
		JPanel jp7 = new JPanel();
		jp7.setLayout(new BoxLayout(jp7, BoxLayout.X_AXIS));
		contenuto.add(jp7);
		
		JPanel jp8 = new JPanel();
		jp8.setLayout(new BoxLayout(jp8, BoxLayout.X_AXIS));
		contenuto.add(jp8);
		
		JPanel jp9 = new JPanel();
		jp9.setLayout(new BoxLayout(jp9, BoxLayout.X_AXIS));
		contenuto.add(jp9);
		
		JPanel jp10 = new JPanel();
		jp10.setLayout(new BoxLayout(jp10, BoxLayout.X_AXIS));
		contenuto.add(jp10);
//--------------------------------------------------------------------	
		
		JButton b1 = new JButton("Inserisci contatto");
		b1.addActionListener(new clicBottone1());
		jp1.add(b1);
		
		JButton b2 = new JButton("Visualizza la rubrica");
		b2.addActionListener(new clicBottone2());
		jp2.add(b2);
		
		JButton b3 = new JButton("Aggiorna numero");
		b3.addActionListener(new clicBottone3());
		jp3.add(b3);
		
		JButton b4 = new JButton("Elimina un contatto");
		b4.addActionListener(new clicBottone4());
		jp4.add(b4);
		
		JButton b5 = new JButton("Ricerca del numero di telefono");
		b5.addActionListener(new clicBottone5());
		jp5.add(b5);
		
		JButton b6 = new JButton("Ricerca per nome");
		b6.addActionListener(new clicBottone6());
		jp6.add(b6);
		
		JButton b7 = new JButton("Ricerca per cognome");
		b7.addActionListener(new clicBottone7());
		jp7.add(b7);
		
		JButton b8 = new JButton("Ricerca per telefono");
		b8.addActionListener(new clicBottone8());
		jp8.add(b8);
		
		JButton b9 = new JButton("Ricerca per mail");
		b9.addActionListener(new clicBottone9());
		jp9.add(b9);
		
		JButton b10 = new JButton("Ricerca per prima lettera del cognome");
		b10.addActionListener(new clicBottone10());
		jp10.add(b10);
//------------------------------------------------------------	
		
		finestra.setVisible(true);
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private class clicBottone1 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			
		}
	}
	
	private class clicBottone2 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			
		}
	}
	
	private class clicBottone3 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			
		}
	}
	
	private class clicBottone4 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			
		}
	}
	
	private class clicBottone5 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			
		}
	}
	
	private class clicBottone6 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			
		}
	}
	
	private class clicBottone7 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			
		}
	}
	
	private class clicBottone8 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			
		}
	}
	
	private class clicBottone9 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			
		}
	}
	
	private class clicBottone10 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			
		}
	}
	
	public static void main(String[] args) {
		
		Menu m = new Menu();

	}
}
