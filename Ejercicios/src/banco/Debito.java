package banco;

import java.time.LocalDate;

public class Debito extends Tarjeta {

	public Debito(LocalDate FechaDeCaducidad, String Numero, String Titular) {
		super(FechaDeCaducidad, Numero, Titular);
	}

	@Override
	public double getSaldo() {
		
		return getCuentaAsociada().getSaldo();
	}
	
	@Override
	public void ingresar(double x) {
		getCuentaAsociada().ingresar("cajero automático",x);
		
	}
	
	@Override
	public void retirar(double x) {
		getCuentaAsociada().retirar("Retiro cajero",x);
	}
	
	@Override
	public void pagoEnEstablecimiento(String datos, double x) {
		getCuentaAsociada().retirar("Compras en "+datos,x);

	}


}
