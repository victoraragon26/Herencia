package viviendas;

public class Chalet extends Vivienda {

	private double metrosJardin;
	private boolean piscina;

	public Chalet(int numHabitaciones, double numCuadrados, String calle, int numero, double metrosJardin,
			boolean piscina) {
		super(numHabitaciones, numCuadrados, calle, numero);
		// TODO Auto-generated constructor stub
		this.metrosJardin = metrosJardin;
		this.piscina = piscina;

	}

	public double getMetrosJardin() {
		return metrosJardin;
	}

	public void setMetrosJardin(double metrosJardin) {
		this.metrosJardin = metrosJardin;
	}

	public boolean isPiscina() {
		return piscina;
	}

	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

	@Override
	public String toString() {
		return super.toString() + "Chalet [metrosJardin=" + metrosJardin + ", piscina=" + piscina + "]";
	}

}
