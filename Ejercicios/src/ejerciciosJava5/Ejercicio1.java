package ejerciciosJava5;

public class Ejercicio1 {

	public static void main(String[] args) {
		int a = 10;
		int b =20;
		if (a==b) {
			System.out.println(b+" es igual que "+a);
		}else {
			if(a>b) {
				System.out.println(a + " es mayor que " + b);
			} else {
				System.out.println(b + " es mayor que " + a);
			}

		}
				
		if (a% b == 0) {
			System.out.println("Son multiplos ");
		}else {
			
			System.out.println("No son multiplos ");
		}
		
	}

}
