package p280;

public class SingletonEx {

	public static void main(String[] args) {
//		Singleton sgt = new Singleton(); -> ���ٺҰ�

		Singleton sgt1 = Singleton.getInstance();
		Singleton sgt2 = Singleton.getInstance();
		
		if(sgt1.equals(sgt2)) {
			System.out.println("����.");
		}
	}

}
