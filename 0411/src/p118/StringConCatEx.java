package p118;

public class StringConCatEx {
	public static void main(String ar[]) {
		String str1="JDK"+11.0;
		String str2=str1+"Ư¡";
		System.out.println(str2);
		
		String str3=3+3.0+"JDK";
		//3+3.0 ������ �������, .0+"JDK"�� ���տ���
		System.out.println(str3);
	
	}
}
