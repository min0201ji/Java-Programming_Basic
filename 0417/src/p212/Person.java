package p212;

public class Person {
//	public Person() { // -> 기본 생성자는 method랑 다름, 원래 기본으로 있고 객체(ex.void)가 없음!
//		
//	}
	public static void main(String ar[]) {
		
		String colour;
		String speed;
		
		Car c=new Car(); //-> 가능
		//Car c; -> 불가능
		colour = c.colour;
	}
}

class Car{
	String colour="red";
	String speed="50km";
}

// Ch06-Class에 관하여
//public class Person{
//	String name="홍길동";
//	int age=20;
//	
//	public String smile() {
//		return"하하하";
//	}
//	
//	public String eat() {
//		return"맛있다";
//	}
//	
//}
