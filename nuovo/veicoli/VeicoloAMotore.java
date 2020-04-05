package veicoli;
public class VeicoloAMotore extends Garage{
	
	private int annoImmacolazione;
	private String marca;
	private String tipoAlimentazione;
	private int cilindrata;
	
	public VeicoloAMotore() {
		annoImmacolazione = 0;
		marca = "";
		cilindrata = 0;
	}

	public VeicoloAMotore(int annoImmacolazione, String marca, String tipoAlimentazione, int cilindrata) {
		this.annoImmacolazione = annoImmacolazione;
		this.marca = marca;
		this.tipoAlimentazione = tipoAlimentazione;
		this.cilindrata = cilindrata;
	}

	public int getAnnoImmacolazione() {
		return annoImmacolazione;
	}

	public void setAnnoImmacolazione(int annoImmacolazione) {
		this.annoImmacolazione = annoImmacolazione;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipoAlimentazione() {
		return tipoAlimentazione;
	}

	public void setTipoAlimentazione(String tipoAlimentazione) {
		this.tipoAlimentazione = tipoAlimentazione;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	public void visualizza() {
		
	}
	
	public void inserisci() {
		
	}
}
