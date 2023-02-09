package vehiculos;

public class Vehiculo {

	private String marca;
	private String matricula;
	private int numeroRuedas;
	private int autonomia;

	public Vehiculo(String marca, String matricula, int numeroRuedas, int autonomia) {
		this.marca = marca;
		this.matricula = matricula;
		this.numeroRuedas = numeroRuedas;
		this.autonomia = autonomia;
	}

	public String getMarca() {
		return marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public int getAutonomia() {
		return autonomia;
	}
	
}
