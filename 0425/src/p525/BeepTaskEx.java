package p525;

public class BeepTaskEx {
	public static void main(String ar[]) {
//		BeepTask bt = new BeepTask();
//		Thread th = new Thread(bt);
//		th.start();
//		-> Beeptask는 안됨 주석으로 달아서 BeepThread만 실행!
		BeepThread bt1 = new BeepThread();
		bt1.start();
	}
}
