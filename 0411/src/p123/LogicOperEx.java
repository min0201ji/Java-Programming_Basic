package p123;

public class LogicOperEx {
	public static void main(String ar[]) {
		int charCode='A';
		
		
		if((charCode>=65)&(charCode<=90)) {
		 System.out.println("��");
		}
		
		if((charCode>=97)&&(charCode<=122)) {
			 System.out.println("����"); //���� �ƴϿ��� ��� ���� X
			}
		
		int value = 6;
		if((value%2==0)&&(value%3==0)) {
			 System.out.println("2 �Ǵ� 3�� ���");
		}
	}
}