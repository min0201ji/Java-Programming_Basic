package p250;

public class Calculator {
	
	//기본생성자있음
	
	void powerOn() {
		//리턴타입없음
		//method이름 powerOn
		//매개변수 아직 없음
		System.out.println("계산기 전원을 켭니다.");
		//return; -> 전달할것이 없어서 생략해도 됨
	}
	
	int plus(int num1, int num2) {
		int result = num1 + num2;
		return result
				;
	}
	
//	double divide(int num1, int num2) {
//		double result = (double)num1 / (double)num2;
//		return result;
//	}
	
	double avg(int num1, int num2) {
		double sum = plus(num1, num2);
		double result = sum/2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		println("실행결과 : "+result);
	}
	
	void println(String msg) {
		System.out.println(msg);
	}
	
	void powerOff() {
		//리턴타입없음
		//method이름 powerOff
		//매개변수 아직 없음
		System.out.println("계산기 전원을 끕니다.");
	}
}
