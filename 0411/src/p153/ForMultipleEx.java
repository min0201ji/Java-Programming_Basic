package p153;

public class ForMultipleEx {
	public static void main(String ar[]) {
		for(int i=2; i<=9; i++) {//조건값 i<3 도 가능 
			System.out.println("=== " + i + "단 ===");//바깥 for, 천천히 돌고
		for(int j=1; j<=9; j++) { //안쪽 for, 빠르게 돌고
			System.out.println(i + " x " + j + " = " + (i*j));
			}
		System.out.println();
		}
	}
}