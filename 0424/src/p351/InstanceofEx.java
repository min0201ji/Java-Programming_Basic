package p351;

public class InstanceofEx {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child=(Child)parent;
			System.out.println("변환성공!");
		}else {
			System.out.println("변환실패!");
		}
	}
	
	public static void method2(Parent parent) {
//		Child child = (Child)parent; method1의 경우
		Child child = (Child)parent;
		System.out.println("변환성공!");
	}
	public static void main(String ar[]) {
		Parent parent = new Child(); //속성은 자식, 객체타입(공간)은 부모
		method1(parent);
		method2(parent);
		
		Parent parent1=new Parent();
		method1(parent1);
		method2(parent1);
	}
	
}

