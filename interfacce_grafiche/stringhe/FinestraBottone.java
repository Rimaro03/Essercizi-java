package stringhe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FinestraBottone {

	private Container contenuto = null;

	public FinestraBottone(){

		JFrame finestra = new JFrame("esempio con listener");
		finestra.setBounds(100, 100, 600, 500);
		contenuto=finestra.getContentPane();
		contenuto.setLayout(new BoxLayout(contenuto, BoxLayout.Y_AXIS));
		
		JButton b1 = new JButton("Ciano");
		b1.addActionListener(new clicBottone());
		contenuto.add(b1);
		
		JTextField cognome = new JTextField();
		cognome.addKeyListener(new intercettaTasti());
		contenuto.add(cognome);
		
		finestra.setVisible(true);
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private class clicBottone implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			contenuto.setBackground(Color.cyan);
		}
	}
	
	private class intercettaTasti implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			JTextField casellaTesto = (JTextField) e.getSource();
			String testo = casellaTesto.getText();
			casellaTesto.setText(casellaTesto.getText().toUpperCase());
		}
		
		

	}
	
}
