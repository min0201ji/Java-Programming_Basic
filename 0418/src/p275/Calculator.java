package p275;

public class Calculator {
	
	String color;
	static double pi=3.14159;
	
	//new ��ü�� ������ ��� ����
	String setcolor(String color) {
		this.color=color;
		return this.color;
				
	}
	//class �̸��� ������ �ͼ� ��� ����
	static int plus(int num1, int num2) {
		return num1+num2;
	}
	
	static int minus(int num1, int num2) {
		return num1-num2;
	}
}
