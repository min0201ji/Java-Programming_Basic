package test1;

public class CarEx {
	public static void main(String ar[]) {
		Car c1 = new Car();
		c1.setSpeed(120); //값을 입력하기만 하면 되서 system~ 입력 불필요!
		System.out.println(c1.getSpeed());
		
		System.out.println(c1.isStop()); //값 없어서!
		
		c1.setStop(true);
		System.out.println(c1.isStop());
	}
}
