package p239;

public class Car {

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
		
	}
	Car(String model){
		this(model, "노랑", 200); // = Car(){} 호출/ 중복은 X
//		this.model = model;
//		//컬러
//		//스피드
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
		//스피드
		
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
			
	}		
		
}

//p.245
// 1. Board
