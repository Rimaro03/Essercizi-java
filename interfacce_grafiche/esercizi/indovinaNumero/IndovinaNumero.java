package indovinaNumero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;

import javax.swing.*;

public class IndovinaNumero extends JFrame {

	JLabel lbNum;
	JTextField tfNum, tfRes, tfSug, tfNumGiusto;
	JButton btIndovina, btReset;
	int numero, nProva, prove=0;
	
	public IndovinaNumero() {
		super("IndovinaNumero");
		
		lbNum = new JLabel("Numero: ");
		lbNum.setBounds(30,30,60,20);
		
		tfNum = new JTextField();
		tfNum.setBounds(100,30,50,20);
		
		btIndovina = new JButton("Prova");
		btIndovina.addActionListener(new prova());
		btIndovina.setBounds(10, 70, 70, 20);
		
		btReset = new JButton("Reset");
		btReset.addActionListener(new reset());
		btReset.setBounds(100,70,70,20);
		
		tfRes = new JTextField();
		tfRes.setEditable(false);
		tfRes.setBounds(40,110,100,20);
		
		tfSug = new JTextField();
		tfSug.setEditable(false);
		tfSug.setBounds(30,150,130,20);
		
		add(lbNum);
		add(tfNum);
		add(btIndovina);
		add(btReset);
		add(tfRes);
		add(tfSug);
		
		setSize(200,250);
		setLayout(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		numero = (int)((Math.random()*100-0+1)+1);
	}
	
	private class prova implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(prove>=5) {
				tfSug.setText("Tentativi esauriti!");
				btIndovina.setEnabled(false);
			}
			else {
				nProva = Integer.parseInt(tfNum.getText());
				if(numero==nProva) {
					tfRes.setText("INDOVINATO!");
					tfSug.setText("Nuovo gioco iniziato");
					numero = (int)((Math.random()*100-0+1)+1);
					prove=0;
				}
				else {
					if(numero>nProva) {
						tfRes.setText("SBAGLIATO!");
						tfSug.setText("Il numero è più grande");
					}
					else {
						if(numero<nProva) {
							tfRes.setText("SBAGLIATO!");
							tfSug.setText("Il numero è più piccolo");
						}
					}
				}
			}
			
			prove++;
		}
	}
	
	private class reset implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			numero = (int)((Math.random()*100-0+1)+1);
			prove=0;
			tfRes.setText("");
			tfSug.setText("");
			tfNum.setText("");
			btIndovina.setEnabled(true);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new IndovinaNumero();
	}

}
