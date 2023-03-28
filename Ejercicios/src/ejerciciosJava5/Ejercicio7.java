package ejerciciosJava5;

public class Ejercicio7 {

	public static void main(String[] args) {
		int numero = 100, suma = 0, contador = 0;
	
		for (int i = 0; i < numero ; i++) {
			if (i % 5 == 0 ) {
				contador++;
				suma += i;
			}
			if (contador == 10) {
				break;
			}
		}
	System.out.println("la suma de los numero es :"+suma);
	}
	

}
