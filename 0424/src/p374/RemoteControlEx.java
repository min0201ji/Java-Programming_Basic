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

// 위에것과 같은 것 다른방식
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
