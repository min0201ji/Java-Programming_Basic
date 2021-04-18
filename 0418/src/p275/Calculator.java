package p275;

public class Calculator {
	
	String color;
	static double pi=3.14159;
	
	//new 객체를 만들어야 사용 가능
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
