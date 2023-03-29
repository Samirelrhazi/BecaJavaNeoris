package banco;

import java.time.LocalDate;

public class Debito extends Tarjeta {

	public Debito(LocalDate FechaDeCaducidad, String Numero, String Titular) {
		super(FechaDeCaducidad, Numero, Titular);

	}

//	public double getSaldo() {
//		double saldo = 0;
//		for (Movimiento movimiento : mMovimientos) {
//			saldo += movimiento.getImporte();
//		}
//		return saldo;
//	}
//
//	public void ingresar(double x) {
//		   
//
//		}

	public void retirar(double x) {

	}

	public void pagoEnEstablecimiento(String datos, double x) {
		System.out.println("Compras en : " + datos + " - Total = " + x);
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void ingresar(double x) {
		// TODO Auto-generated method stub
		
	}

}
