package p250;

public class Calculator {
	
	//�⺻����������
	
	void powerOn() {
		//����Ÿ�Ծ���
		//method�̸� powerOn
		//�Ű����� ���� ����
		System.out.println("���� ������ �մϴ�.");
		//return; -> �����Ұ��� ��� �����ص� ��
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
		println("������ : "+result);
	}
	
	void println(String msg) {
		System.out.println(msg);
	}
	
	void powerOff() {
		//����Ÿ�Ծ���
		//method�̸� powerOff
		//�Ű����� ���� ����
		System.out.println("���� ������ ���ϴ�.");
	}
}
