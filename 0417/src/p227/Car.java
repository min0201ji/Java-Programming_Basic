package p227;

public class Car {
	
	Car(){}//기본생성자
	
//	Car(int num){}
//	
//	//Car(int num){} 오버로딩
//	
//	Car(String str){}
//	
//	
//	Car(String str, int num){}
	String company = "현대자동차";
	String model = "그랜저";
	String colour = "검정";
	int maxSpeed=350;
	int speed;
	
	public void check() {
		int num=speed;
		System.out.println("Car.check() : "+num);
		//local 변수들은 초기화를 시키지 않으면 사용 X
	}
}
