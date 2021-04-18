package p318;

public class ComputerEx {
	public static void main(String ar []) {
		int r = 10;
		
		Calculator calc = new Calculator();
		System.out.println("원면적: "+calc.areaCircle(r));
		System.out.println();
		
		Computer cp = new Computer();
		System.out.println("원면적: "+cp.areaCircle(r));
		System.out.println();
	}
}
