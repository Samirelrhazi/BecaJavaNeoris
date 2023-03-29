package banco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

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
			getCuentaAsociada().retirar("Retiro cajero credito",x);
		}else {
			System.out.println("el mínimo a retirar es de tres euros de 3€");
		}
		
	}

	@Override
	public void pagoEnEstablecimiento(String datos, double x) {
		getCuentaAsociada().retirar("Compra a crédito en "+datos,x);

	}
	
	public void liquidar(int mes, int year) {
		double l = 0.0;
		Movimiento mv = new Movimiento();
		mv.setConcepto("Liquidacion de operaciones tarjeta credito "+mes +" de "+ year);
		for (Iterator iterator = mMovimiento.iterator(); iterator.hasNext();) {
			Movimiento movimiento = (Movimiento) iterator.next();
			if (movimiento.getFecha().getMonthValue() == mes && movimiento.getFecha().getYear() == year ) {
				l+= movimiento.getImporte();
				iterator.remove();
			}
		}
	}
	
}
