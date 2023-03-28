package com.datos;

public class main {

	public static void main(String[] args) {
		Datos2 datos = new Datos2();
		
		System.out.println("Dia\t"+datos.getDia());
		datos.setDia(12);
		System.out.println("Dia cambiado\t"+datos.getDia());

		System.out.println("DNI\t"+datos.getnDni());
		datos.setnDni(213124122);
		System.out.println("DNI cambiado\t"+datos.getnDni());
		System.out.println("Precio\t"+datos.getPrecio());
		datos.setPrecio(2.2);
		System.out.println("Precio cambiado\t"+datos.getPrecio());
		System.out.println("ACTIVO?\t"+datos.isACTIVO());
	}

}
