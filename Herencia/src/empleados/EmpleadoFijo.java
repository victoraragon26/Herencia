package empleados;

public class EmpleadoFijo extends Empleado {

	private double salarioMes;

	public EmpleadoFijo(String nombre, String dni, String telefono, double salarioMes) {
		super(nombre, dni, telefono);
		// TODO Auto-generated constructor stub
		this.salarioMes = salarioMes;
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return salarioMes;
	}

}
