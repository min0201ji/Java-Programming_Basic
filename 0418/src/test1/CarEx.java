package test1;

public class CarEx {
	public static void main(String ar[]) {
		Car c1 = new Car();
		c1.setSpeed(120); //���� �Է��ϱ⸸ �ϸ� �Ǽ� system~ �Է� ���ʿ�!
		System.out.println(c1.getSpeed());
		
		System.out.println(c1.isStop()); //�� ���!
		
		c1.setStop(true);
		System.out.println(c1.isStop());
	}
}
