package ejerciciosJava4;

public class Geometria {
	final static int RADIO = 23;
	static double area, longitud;
	public static void main(String[] args) {
		area = Math.PI*Math.pow(RADIO, 2);
		System.out.println("El Area del circulo es:\t"+ area);
		longitud = Math.PI*RADIO;
		System.out.println("la longitud del circulo es:\t"+ longitud);
	}

}
