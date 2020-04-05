package interfacce_2;
import java.awt.*;

import javax.swing.*;
public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//crea una finestra
		JFrame finestra = new JFrame("Esempio con boxlayout");
		finestra.setBounds(500, 500, 200, 200);
		Container contenuto = finestra.getContentPane();
		contenuto.setLayout(new BoxLayout(contenuto, BoxLayout.X_AXIS));
		
		JPanel sx = new JPanel();
		JPanel dx = new JPanel();
		JPanel sep = new JPanel();
		
		sx.setLayout(new BoxLayout(sx, BoxLayout.Y_AXIS));
		dx.setLayout(new BoxLayout(dx, BoxLayout.Y_AXIS));
		sep.setLayout(new BoxLayout(sep, BoxLayout.Y_AXIS));
		
		contenuto.add(sx);
		contenuto.add(sep);
		contenuto.add(dx);
		
		contenuto.setBackground(Color.GREEN);
		
		sep.add(new JButton("Bottone 1"));
		sep.add(new JButton("Bottone 2"));
		sep.add(new JButton("Bottone 3"));
		
		JLabel label1 = new JLabel("sinistra");
		finestra.setVisible(true);
		label1.setForeground(Color.black);
		label1.setBackground(Color.yellow);
		label1.setOpaque(true);
		sx.add(label1);
		
		
		JLabel label2 = new JLabel("sinistra2");
		finestra.setVisible(true);
		label2.setForeground(Color.black);
		label2.setBackground(Color.yellow);
		label2.setOpaque(true);
		sx.add(label2);
		
		JLabel label3 = new JLabel("sinistra3");
		finestra.setVisible(true);
		label3.setForeground(Color.black);
		label3.setBackground(Color.yellow);
		label3.setOpaque(true);
		sx.add(label3);
		
		JLabel label4 = new JLabel("sinistra");
		finestra.setVisible(true);
		label4.setForeground(Color.black);
		label4.setBackground(Color.red);
		label4.setOpaque(true);
		dx.add(label4);
		
		
		JLabel label5 = new JLabel("sinistra2");
		finestra.setVisible(true);
		label5.setForeground(Color.black);
		label5.setBackground(Color.red);
		label5.setOpaque(true);
		dx.add(label5);
		
		JLabel label6 = new JLabel("sinistra3");
		finestra.setVisible(true);
		label6.setForeground(Color.black);
		label6.setBackground(Color.red);
		label6.setOpaque(true);
		dx.add(label6);
		
		finestra.setVisible(true);
		
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
