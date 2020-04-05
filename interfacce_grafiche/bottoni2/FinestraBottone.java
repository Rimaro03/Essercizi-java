package bottoni2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FinestraBottone {

	private Container contenuto = null;
	private Container contenuto2 = null;

	public FinestraBottone(){

		JFrame finestra = new JFrame("esempio con listener");
		finestra.setBounds(500, 500, 180, 200);
		contenuto=finestra.getContentPane();
		contenuto.setLayout(new BoxLayout(contenuto, BoxLayout.X_AXIS));

		JFrame finestra2 = new JFrame("esempio con listener");
		finestra2.setBounds(800, 500, 180, 200);
		contenuto2=finestra2.getContentPane();
		contenuto.setLayout(new BoxLayout(contenuto, BoxLayout.X_AXIS));

		JButton b1 = new JButton("Ciano");
		b1.addActionListener(new clicBottone());
		JButton b2 = new JButton("Bianco");
		b2.addActionListener(new clicBottone2());
		contenuto.add(b1);
		contenuto.add(b2);

		finestra.setVisible(true);
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		finestra2.setVisible(true);
		finestra2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private class clicBottone implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			contenuto2.setBackground(Color.cyan);
		}
	}

	private class clicBottone2 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			contenuto2.setBackground(Color.white);
		}
	}

}
