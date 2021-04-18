package p76;

public class ByteOperationEx {
	public static void main(String ar[]) {
		byte num1=10;
		byte num2=20;
		//byte result=num1+num2;//저장공간끼리 연산을 해버리면 byte가 자동으로 int로 바뀜 그래서 오류뜸
		//그래서 byte result=(byte)(num1+num2); 이렇게 하면 가능(배운곳까지)
		//num1+num2 은 저장공간(이미값이있는)끼리의 연산 *한번더 복습!
		System.out.println("답");
		
		
		//p.80 code
		int x=1;
		int y=2;
		//double result = x/y; //정수 범위에서 0.5는 포함이 안되기 때문에 0.0이 나옴
		double result=(double)x/y; //그래서 double을 씌워줘야된다.
		System.out.println("실수 결과값: "+result); 
		
		System.out.println(y+"123"); //"123"이 문자열이여서 결과가 2123으로 나옴
	}
}
