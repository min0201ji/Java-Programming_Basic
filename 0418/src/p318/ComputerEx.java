package p318;

public class ComputerEx {
	public static void main(String ar []) {
		int r = 10;
		
		Calculator calc = new Calculator();
		System.out.println("������: "+calc.areaCircle(r));
		System.out.println();
		
		Computer cp = new Computer();
		System.out.println("������: "+cp.areaCircle(r));
		System.out.println();
	}
}
