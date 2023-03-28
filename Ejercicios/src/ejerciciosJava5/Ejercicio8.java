package ejerciciosJava5;

public class Ejercicio8 {

	public static void main(String[] args) {
		int num = 8, resultado = 1;
		
		for (int i = 1; i <= num ; i++) {
			resultado *=i;
		}
		System.out.println("el factorial es"+resultado);
	}

}
