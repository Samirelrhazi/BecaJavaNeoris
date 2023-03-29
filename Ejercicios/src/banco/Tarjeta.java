package banco;

import java.time.LocalDate;

public abstract class Tarjeta {
	private Cuenta mCuentaAsociada;
	private LocalDate mFechaDeCaducidad;
	private String mNumero;
	private String mTitular;
	
	public Tarjeta(LocalDate mFechaDeCaducidad, String mNumero, String mTitular) {
		super();
		this.setFechaDeCaducidad(mFechaDeCaducidad);
		this.setNumero(mNumero);
		this.setTitular(mTitular);
	}
	
	 public abstract double getSaldo();

	public abstract void ingresar(double x);
	
	public abstract void pagoEnEstablecimiento(String datos,double x);
	

	public abstract void retirar(double x) ;


	public void setCuenta(Cuenta c) {

	}

	public String getTitular() {
		return mTitular;
	}

	public void setTitular(String mTitular) {
		this.mTitular = mTitular;
	}

	public String getNumero() {
		return mNumero;
	}

	public void setNumero(String mNumero) {
		this.mNumero = mNumero;
	}

	public LocalDate getFechaDeCaducidad() {
		return mFechaDeCaducidad;
	}

	public void setFechaDeCaducidad(LocalDate mFechaDeCaducidad) {
		this.mFechaDeCaducidad = mFechaDeCaducidad;
	}

	public Cuenta getCuentaAsociada() {
		return mCuentaAsociada;
	}

	public void setCuentaAsociada(Cuenta mCuentaAsociada) {
		this.mCuentaAsociada = mCuentaAsociada;
	}
	
	
	
}
