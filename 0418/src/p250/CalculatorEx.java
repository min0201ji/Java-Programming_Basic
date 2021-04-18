package p250;

public class CalculatorEx {
	public static void main(String ar[]) {
		
		Calculator calc = new Calculator();
		calc.powerOn();
		
		//System.out.println(calc.plus(10, 20));
		calc.execute();
		
		calc.powerOff();
	}
}
