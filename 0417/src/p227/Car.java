package p227;

public class Car {
	
	Car(){}//�⺻������
	
//	Car(int num){}
//	
//	//Car(int num){} �����ε�
//	
//	Car(String str){}
//	
//	
//	Car(String str, int num){}
	String company = "�����ڵ���";
	String model = "�׷���";
	String colour = "����";
	int maxSpeed=350;
	int speed;
	
	public void check() {
		int num=speed;
		System.out.println("Car.check() : "+num);
		//local �������� �ʱ�ȭ�� ��Ű�� ������ ��� X
	}
}
