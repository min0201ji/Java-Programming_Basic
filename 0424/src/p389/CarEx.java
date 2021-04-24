package p389;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		
		car.frontLeftTire=new KumhoTire();
		car.frontRightTire=new KumhoTire();
		
		car.run();
	}
}
