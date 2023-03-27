package com.datos;

public class Datos1 {

	public static void main(String[] args) {
		/*
		 * Escribe la clase Datos, en la misma, define las siguientes variables:
		 * dia, con un valor inicial de 10
		 * nDni, para números de DNI, con un valor inicial de 57.433.222
		 * precio para valores numéricos con dos decimales
		 * una costante con nombre «ACTIVO», y con valor true
		 * carga la variable precio con el valor 135.12
		 * Preséntalo todo en consola con un aspecto semejante a este:
		 * 2015-09-24_19h43_44
		 * Por ultimo, modificar el programa, guardándolo con el nombre Datos2, y haciendo que las variables puedan ser vistas por cualquier método de la clase.
		  */
		int dia =20;
		long nDni =57443222;
		double precio;
		final boolean ACTIVO = true;
		precio = 135.12;
		System.out.println("Dia\t"+dia);
		System.out.println("DNI\t"+nDni);
		System.out.println("Precio\t"+precio);
		System.out.println("ACTIVO?\t"+ACTIVO);
		
	}

}
