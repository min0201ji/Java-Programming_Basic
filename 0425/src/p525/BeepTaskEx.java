package p525;

public class BeepTaskEx {
	public static void main(String ar[]) {
//		BeepTask bt = new BeepTask();
//		Thread th = new Thread(bt);
//		th.start();
//		-> Beeptask�� �ȵ� �ּ����� �޾Ƽ� BeepThread�� ����!
		BeepThread bt1 = new BeepThread();
		bt1.start();
	}
}
