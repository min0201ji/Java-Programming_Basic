package p157;

public class BreakEx {
	public static void main(String ar[]) {
		while(true) {
			int num=(int)(Math.random()*6)+1;
			System.out.println("출력숫자 :"+num);
			if(num==6) {
				break;
			}
		}
		System.out.println("프로그램 종료!!");
	}
}
