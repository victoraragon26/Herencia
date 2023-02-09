package viviendas;

public class Vivienda {

	private int numHabitaciones;
	private double numCuadrados;
	private String calle;
	private int numero;

	public Vivienda(int numHabitaciones, 
				double numCuadrados, 
				String calle, 
				int numero) {

	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public double getNumCuadrados() {
		return numCuadrados;
	}

	public void setNumCuadrados(double numCuadrados) {
		this.numCuadrados = numCuadrados;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Vivienda [numHabitaciones=" + numHabitaciones + ", numCuadrados=" + numCuadrados + ", calle=" + calle
				+ ", numero=" + numero + "]";
	}
	
}
