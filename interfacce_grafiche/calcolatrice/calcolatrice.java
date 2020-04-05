package calcolatrice;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class calcolatrice extends JFrame{

	JTextField r;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,c,pi,me,pe,di,u;
	JPanel rs,r1,r2,r3,r4;
	String s="";
	int n1;
	int n2;
	int ris;
	int p;
	int e;
	String ris2;
	Container contenuto;

	public calcolatrice() {
		JFrame finestra = new JFrame("Calcolatrice");
		finestra.setBounds(300, 300, 300, 300);
		contenuto = finestra.getContentPane();
		contenuto.setLayout(new BoxLayout(contenuto, BoxLayout.Y_AXIS));

		rs = new JPanel();
		r1 = new JPanel();
		r2 = new JPanel();
		r3 = new JPanel();
		r4 = new JPanel();

		r = new JTextField();
		r.setPreferredSize(new Dimension(150, 20));
		r.setEditable(false);
		rs.add(r);

		b1 = new JButton("1");
		b1.addActionListener(new c1());
		b2 = new JButton("2");
		b2.addActionListener(new c2());
		b3 = new JButton("3");
		b3.addActionListener(new c3());
		pi = new JButton("+");
		pi.addActionListener(new piu());
		r1.add(b1);
		r1.add(b2);
		r1.add(b3);
		r1.add(pi);

		b4 = new JButton("4");
		b4.addActionListener(new c4());
		b5 = new JButton("5");
		b5.addActionListener(new c5());
		b6 = new JButton("6");
		b6.addActionListener(new c6());
		me = new JButton("-");
		me.addActionListener(new meno());
		r2.add(b4);
		r2.add(b5);
		r2.add(b6);
		r2.add(me);

		b7 = new JButton("7");
		b7.addActionListener(new c7());
		b8 = new JButton("8");
		b8.addActionListener(new c8());
		b9 = new JButton("9");
		b9.addActionListener(new c9());
		pe = new JButton("x");
		pe.addActionListener(new per());
		r3.add(b7);
		r3.add(b8);
		r3.add(b9);
		r3.add(pe);

		b0 = new JButton("0");
		b0.addActionListener(new c0());
		c = new JButton("C");
		c.addActionListener(new c());
		di = new JButton("/");
		di.addActionListener(new diviso());
		u = new JButton("=");
		u.addActionListener(new uguale());
		r4.add(c);
		r4.add(b0);
		r4.add(u);
		r4.add(di);

		contenuto.add(rs);
		contenuto.add(r1);
		contenuto.add(r2);
		contenuto.add(r3);
		contenuto.add(r4);

		finestra.setVisible(true);
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private class c implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			s="";
			r.setText("");
		}
	}

	private class c1 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			s=s+"1";
			r.setText(s);
		}
	}

	private class c2 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			s=s+"2";
			r.setText(s);
		}
	}

	private class c3 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			s=s+"3";
			r.setText(s);
		}
	}

	private class c4 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			s=s+"4";
			r.setText(s);
		}
	}

	private class c5 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			s=s+"5";
			r.setText(s);
		}
	}

	private class c6 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			s=s+"6";
			r.setText(s);
		}
	}

	private class c7 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			s=s+"7";
			r.setText(s);
		}
	}

	private class c8 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			s=s+"8";
			r.setText(s);
		}
	}

	private class c9 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			s=s+"9";
			r.setText(s);
		}
	}

	private class c0 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			s=s+"0";
			r.setText(s);
		}
	}

	private class piu implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			n1 = Integer.parseInt(s);
			s="";
			r.setText("");
			p=0;
		}
	}

	private class meno implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			n1 = Integer.parseInt(s);
			s="";
			r.setText("");
			p=1;
		}
	}

	private class per implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			n1 = Integer.parseInt(s);
			s="";
			r.setText("");
			p=2;
		}
	}

	private class diviso implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			n1 = Integer.parseInt(s);
			s="";
			r.setText("");
			p=3;
		}
	}

	private class uguale implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			n2 = Integer.parseInt(s);
			s="";
			if(p==0) {
				ris = n1+n2;
				ris2 = s=Integer.toString(ris);
			}
			else {
				if(p==1) {
					ris = n1-n2;
					ris2 = s=Integer.toString(ris);
				}
				else {
					if(p==2) {
						ris = n1*n2;
						ris2 = s=Integer.toString(ris);
					}
					else {
						if(p==3) {
							if(n2==0) {
								e = 1;
							}
							else {
								ris = n1/n2;
								ris2 = s=Integer.toString(ris);	
							}
						}
					}
				}
			}
			if(e==1) {
				r.setText("Impossibile dividere per 0!");
			}
			else {
				r.setText(ris2);
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calcolatrice c = new calcolatrice();

	}
}
