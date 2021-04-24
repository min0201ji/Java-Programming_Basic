package Test01;

import java.util.Scanner;

public class QStopEx {
	public static void main(String ar[]) throws Exception{
		Scanner sc=new Scanner(System.in);
		int KeyCode;
		while(true) {
			System.out.print("문자 입력: ");
			String keycode=sc.nextLine();
			
			if(keycode.equals("q")) {
				break;
			}
			System.out.println("while문 실행!!");
		}
		System.out.println("while문 종료!!");
			
		System.out.println("종료");
	}
}
