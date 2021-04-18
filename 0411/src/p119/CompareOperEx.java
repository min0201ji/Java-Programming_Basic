package p119;

public class CompareOperEx {
	public static void main(String ar[]) {
		int num1 = 10;
		int num2 = 20;
		boolean result1 = (num1 == num2); //항상 왼쪽이 기준!
		System.out.println(result1);
		boolean result2 = (num1 != num2);
		System.out.println(result2);
		boolean result3 = (num1 >= num2);
		System.out.println(result3);
		boolean result4 = (num1 <= num2);
		System.out.println(result4);
		
		//p120
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		System.out.println("문자열비교1:"+(strVar1==strVar2));
		System.out.println("문자열비교2:"+(strVar1.equals(strVar2))); //같지않다는 (!strVar1~~~)))
		//문자열에서 같은값을 표현할때 == 안씀, equals 사용
		
		//String strVar1 = new String ("홍길동");
		//String strVar2 = new String ("홍길동");
		//System.out.println("문자열비교1:"+(strVar1==strVar2));
		//system.out.println("문자열비교2:"+(strVar1.equals(strVar2)));
	}
}
