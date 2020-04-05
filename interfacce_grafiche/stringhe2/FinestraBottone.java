package stringhe2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FinestraBottone {

	private Container contenuto = null;
	private Container contenuto2 = null;

	public FinestraBottone(){

		JFrame finestra = new JFrame("esempio con listener");
		finestra.setBounds(100, 100, 600, 500);
		contenuto=finestra.getContentPane();
		contenuto.setLayout(new BoxLayout(contenuto, BoxLayout.Y_AXIS));
		
		JFrame finestra2 = new JFrame("esempio con listener");
		finestra.setBounds(100, 100, 600, 500);
		contenuto2=finestra.getContentPane();
		contenuto.setLayout(new BoxLayout(contenuto, BoxLayout.Y_AXIS));
		
		JTextField cognome = new JTextField();
		cognome.addKeyListener(new intercettaTasti());
		contenuto.add(cognome);
		
		finestra.setVisible(true);
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		finestra2.setVisible(true);
		finestra2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private class intercettaTasti implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			JTextField casellaTesto = (JTextField) e.getSource();
			String testo = casellaTesto.getText();
			if(testo.equalsIgnoreCase("b")) {
				contenuto2.setBackground(Color.blue);
			}
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
		}

	}
	
}
