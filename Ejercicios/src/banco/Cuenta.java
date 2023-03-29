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

		Movimiento movimiento = new Movimiento();
		if (x >= 1 ) {
			movimiento.setImporte(x);
			addMovimientos(movimiento);
		} else {
			System.out.println("no se pueden ingresar sumas negativas");
		}

		}

	public void ingresar(String concepto, double x) {

		Movimiento movimiento = new Movimiento();
		if (x >= 1 ) {
			movimiento.setConcepto(concepto);
			movimiento.setImporte(x);
			addMovimientos(movimiento);
		} else {
			System.out.println("no se pueden ingresar sumas negativas");
		}

	}

	public void retirar(double x) {
		Movimiento movimiento = new Movimiento();
		if(getSaldo() > x) {
			movimiento.setImporte(x*-1);
			addMovimientos(movimiento);
			}else {
			System.out.println("Saldo en cuenta insuficiente.");
			}
	}

	public void retirar(String concepto, double x) {
		Movimiento movimiento = new Movimiento();
		if(getSaldo() > x) {
			movimiento.setConcepto(concepto);
			movimiento.setImporte(x*-1);
			addMovimientos(movimiento);
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
