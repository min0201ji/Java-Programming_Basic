package p275;

public class CalculatorEx {
	public static void main(String ar[]) {
		Calculator calc = new Calculator();
		System.out.println(calc.color); //���ȳ־ null
		System.out.println(calc.setcolor("���"));
		System.out.println(calc.color);
		
//		System.out.println(calc.pi); 
//		- static(�������)�� �̹� �����ϱ� ���ؼ� ������ ������⶧����
//		new��ü ���̵� ������ Ȯ���Ǿ� ����. (�Ѱ������� �ٰ���) 
//		but �ν�ź���� ������� new�� ������ ��. (�������� ��������)
		System.out.println(Calculator.pi);
		System.out.println(Calculator.plus(10, 20));
		
	}
}
