package p157;

public class BreakEx {
	public static void main(String ar[]) {
		while(true) {
			int num=(int)(Math.random()*6)+1;
			System.out.println("��¼��� :"+num);
			if(num==6) {
				break;
			}
		}
		System.out.println("���α׷� ����!!");
	}
}
