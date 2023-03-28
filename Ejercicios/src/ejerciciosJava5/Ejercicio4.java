package ejerciciosJava5;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		String[] decenas = {"Dieci","Veinti","treinte", "cuarenta","Cincuenta","Sesenta","Setenta", "Ochenta","Noventa"};
		String[] unidades = {"cero","uno","dos","tres", "cuatro", "cinco", "seis" ,"siete", "ocho", "nueve"};
		String[] excepciones = {"diez","once","doce","trece", "catorce", "quince"};
		System.out.println("dame un nuemro");
		String numero= datos.nextLine();
		String resultado;
		int num = Integer.parseInt(numero);
		
		if (num >= 0 && num <= 9) {
			resultado = unidades[Character.getNumericValue(numero.charAt(0))];
		} else if (num >= 10 && num <= 15) {
			resultado = excepciones[Character.getNumericValue(numero.charAt(1))];
		}else if (num >= 17 && num <= 19 || num >= 21 && num <= 29 ) {
			resultado = decenas[Character.getNumericValue(numero.charAt(0)) -1] + unidades[Character.getNumericValue(numero.charAt(1))];
		}else if (num % 10 == 0) {
			if(num ==20) {
				resultado = "veinte";
			}else {
				resultado = decenas[Character.getNumericValue(numero.charAt(0)) -1];
			}		
		}else {
			resultado = decenas[Character.getNumericValue(numero.charAt(0)) -1] + " y "+unidades[Character.getNumericValue(numero.charAt(1))]; 
		}
		System.out.println(resultado);
		
	}

}
