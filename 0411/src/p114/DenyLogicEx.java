package p114;

public class DenyLogicEx {
	public static void main(String ar[]) {
		boolean play=true;
		System.out.println(play);
		
		play=!play; // ! = ~ (not)�̶�� �ǹ�, ==(����), =!(�����ʴ�), <>(�����ʴ�)
		System.out.println(play);
		
		play=!play;
		System.out.println(play);
	}
}
