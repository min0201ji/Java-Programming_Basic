package p280;

public class Singleton {
	
	private static Singleton sgt = new Singleton();
	private Singleton() {}
	
	static Singleton getInstance() {
		return sgt;
	}
	
}
