/* 
 * Autore: Ongaro Leonardo
 */
package esercitazione2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Finestra extends JFrame implements ActionListener {

	String f1,f2,fr;
	JPanel su,ce,ce2,giu;
	JButton b1;
	JLabel label1,label2,label3;
	JTextField st1,st2,r;

	public Finestra(){
		//crea una finestra
		JFrame finestra = new JFrame("Esempio con boxlayout");
		finestra.setBounds(500, 500, 400, 300);
		Container contenuto = finestra.getContentPane();
		contenuto.setLayout(new BoxLayout(contenuto, BoxLayout.Y_AXIS));

		su = new JPanel();
		ce = new JPanel();
		ce2 = new JPanel();
		giu = new JPanel();

		contenuto.add(su);
		contenuto.add(ce);
		contenuto.add(ce2);
		contenuto.add(giu);

		b1 = new JButton("Somma");
		b1.addActionListener(this);
		ce2.add(b1);

		label1 = new JLabel("Frase uno: ");
		label1.setOpaque(true);
		su.add(label1);

		st1 = new JTextField();
		//st1.addKeyListener(new intercettaTasti());
		st1.setPreferredSize(new Dimension(150, 20));
		//st1.setBounds(30, 30, 100, 25);
		su.add(st1);

		label2 = new JLabel("Frase due: ");
		label2.setOpaque(true);
		ce.add(label2);

		st2 = new JTextField();
		//st2.addKeyListener(new intercettaTasti2());
		st2.setPreferredSize(new Dimension(150, 20));
		ce.add(st2);

		label3 = new JLabel("Risultato: ");
		label3.setOpaque(true);
		giu.add(label3);

		r = new JTextField("");
		r.setText(fr);
		r.setPreferredSize(new Dimension(150, 20));
		r.setEditable(false);
		giu.add(r);

		finestra.setVisible(true);
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	public void actionPerformed(ActionEvent evento) {
		f1=st1.getText();
		f2=st2.getText();
		String fr = f1+f2;
		r.setText(fr);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Finestra f = new Finestra();

	}

}
