package p318;

public class Computer extends Calculator {

//	-source -> override/implement...
//	@Override
//	double areaCircle(double r) {
//		// TODO Auto-generated method stub
//		System.out.println("Computer.areaCircle()실행!!");
//		return super.areaCircle(r); -> return Math.PI* r * r; 
//	}

//	Overriding 만들기 (1)
	double areaCircle(double r) {
		System.out.println("Computer.areaCircle()실행!!");
		return Math.PI* r * r;
	}
	
	
}
