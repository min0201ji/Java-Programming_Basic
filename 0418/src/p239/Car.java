package p239;

public class Car {

	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
		
	}
	Car(String model){
		this(model, "���", 200); // = Car(){} ȣ��/ �ߺ��� X
//		this.model = model;
//		//�÷�
//		//���ǵ�
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
		//���ǵ�
		
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
			
	}		
		
}

//p.245
// 1. Board
