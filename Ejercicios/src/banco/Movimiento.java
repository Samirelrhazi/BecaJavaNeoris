package banco;

import java.time.LocalDate;
import java.util.ArrayList;

public class Movimiento  {
	private String mConcepto;
	private LocalDate mFecha;
	private double mImporte;
	
	public Movimiento() {
	}

	public String getConcepto() {
		return mConcepto;
	}

	public void setConcepto(String mConcepto) {
		this.mConcepto = mConcepto;
	}

	public LocalDate getmFecha() {
		return mFecha;
	}

	public void setFecha(LocalDate mFecha) {
		this.mFecha = mFecha;
	}

	public double getImporte() {
		return mImporte;
	}

	public void setImporte(double mImporte) {
		this.mImporte = mImporte;
	}
	
	
	
}
