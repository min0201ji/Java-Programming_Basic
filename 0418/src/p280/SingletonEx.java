package p280;

public class SingletonEx {

	public static void main(String[] args) {
//		Singleton sgt = new Singleton(); -> 접근불가

		Singleton sgt1 = Singleton.getInstance();
		Singleton sgt2 = Singleton.getInstance();
		
		if(sgt1.equals(sgt2)) {
			System.out.println("같다.");
		}
	}

}
