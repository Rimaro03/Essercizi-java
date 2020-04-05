/**
 * 	Classe Cerchio
 * 	@author 3AI
 * 
 **/

package cerchioPro;

public class Cerchio {

	private int raggio;
	final double pg = 3.14;
	/**
	 * costruttore di default
	 * 
	 * 
	 **/
	public Cerchio() {
		raggio=0;
	}
	
	public Cerchio(int r){
		raggio=r;
	}
	public void visualizza() {
		System.out.println("Il raggio è "+raggio);
	}
	
	public double calcoloCirconferenza() {
		double c;
		c=2*pg*raggio;
		return c;
	}
	
	public double calcoloArea() {
		double a;
		a=pg*(raggio*raggio);
		return a;
	}
	
	public void setRaggio(int r) {
		raggio=r;
	}
	
	public int getRaggio() {
		return raggio;
	}
}
