package p212;

public class Person {
//	public Person() { // -> �⺻ �����ڴ� method�� �ٸ�, ���� �⺻���� �ְ� ��ü(ex.void)�� ����!
//		
//	}
	public static void main(String ar[]) {
		
		String colour;
		String speed;
		
		Car c=new Car(); //-> ����
		//Car c; -> �Ұ���
		colour = c.colour;
	}
}

class Car{
	String colour="red";
	String speed="50km";
}

// Ch06-Class�� ���Ͽ�
//public class Person{
//	String name="ȫ�浿";
//	int age=20;
//	
//	public String smile() {
//		return"������";
//	}
//	
//	public String eat() {
//		return"���ִ�";
//	}
//	
//}
