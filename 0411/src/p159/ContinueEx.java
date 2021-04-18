package p159;

public class ContinueEx {
	public static void main(String ar[]) {
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
