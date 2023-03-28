package ejerciciosJava5;

public class Ejercicio3 {
	public static void main(String[] args) {
		int dia = 20,mes = 8,año =2015;
		
		if(dia >= 1 && dia <=30 ) {
			if (mes >=1 && mes <= 12) {
				if(año==0) {
					System.out.println("Fecha incorrecto");
				}else {
					System.out.println("año incorrecto");
				}
			}else {
				System.out.println("mes incorrecto");
			}
			
		}else {
			System.out.println("dia incorrecto");
		}
		
		
	}
}
