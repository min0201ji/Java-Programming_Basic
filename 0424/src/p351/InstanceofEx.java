package p351;

public class InstanceofEx {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child=(Child)parent;
			System.out.println("��ȯ����!");
		}else {
			System.out.println("��ȯ����!");
		}
	}
	
	public static void method2(Parent parent) {
//		Child child = (Child)parent; method1�� ���
		Child child = (Child)parent;
		System.out.println("��ȯ����!");
	}
	public static void main(String ar[]) {
		Parent parent = new Child(); //�Ӽ��� �ڽ�, ��üŸ��(����)�� �θ�
		method1(parent);
		method2(parent);
		
		Parent parent1=new Parent();
		method1(parent1);
		method2(parent1);
	}
	
}

