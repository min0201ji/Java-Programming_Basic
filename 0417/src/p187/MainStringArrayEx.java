package p187;

public class MainStringArrayEx {
	public static void main(String ar[]) {
		if(ar.length!=2) {
			System.out.println("문자열로 2개의 값을 입력하세요.");
			System.exit(0);
		}
		
		String strNum1=ar[0]; //=10		
		String strNum2=ar[1]; //=20
		
		//String => int
		int num1, num2, result;
		num1=Integer.parseInt(strNum1);
		num2=Integer.parseInt(strNum2);
		result=num1+num2;
		System.out.println("결과값 : "+result) ;
	}
}
