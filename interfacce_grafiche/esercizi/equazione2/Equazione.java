package equazione2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Equazione extends JFrame{

	JLabel labelA, labelB, labelRes, labelInt;
	JTextField tfA, tfB, tfForm, tfRes;
	JButton btCalc;
	String stringA, stringB, stringRes, stringFormula;
	double doubleA, doubleB, doubleRes;
	
	
	public Equazione() {
		super("Equazione");
		
		labelInt = new JLabel("Inserire i valori numerici di A e B");
		labelInt.setBounds(80,5,200,20);
		
		labelA = new JLabel("A:");
		labelA.setBounds(30,30,50,50);
		
		tfA = new JTextField();
		tfA.setBounds(50,40,100,25);
		
		labelB = new JLabel("B:");
		labelB.setBounds(180,30,50,50);
		
		tfB = new JTextField();
		tfB.setBounds(200,40,100,25);
		
		btCalc = new JButton("Calcola");
		btCalc.addActionListener(new calcola());
		btCalc.setBounds(120,100,80,25);
		
		tfForm = new JTextField();
		tfForm.setEditable(false);
		tfForm.setBounds(90,160,150,20);
		
		labelRes = new JLabel("X=");
		labelRes.setBounds(110,220,50,20);
		
		tfRes = new JTextField();
		tfRes.setEditable(false);
		tfRes.setBounds(130,220,60,20);
		
		add(labelInt);
		add(labelA);
		add(tfA);
		add(labelB);
		add(tfB);
		add(btCalc);
		add(tfForm);
		add(labelRes);
		add(tfRes);
		
		setSize(350,350);
		setLayout(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private class calcola implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			stringA = tfA.getText();
			doubleA = Double.parseDouble(stringA);

			stringB = tfB.getText();
			doubleB = Double.parseDouble(stringB);

			if(doubleA==0) {
				tfForm.setText("NON DIVIDERE PER 0!");
			}else {
				if(doubleB<0) {
					stringFormula=stringA+"x "+stringB+" = 0";
				}
				else {
					stringFormula=stringA+"x + "+stringB+" = 0";
				}
				tfForm.setText(stringFormula);

				doubleRes = -doubleB/doubleA;
				doubleRes = doubleRes*100;
				doubleRes = Math.round(doubleRes);
				doubleRes = doubleRes/100;
				stringRes = Double.toString(doubleRes);
				tfRes.setText(stringRes);	
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Equazione();
	}

}
