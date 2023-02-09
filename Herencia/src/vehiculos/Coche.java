package vehiculos;

public class Coche extends Vehiculo {

	private String color;
	private int numeroPasajeros;
	private boolean descapotable;

	public Coche(String marca, String matricula, int numeroRuedas, int autonomia, String color, int numeroPasajeros,
			boolean descapotable) {
		super(marca, matricula, numeroRuedas, autonomia);
		// TODO Auto-generated constructor stub
		this.color = color;
		this.numeroPasajeros = numeroPasajeros;
		this.descapotable = descapotable;
	}

	@Override
	public String toString() {
		return "Coche [color=" + color + ", numeroPasajeros=" + numeroPasajeros + ", descapotable=" + descapotable
				+ "]";
	}

	public String getColor() {
		return color;
	}

	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}

	public boolean isDescapotable() {
		return descapotable;
	}
	
	public void pintar(String color) {
		this.color = color;
	}
}
