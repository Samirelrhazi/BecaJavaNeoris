package ejerciciosJava4;

import com.datos.Datos2;

public class Factura {
	static int cantidad =3;
	static int unidades= 12;
	static double precio =5.4;
	static double importe=  (cantidad * unidades) * precio ;
	static int total =(int) ((int) Math.floor(importe +(importe * 0.21)));
	
	public static void main(String[] args) {
		System.out.println("Cantidad\t"+ cantidad);
		System.out.println("unidades\t"+ unidades);
		System.out.println("Precio\t"+ precio);
		System.out.println("Importe\t"+ importe);
		System.out.println("IVA\t"+ (importe * 0.21));
		System.out.println("Total\t"+ total);


	}
}
