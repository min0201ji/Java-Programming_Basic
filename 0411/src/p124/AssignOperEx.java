package p124;

public class AssignOperEx {
	public static void main(String ar[]) {
		int result=0;
		result+=10; //result=result+10;
		System.out.println("결과값 : "+result);

	}

	
		
	public static void main2(String ar[]) {
		byte result=0;
		byte num=10;
		result+=num; //result=result+10; +=은 처음의 유형을 그대로 관리하기 위해 사용, 그래서 byte가 int로 변환되지 않고 사용가능
		System.out.println("결과값 : "+result);
	
	}
}
