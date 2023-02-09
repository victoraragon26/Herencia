package vehiculos;

public class Camion extends Vehiculo {

	private int limiteCarga;
	private int carga;
	private String conductor;

	public Camion(String marca, String matricula, int numeroRuedas, int autonomia, int limiteCarga, int carga,
			String conductor) {
		super(marca, matricula, numeroRuedas, autonomia);
		this.limiteCarga = limiteCarga;
		this.carga = carga<=limiteCarga?carga:limiteCarga;
		/* Es lo mismo que lo anterior
		if (carga<=limiteCarga) {
			this.carga = carga;
		}
		else {
			this.carga=limiteCarga;
		}*/
		this.conductor = conductor;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}

	public void setLimiteCarga(int limiteCarga) {
		this.limiteCarga = limiteCarga;
	}

	@Override
	public String toString() {
		return "Camion [limiteCarga=" + limiteCarga + ", carga=" + carga + ", conductor=" + conductor + "]";
	}
	

}
