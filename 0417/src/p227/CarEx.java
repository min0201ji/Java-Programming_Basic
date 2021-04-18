package p227;

public class CarEx {
	public static void main(String ar[]) {
		Car c = new Car();
		c.speed = 60;
		System.out.println("수정된 속도 : " +c.speed);
		
		c.check();
	}
}
