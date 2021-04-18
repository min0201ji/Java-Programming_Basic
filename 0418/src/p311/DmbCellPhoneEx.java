package p311;

public class DmbCellPhoneEx {
	public static void main(String ar[]) {
		DmbCellPhone dcp = new DmbCellPhone("자바폰", "검정", 10);
		System.out.println("모델 : "+dcp.model); //상위클래스(부모)
		
		System.out.println("채널 : "+dcp.channel); //하위클래스(자식)
	}
}
