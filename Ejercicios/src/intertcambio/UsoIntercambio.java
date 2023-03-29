package intertcambio;

public class UsoIntercambio {

	public static void main(String[] args) {
		Intercambio<String> prueba1 = new Intercambio<String>("Samir","JUan");
		Intercambio<Character> prueba2 = new Intercambio<Character>('H','M');
		System.out.println(prueba1.getT1()+" "+prueba1.getT2());
		System.out.println(prueba2.getT1()+" "+prueba2.getT2());
		prueba1.invierte();
		prueba2.invierte();

	}

}
