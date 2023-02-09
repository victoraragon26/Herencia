package viviendas;

public class Palacio extends Vivienda {

	private boolean chofer;

	public Palacio(double numCuadrados, String calle, int numero, boolean chofer) {
		super(10, numCuadrados, calle, numero);
	}

	public boolean isChofer() {
		return chofer;
	}

	public void setChofer(boolean chofer) {
		this.chofer = chofer;
	}

	@Override
	public String toString() {
		return super.toString() + "Palacio [chofer=" + chofer + "]";
	}

}
