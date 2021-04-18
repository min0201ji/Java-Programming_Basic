package p148;

public class ForPrintEx {
	public static void main(String ar[]) {
	
		int sum = 0;
		sum = sum +1;
		sum = sum +2;
		sum = sum +3;
		sum = sum +4;
		sum = sum +5;
		System.out.println("합:"+sum);
		
		// ↓ i=0 시작값(처음한번만 쓰고 안씀)(0부터 시작), i<=5 조건값(참일떄까지), i++ 증감식(조건이 참일때만 증감)
		for(int i=0; i<=5; i++) {
			System.out.println();
		}
	}
}
