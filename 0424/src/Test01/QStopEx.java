package Test01;

import java.util.Scanner;

public class QStopEx {
	public static void main(String ar[]) throws Exception{
		Scanner sc=new Scanner(System.in);
		int KeyCode;
		while(true) {
			System.out.print("���� �Է�: ");
			String keycode=sc.nextLine();
			
			if(keycode.equals("q")) {
				break;
			}
			System.out.println("while�� ����!!");
		}
		System.out.println("while�� ����!!");
			
		System.out.println("����");
	}
}
