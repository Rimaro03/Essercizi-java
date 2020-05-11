package pronostico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.math.*;

//Ho messo anche un risultato per sapere se hai indovinato subito o no.

public class Pronostico extends JFrame{

	JLabel lbSqUno, lbSqDue;
	JTextField tfSqUno, tfSqDue, tfIndovinato;
	JButton btUno, btPari, btDue;
	int scelta = 0, vincita;
	
	public Pronostico() {
		super("Pronostico");
		
		lbSqUno = new JLabel("Prima squadra");
		lbSqUno.setBounds(30,30,100,20);
		
		lbSqDue= new JLabel("Seconda squadra");
		lbSqDue.setBounds(150,30,100,20);
		
		tfSqUno = new JTextField();
		tfSqUno.setBounds(30,70,100,20);
		
		tfSqDue= new JTextField();
		tfSqDue.setBounds(150,70,100,20);
		
		btUno = new JButton("1");
		btUno.addActionListener(new uno());
		btUno.setBounds(70,110,40,20);
		
		btPari = new JButton("X");
		btPari.addActionListener(new pari());
		btPari.setBounds(115,110,50,20);
		
		btDue = new JButton("2");
		btDue.addActionListener(new due());
		btDue.setBounds(170,110,40,20);
		
		tfIndovinato = new JTextField();
		tfIndovinato.setEditable(false);
		tfIndovinato.setBounds(90,150,100,20);;
		
		add(lbSqUno);
		add(lbSqDue);
		add(tfSqUno);
		add(tfSqDue);
		add(btUno);
		add(btPari);
		add(btDue);
		add(tfIndovinato);
		
		setSize(300,250);
		setLayout(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		vincita = (int)((Math.random()*3-1+1)+1);
	}
	
	private class uno implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			scelta = 1;
			
			if(vincita==scelta) {
				tfIndovinato.setText("HAI VINTO!");
			}
			else {
				tfIndovinato.setText("HAI PERSO!");
			}
			
			btUno.setEnabled(false);
			btDue.setEnabled(false);
			btPari.setEnabled(false);		
		}
	}
	
	private class pari implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			scelta = 2;
			
			if(vincita==scelta) {
				tfIndovinato.setText("HAI VINTO!");
			}
			else {
				tfIndovinato.setText("HAI PERSO!");
			}
			
			btUno.setEnabled(false);
			btDue.setEnabled(false);
			btPari.setEnabled(false);
		}
	}
	
	private class due implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			scelta = 3;
			
			if(vincita==scelta) {
				tfIndovinato.setText("HAI VINTO!");
			}
			else {
				tfIndovinato.setText("HAI PERSO!");
			}
			
			btUno.setEnabled(false);
			btDue.setEnabled(false);
			btPari.setEnabled(false);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Pronostico();
	}

}
