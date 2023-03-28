package ejerciciosJava5;

public class Ejercicio3Punto2 {

	public static void main(String[] args) {
		int dia = 20,mes = 8,año =2015;
		boolean isReal = false;
		if (mes >=1 && mes <= 12) {
				if(año !=0) {
					switch (mes) {
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						if (dia <=31) {
							isReal = true;
						}
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						if (dia <=30) {
							isReal = true;
						}
						break;
					default:
						if (dia <=28) {
							isReal = true;
						}
						break;
					}
					if (isReal) {
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
