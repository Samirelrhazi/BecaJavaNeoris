package ejerciciosJava5;

public class Ejercicio11 {

	public static void main(String[] args) {
		mostrarPrimos();
		
		
	}
	public static void mostrarPrimos() {
		int contador =0;
	    for (int i = 2; i <= 100; i++) {
	        boolean isPrimo = true;
	        for (int j = 2; j < i; j++) {
	            if (i % j == 0) {
	                isPrimo = false;
	                break;
	            }
	        }
	        if (isPrimo) {
	            System.out.print(i+ " "); 
	            contador++;
	        }
	    }
	    System.out.println();
	    System.out.println("existen "+contador +" primos");
	}
}
