package empleados;

public class EmpleadoPorHora extends Empleado {

	private int numHoras;
	private double salarioHora;
	
	public EmpleadoPorHora(String nombre, String dni, String telefono, int numHoras, double salarioHora) {
		super(nombre, dni, telefono);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return numHoras*salarioHora;
	}
	
}
