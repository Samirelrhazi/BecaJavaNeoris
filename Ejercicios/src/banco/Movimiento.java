package banco;

import java.time.LocalDate;
import java.util.ArrayList;

public class Movimiento  {
	private String mConcepto;
	private LocalDate mFecha;
	private double mImporte;
	
	public Movimiento() {
		mFecha = LocalDate.now();
	}

	public String getConcepto() {
		return mConcepto;
	}

	public void setConcepto(String mConcepto) {
		this.mConcepto = mConcepto;
	}

	public LocalDate getFecha() {
		return mFecha;
	}

	public double getImporte() {
		return mImporte;
	}

	public void setImporte(double mImporte) {
		this.mImporte = mImporte;
	}
	
	
	
}
