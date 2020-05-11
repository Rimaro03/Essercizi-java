package memory;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

import javax.swing.*;

/* blu=1
 * rosso=2
 * verde=3
 */

public class Memory extends JFrame{

	JButton btUno, btDue, btTre, btQuattro, btCinque, btSei, btSette, btOtto, btNove;
	int contatore, indovinatoUno, indovinatoDue, bt;
	LocalTime orario, orario2;

	public Memory() {
		super("Memory");

		btUno = new JButton();
		btUno.addActionListener(new uno());
		btUno.setBounds(20,30,70,70);

		btDue = new JButton();
		btDue.addActionListener(new due());
		btDue.setBounds(100,30,70,70);

		btTre = new JButton();
		btTre.addActionListener(new tre());
		btTre.setBounds(180,30,70,70);

		btQuattro = new JButton();
		btQuattro.addActionListener(new quattro());
		btQuattro.setBounds(20,130,70,70);

		btCinque = new JButton();
		btCinque.addActionListener(new cinque());
		btCinque.setBounds(100,130,70,70);

		btSei = new JButton();
		btSei.addActionListener(new sei());
		btSei.setBounds(180,130,70,70);

		add(btUno);
		add(btDue);
		add(btTre);
		add(btQuattro);
		add(btCinque);
		add(btSei);

		setSize(300,300);
		setLayout(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private class uno implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(contatore==1) {

				btUno.setEnabled(false);
				
				btUno.setBackground(Color.blue);
				
				//orario2 = orario.plusSeconds(1);
				
				/*do {
					orario = LocalTime.now();
				}while(orario.getSecond()<=orario2.getSecond());*/


				indovinatoDue=1;

				if(indovinatoUno==indovinatoDue) {
					btUno.setBackground(null);
					btTre.setBackground(null);

					System.out.println(contatore);

					contatore=0;
				}
				else {
					btUno.setEnabled(true);
					btUno.setBackground(null);

					if(bt==2) {
						btDue.setEnabled(true);
						btDue.setBackground(null);
					}
					else {
						if(bt==3) {
							btTre.setEnabled(true);
							btTre.setBackground(null);
						}
						else {
							if(bt==4) {
								btQuattro.setEnabled(true);
								btQuattro.setBackground(null);
							}
							else {
								if(bt==5) {
									btCinque.setEnabled(true);
									btCinque.setBackground(null);
								}
								else {
									if(bt==6) {
										btSei.setEnabled(true);
										btSei.setBackground(null);
									}
								}
							}
						}
					}

					bt=0;
					contatore=0;
				}
			}
			else {
				if(contatore==0) {
					bt=1;
					btUno.setEnabled(false);
					btUno.setBackground(Color.blue);
					contatore++;
					indovinatoUno=1;
				}
			}

		}

	}


	private class due implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(contatore==1) {
				btDue.setEnabled(false);
				btDue.setBackground(Color.red);
				indovinatoDue=2;

