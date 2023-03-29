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

	public double getSaldo() {
		return 0.0;
	}

	public void ingresar(double x) {

	}
	public void liquidar(int mes, int año) {
		
	}
	
	public void pagoEnEstablecimiento(String datos,double x) {

	}
	
	
	public void retirar(double x) {

	}
	
}
