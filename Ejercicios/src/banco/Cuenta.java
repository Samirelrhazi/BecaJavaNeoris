package banco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Cuenta {
	private ArrayList<Movimiento> mMovimientos;
	private  Tarjeta mCuentaAsociada;
	private String mNumero;
	private String mTitular;

	public Cuenta(String mNumero, String mTitular) {
		this.setNumero(mNumero);
		this.setTitular(mTitular);
	}

	public void addMovimientos(Movimiento m) {
		mMovimientos.add(m);
	}

	public double getSaldo() {
		double saldo = 0;
		for (Movimiento movimiento : mMovimientos) {
			saldo += movimiento.getImporte();
		}
		return saldo;
	}

	public void ingresar(double x) {

		ingresar("Ingreso ",x);
		}

	public void ingresar(String concepto, double x) {

		Movimiento mv = new Movimiento();
		if (x >= 1 ) {
			mv.setConcepto(concepto);
			mv.setImporte(x);
			addMovimientos(mv);
		} else {
			System.out.println("no se pueden ingresar sumas negativas");
		}

	}

	public void retirar(double x) {
		retirar("Retiro de dinero ",x);
	}

	public void retirar(String concepto, double x) {
		Movimiento mv = new Movimiento();
		if(getSaldo() > x) {
			mv.setConcepto(concepto);
			mv.setImporte(-x);
			addMovimientos(mv);
			}else {
				System.out.println("Saldo en cuenta insuficiente.");
			}

	}

	public String getNumero() {
		return mNumero;
	}

	public void setNumero(String mNumero) {
		this.mNumero = mNumero;
	}

	public String getTitular() {
		return mTitular;
	}

	public void setTitular(String mTitular) {
		this.mTitular = mTitular;
	}

}