				if(indovinatoUno==indovinatoDue) {
					btDue.setBackground(null);
					btCinque.setBackground(null);

					contatore=0;
				}
				else {
					btDue.setEnabled(true);
					btDue.setBackground(null);

					if(bt==1) {
						btUno.setEnabled(true);
						btUno.setBackground(null);
					}
					else {
						if(bt==3) {
							btTre.setEnabled(true);
							btTre.setBackground(null);
						}
						else {
							if(bt==4) {
								btQuattro.setEnabled(true);
								btQuattro.setBackground(null);
							}
							else {
								if(bt==5) {
									btCinque.setEnabled(true);
									btCinque.setBackground(null);
								}
								else {
									if(bt==6) {
										btSei.setEnabled(true);
										btSei.setBackground(null);
									}
								}
							}
						}
					}

					bt=0;

					contatore=0;
				}

			}
			else {
				if(contatore==0) {
					bt=2;
					btDue.setEnabled(false);
					btDue.setBackground(Color.red);
					contatore++;
					indovinatoUno=2;
				}
			}
		}
	}

	private class tre implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(contatore==1) {
				btTre.setEnabled(false);
				btTre.setBackground(Color.blue);
				indovinatoDue=1;

				if(indovinatoUno==indovinatoDue) {
					btUno.setBackground(null);
					btTre.setBackground(null);

					contatore=0;
				}
				else {
					btTre.setEnabled(true);
					btTre.setBackground(null);

					if(bt==1) {
						btUno.setEnabled(true);
						btUno.setBackground(null);
					}
					else {
						if(bt==2) {
							btDue.setEnabled(true);
							btDue.setBackground(null);
						}
						else {
							if(bt==4) {
								btQuattro.setEnabled(true);
								btQuattro.setBackground(null);
							}
							else {
								if(bt==5) {
									btCinque.setEnabled(true);
									btCinque.setBackground(null);
								}
								else {
									if(bt==6) {
										btSei.setEnabled(true);
										btSei.setBackground(null);
									}
								}
							}
						}
					}

					bt=0;

					contatore=0;
				}

			}
			else {
				if(contatore==0) {
					bt=3;
					btTre.setEnabled(false);
					btTre.setBackground(Color.blue);
					contatore++;
					indovinatoUno=1;
				}
			}
		}
	}

	private class quattro implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(contatore==1) {
				btQuattro.setEnabled(false);
				btQuattro.setBackground(Color.green);
				indovinatoDue=3;

				if(indovinatoUno==indovinatoDue) {
					btQuattro.setBackground(null);
					btSei.setBackground(null);

					contatore=0;
				}
				else {
					btQuattro.setEnabled(true);
					btQuattro.setBackground(null);

					if(bt==1) {
						btUno.setEnabled(true);
						btUno.setBackground(null);
					}
					else {
						if(bt==2) {
							btDue.setEnabled(true);
							btDue.setBackground(null);
						}
						else {
							if(bt==3) {
								btTre.setEnabled(true);
								btTre.setBackground(null);
							}
							else {
								if(bt==5) {
									btCinque.setEnabled(true);
									btCinque.setBackground(null);
								}
								else {
									if(bt==6) {
										btSei.setEnabled(true);
										btSei.setBackground(null);
									}
								}
							}
						}
					}

					bt=0;
					contatore=0;
				}

			}
			else {
				if(contatore==0) {
					bt=4;
					btQuattro.setEnabled(false);
					btQuattro.setBackground(Color.green);
					contatore++;
					indovinatoUno=3;
				}
			}
		}
	}

	private class cinque implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(contatore==1) {
				btCinque.setEnabled(false);
				btCinque.setBackground(Color.red);
				indovinatoDue=2;

				if(indovinatoUno==indovinatoDue) {
					btDue.setBackground(null);
					btCinque.setBackground(null);

					contatore=0;
				}
				else {
					btCinque.setEnabled(true);
					btCinque.setBackground(null);

					if(bt==1) {
						btUno.setEnabled(true);
						btUno.setBackground(null);
					}
					else {
						if(bt==2) {
							btDue.setEnabled(true);
							btDue.setBackground(null);
						}
						else {
							if(bt==3) {
								btTre.setEnabled(true);
								btTre.setBackground(null);
							}
							else {
								if(bt==4) {
									btQuattro.setEnabled(true);
									btQuattro.setBackground(null);
								}
								else {
									if(bt==6) {
										btSei.setEnabled(true);
										btSei.setBackground(null);
									}
								}
							}
						}
					}

					bt=0;
					contatore=0;
				}

			}
			else {
				if(contatore==0) {
					bt=5;
					btCinque.setEnabled(false);
					btCinque.setBackground(Color.red);
					contatore++;
					indovinatoUno=2;
				}
			}

		}
	}

	private class sei implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(contatore==1) {
				btSei.setEnabled(false);
				btSei.setBackground(Color.green);
				indovinatoDue=3;

				if(indovinatoUno==indovinatoDue) {
					btQuattro.setBackground(null);
					btSei.setBackground(null);

					contatore=0;
				}
				else {
					btSei.setEnabled(true);
					btSei.setBackground(null);

					if(bt==1) {
						btUno.setEnabled(true);
						btUno.setBackground(null);
					}
					else {
						if(bt==2) {
							btDue.setEnabled(true);
							btDue.setBackground(null);
						}
						else {
							if(bt==3) {
								btTre.setEnabled(true);
								btTre.setBackground(null);
							}
							else {
								if(bt==4) {
									btQuattro.setEnabled(true);
									btQuattro.setBackground(null);
								}
								else {
									if(bt==5) {
										btCinque.setEnabled(true);
										btCinque.setBackground(null);
									}
								}
							}
						}
					}

					bt=0;
					contatore=0;
				}

			}
			else {
				if(contatore==0) {
					bt=6;
					btSei.setEnabled(false);
					btSei.setBackground(Color.green);
					contatore++;
					indovinatoUno=3;
				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Memory();
	}

}
