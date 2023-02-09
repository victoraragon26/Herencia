package viviendas;

public class TestViviendas {

	public static void main(String[] args) {
		Vivienda casa = new Vivienda(3,80.0,"Velazquez",4);
		Chalet chalet1 = new Chalet(5,150.0,"Goya",120,5.0,false);
		Chalet chalet2 = new Chalet(3,140.5,"La Albufera",80,10.0,true);
		Palacio palacio = new Palacio(500.0,"Serrano",2,true);
		
		System.out.println(casa);
		System.out.println(chalet1);
		System.out.println(chalet2);
		System.out.println(palacio);
	}
}
