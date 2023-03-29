package banco;

import java.time.LocalDate;
import java.util.ArrayList;

public class Credito extends Tarjeta {
	private double mCredito;
	private ArrayList<Movimiento> mMovimiento ;
	
	public Credito(LocalDate mFechaDeCaducidad, String mNumero, String mTitular) {
		super(mFechaDeCaducidad, mNumero, mTitular);
		// TODO Auto-generated constructor stub
	}
	
	public double getCredito() {
		return mCredito;
	}

	public void setCredito(double Credito) {
		this.mCredito = Credito;
	}

	@Override
	public double getSaldo() {
		return getCuentaAsociada().getSaldo();
	}
	
	@Override
	public void ingresar(double x) {
		getCuentaAsociada().ingresar("cajero automático",x);
		
	}

	public void retirar(double x) {
		if (x >= 3) {
			x-= x*0.05;
			getCuentaAsociada().retirar(x);
		}else {
			System.out.println("el mínimo a retirar es de tres euros de 3€");
		}
		
	}

	public void pagoEnEstablecimiento(String datos, double x) {
		System.out.println("Compra a crédito en: " + datos + " - Total = " + x);
	}
	
	
	public void liquidar(int mes, int year) {
		
	}
	
}
