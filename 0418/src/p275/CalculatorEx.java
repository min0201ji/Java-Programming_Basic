package p275;

public class CalculatorEx {
	public static void main(String ar[]) {
		Calculator calc = new Calculator();
		System.out.println(calc.color); //값안넣어서 null
		System.out.println(calc.setcolor("블루"));
		System.out.println(calc.color);
		
//		System.out.println(calc.pi); 
//		- static(정적멤버)은 이미 공유하기 위해서 공간을 만들었기때문에
//		new객체 없이도 공간이 확보되어 있음. (한공간에서 다같이) 
//		but 인스탄스는 공간없어서 new로 만들어야 함. (여러공간 생성가능)
		System.out.println(Calculator.pi);
		System.out.println(Calculator.plus(10, 20));
		
	}
}
