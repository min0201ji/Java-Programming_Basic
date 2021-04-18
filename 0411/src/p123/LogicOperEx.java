package p123;

public class LogicOperEx {
	public static void main(String ar[]) {
		int charCode='A';
		
		
		if((charCode>=65)&(charCode<=90)) {
		 System.out.println("참");
		}
		
		if((charCode>=97)&&(charCode<=122)) {
			 System.out.println("거짓"); //참이 아니여서 결과 추출 X
			}
		
		int value = 6;
		if((value%2==0)&&(value%3==0)) {
			 System.out.println("2 또는 3의 배수");
		}
	}
}