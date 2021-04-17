package p114;

public class DenyLogicEx {
	public static void main(String ar[]) {
		boolean play=true;
		System.out.println(play);
		
		play=!play; // ! = ~ (not)이라는 의미, ==(같다), =!(같지않다), <>(같지않다)
		System.out.println(play);
		
		play=!play;
		System.out.println(play);
	}
}
