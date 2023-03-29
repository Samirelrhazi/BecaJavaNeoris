package intertcambio;

public class Intercambio <T> {
	private T t1;
	private T t2;

	public Intercambio(){
	 super();
	}
	
	public Intercambio( T a, T b) {
		this.t1 = a;
		this.t2 = b;
	}

	public T getT1() {
		return t1;
	}

	public void setT1(T t1) {
		this.t1 = t1;
	}

	public T getT2() {
		return t2;
	}

	public void setT2(T t2) {
		this.t2 = t2;
	}
	public   void invierte() {
		T t3 = getT2();
		setT2(getT1());
		setT2(t3);
		System.out.println(" "+getT1());
		System.out.println(" "+getT2());
	}
	
}
