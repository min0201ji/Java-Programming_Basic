package p154;

public class WhilePrintEx {
	public static void main(String ar[]) {
		
		int i=1;
		
//		while(i<=5) {
//			System.out.println("while()");
//			i++;
//		}
	
		do {
			System.out.println("do~while() 은 거짓이라도 한번은 실행된다.");
			i++;
		}while(i<=3);
	}
}
