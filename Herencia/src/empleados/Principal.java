package empleados;

public class Principal {

	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[2];
		EmpleadoFijo emp1 = new EmpleadoFijo("David", "1", "647382834", 2000);
		EmpleadoPorHora emp2 = new EmpleadoPorHora("Maria", "2", "678456354", 10, 50);
		empleados[0] = emp1;
		empleados[1] = emp2;
		for (int i = 0; i < empleados.length; i++) {
			System.out.print(empleados[i]);
			System.out.println(" "+empleados[i].calcularSalario());
		}
	}
}
