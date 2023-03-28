package ejerciciosJava5;

public class Ejercicio7 {

	public static void main(String[] args) {
		int numero = 73;
		boolean isPrimo= true;
		for (int i = 2; i <= numero/2; i++) {
			if (numero % i == 0) {
				isPrimo = false;
			}
		}
		if (isPrimo) {
			System.out.println(numero+" es primo" );
		}else {
			System.out.println(numero+" no es primo" );
		}
		
	}

}
