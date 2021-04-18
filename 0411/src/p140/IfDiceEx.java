package p140;

public class IfDiceEx {
	public static void main(String ar[]) {
		int num = (int)(Math.random()*45)+1; //0.0~0.9 
		//Math.random class는 크기를 가늠할수 없을 정도이기 떄문에 정수보다 크다
		//double num = (double)Math.random();
		System.out.println("난수발생 : " + num);
	}
}
