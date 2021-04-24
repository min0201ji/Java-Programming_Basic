package p275;

public class Calculator {
	
	
	//기본생성자(있음)
	String color;
	static double pi=3.14159;
	
	//new 객체를 만들어야 사용 가능
	//static : 정적인멤버(new라는 생성연산자 사용X), 
	//instance: 인스턴스멤버(new라는 생성연산자 사용O)
	String setcolor(String color) {
		this.color=color;
		return this.color;
				
	}
	//class 이름만 가지고 와서 사용 가능
	static int plus(int num1, int num2) {
		return num1+num2;
	}
	
	static int minus(int num1, int num2) {
		return num1-num2;
	}
}
