package p64;

public class UniEx {
	public static void main(String ar[]) {
		char c1='a';  //" " 사용 -> 문자열(string), character는 문자라서 -> ' '사용
		//문자는 양의범위(unsigned)만 가진다
		int num;
		num=c1; //"숫자 :"+num => 97<accii 코드표>
		c1=(char)num; //num(3)을 c1(2)에 넣어야 되기 때문에 (char)을 써서 문자로 변환
		//유니코드!!
		
		System.out.println("숫자 : "+c1); //c1대신에 num 넣으면 결과는 97나옴
	}
}
