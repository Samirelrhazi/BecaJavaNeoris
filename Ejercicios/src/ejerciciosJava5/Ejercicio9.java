package ejerciciosJava5;

public class Ejercicio9 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Tabla del "+ i);
			System.out.println("-----------");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i+" x "+ j +" = "+(i*j));
			}
			System.out.println();
		}

	}

}
