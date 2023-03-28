package ejerciciosJava5;

public class Ejercicio3punto3 {
	public static void main(String[] args) {
		int dia = 20,mes = 8,año =2015;
		int [] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};
		if (mes >=1 && mes <= 12) {
				if(año !=0) {
					if (dia <= diasMes[mes-1]) {
						System.out.println("Fecha incorrecto");
					} else {
						System.out.println("Dia incorrecto");
					}
			}else {
				System.out.println("año incorrecto");
			}
			
		}else {
			System.out.println("mes incorrecto");
		}

	}
}
