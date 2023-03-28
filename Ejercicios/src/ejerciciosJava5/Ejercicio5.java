package ejerciciosJava5;

public class Ejercicio5 {
	public static void main(String[] args) {

		int numero , cuadrado;
		for (int i = 0; i < args.length; i++) {
			numero = Integer.parseInt(args[i]);
			cuadrado = numero + numero;
			System.out.println("el cuadrado de "+ numero+" es: " + cuadrado );
		}

	}
}
