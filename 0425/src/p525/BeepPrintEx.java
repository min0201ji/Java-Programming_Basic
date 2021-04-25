package p525;

import java.awt.Toolkit;

public class BeepPrintEx {
	public static void main(String ar[]) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("¶ò");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
	
}
