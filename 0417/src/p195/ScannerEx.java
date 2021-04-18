package p195;

import java.util.Scanner;

//p201 - 6번문제
public class ScannerEx {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);	// ctrl_shift+o
//		System.out.print("키보드 입력: ");
//		String keyboard=sc.nextLine();
//		System.out.print("키보드 입력값 출력: "+keyboard);
		System.out.print("숫자 입력: ");
		int num=Integer.parseInt(sc.nextLine()); //문자열처리
		System.out.print("키보드 입력값 출력: "+num);
	}
}
