package p153;

public class ForMultipleEx {
	public static void main(String ar[]) {
		for(int i=2; i<=9; i++) {//���ǰ� i<3 �� ���� 
			System.out.println("=== " + i + "�� ===");//�ٱ� for, õõ�� ����
		for(int j=1; j<=9; j++) { //���� for, ������ ����
			System.out.println(i + " x " + j + " = " + (i*j));
			}
		System.out.println();
		}
	}
}