package p311;

public class CellPhone {
	
	String model;
	String color;
	
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	
	void sendVoice(String msg) {
		System.out.println("�ڽ� : "+msg);
	}
	
	void receiveVoice(String msg) {
		System.out.println("���� : "+msg);
	}
	
	void hangup() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
	
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	
}
