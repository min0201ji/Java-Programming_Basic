package p374;

public class RemoteControlEx {
	
	public static void main(String ar[]) {
		RemoteControl rc;
		rc= new Television();
		rc.setVolume(6);
		
		rc = new Audio();
		rc.setVolume(-2);
	}
}

// �����Ͱ� ���� �� �ٸ����
//public class RemoteControlEx {
//	
//	public static void remoteVolume(RemoteControl rc) {
//		RemoteControl rc1=rc;
//	}
//	
//	public static void main(String ar[]) {
//		RemoteControl rc;
//		rc= new Television();
//		rc.setVolume(6);
//		
//		rc = new Audio();
//		rc.setVolume(-2);
//		
//		remoteVolume(rc); 
//	}
//}
