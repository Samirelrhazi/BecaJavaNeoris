package exepciones;

public class DivisorCeroBase {

	public static void main(String[] args) {
		int a = 0,b = 300,c;
		
		try {
		c = b/a;
		System.out.println("el resultado"+ c);
		} catch (ArithmeticException e) {
			System.out.println("se ha producido un error");
			e.printStackTrace();
			throw(e);
		}finally {
			System.out.println("Programa finalizado");
		}
		System.out.println("Programa finalizado2");
	}

}
