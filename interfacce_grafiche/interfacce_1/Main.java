package interfacce_1;
import java.awt.*;

import javax.swing.*;
public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//crea una finestra
		JFrame finestra = new JFrame("La mia prima finestra con java!");
		finestra.setBounds(500, 500, 600, 300);
		
		Container contenuto = finestra.getContentPane();
		
		//sfondo finestra
		contenuto.setBackground(Color.YELLOW);
		
		
		//crea elemento in una finestra
		JLabel label1 = new JLabel("Il mio primo applicativo Swing!");
		finestra.setVisible(true);//sfondo elemento
		//sfondo scritta
		label1.setForeground(Color.blue);
		//sfondo elemento
		label1.setBackground(Color.red);
		label1.setOpaque(true);
		finestra.add(label1, BorderLayout.NORTH);
		
		
		JLabel label2 = new JLabel("Seconda etichetta");
		label2.setOpaque(true);
		label2.setBackground(Color.cyan);
		finestra.add(label2, BorderLayout.SOUTH);
		
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
