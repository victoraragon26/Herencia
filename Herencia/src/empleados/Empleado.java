package empleados;

public abstract class Empleado {
	private String nombre;
	private String dni;
	private String telefono;

	public Empleado(String nombre, String dni, String telefono) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
	}

	public abstract double calcularSalario();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nombre+"-"+dni+"-"+telefono;
	}

}
