package interfacce_2.copy;
import java.awt.*;

import javax.swing.*;
public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//crea una finestra
		JFrame finestra = new JFrame("Esempio con boxlayout");
		finestra.setBounds(500, 500, 400, 100);
		Container contenuto = finestra.getContentPane();
		contenuto.setLayout(new BoxLayout(contenuto, BoxLayout.Y_AXIS));
		
		JPanel su = new JPanel();
		JPanel giu = new JPanel();
		
		su.setLayout(new BoxLayout(su, BoxLayout.X_AXIS));
		giu.setLayout(new BoxLayout(giu, BoxLayout.X_AXIS));
		
		contenuto.add(su);
		contenuto.add(giu);
		
		contenuto.setBackground(Color.GREEN);
		
		giu.add(new JButton("Bottone 1"));
		giu.add(new JButton("Bottone 2"));
		giu.add(new JButton("Bottone 3"));
		
		JLabel label1 = new JLabel("numero_uno ");
		label1.setForeground(Color.black);
		label1.setBackground(Color.yellow);
		label1.setOpaque(true);
		su.add(label1);
		
		JLabel label2 = new JLabel("numero_due ");
		label2.setForeground(Color.black);
		label2.setBackground(Color.red);
		label2.setOpaque(true);
		su.add(label2);
		
		JLabel label3 = new JLabel("numero_3 ");
		label3.setForeground(Color.black);
		label3.setBackground(Color.blue);
		label3.setOpaque(true);
		su.add(label3);
		
		finestra.setVisible(true);
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
