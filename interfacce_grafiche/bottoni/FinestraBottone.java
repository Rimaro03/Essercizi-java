package bottoni;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FinestraBottone {

	private Container contenuto = null;

	public FinestraBottone(){

		JFrame finestra = new JFrame("esempio con listener");
		finestra.setBounds(500, 500, 180, 200);
		contenuto=finestra.getContentPane();
		contenuto.setLayout(new BoxLayout(contenuto, BoxLayout.X_AXIS));

		JPanel sx = new JPanel();
		JPanel dx = new JPanel();
		
		sx.setLayout(new BoxLayout(sx, BoxLayout.Y_AXIS));
		dx.setLayout(new BoxLayout(dx, BoxLayout.Y_AXIS));
		
		JButton b1 = new JButton("Ciano");
		JButton b2 = new JButton("Bianco");
		sx.add(b1);
		dx.add(b2);
		
		b1.addActionListener(new clicBottone());
	    b2.addActionListener(new clicBottone2());
		
		contenuto.add(sx);
		contenuto.add(dx);
		
		finestra.setVisible(true);
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private class clicBottone implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			contenuto.setBackground(Color.cyan);
		}
	}
	
	private class clicBottone2 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			contenuto.setBackground(Color.white);
		}
	}
}
