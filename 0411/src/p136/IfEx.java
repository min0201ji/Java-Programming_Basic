package p136;

public class IfEx {
	public static void main(String ar[]) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("������ 90���� ũ�� A��� �Դϴ�.");
		}else if(score>=80){
			System.out.println("������ 80���� �۰� B��� �Դϴ�");
		}else if(score>=70){
			System.out.println("������ 70���� �۰� C��� �Դϴ�");
		}else if(score>=60){
			System.out.println("������ 60���� �۰� D��� �Դϴ�");
		}else{
			System.out.println("������ 50���� �۰� F��� �Դϴ�");
		}	
//		if(score<90) {
//			System.out.println("������ 90���� �۰� B��� �Դϴ�.");
//		}
	}
}