package p73;

public class promotionEx {
	public static void main(String ar[]) {
		byte byteValue=10;
		int intValue=byteValue; //unsigned
		short shortValue;
		
		//Casting
		char charValue='가';
		shortValue=(short)charValue; //short가 음수범위를 가지고 있기에 오류나서 강제형변화해주어야한다
		//intValue=charValue;
	}
}
