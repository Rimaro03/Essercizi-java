package stringaContrario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StringContrario extends JFrame {

	JTextField tfPrimaFr, tfSecondaFr;
	JLabel lbPrimaFr, lbSecondaFr;
	String stringPrimaFr,stringSecondaFr;
	int lung;
	JButton converti;

	public StringContrario() {
		super("StringContrario");

		lbPrimaFr = new JLabel("Frase:");
		lbPrimaFr.setBounds(20,20,50,20);

		tfPrimaFr = new JTextField();
		tfPrimaFr.setBounds(80,20,150,20);

		converti = new JButton("Converti");
		converti.addActionListener(new converti());
		converti.setBounds(100,70,100,20);

		lbSecondaFr = new JLabel("Risultato:");
		lbSecondaFr.setBounds(20,120,70,20);

		tfSecondaFr = new JTextField();
		tfSecondaFr.setEditable(false);
		tfSecondaFr.setBounds(80,120,150,20);

		add(lbPrimaFr);
		add(tfPrimaFr);
		add(converti);
		add(lbSecondaFr);
		add(tfSecondaFr);

		setSize(300,200);
		setLayout(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private class converti implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			stringSecondaFr="";
			stringPrimaFr = tfPrimaFr.getText();
			lung=stringPrimaFr.length();
			for(int i=lung-1; i>=0; i--) {
				stringSecondaFr=stringSecondaFr+stringPrimaFr.charAt(i);
			}
			tfSecondaFr.setText(stringSecondaFr);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StringContrario();
	}

}
