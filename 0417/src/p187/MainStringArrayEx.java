package p187;

public class MainStringArrayEx {
	public static void main(String ar[]) {
		if(ar.length!=2) {
			System.out.println("���ڿ��� 2���� ���� �Է��ϼ���.");
			System.exit(0);
		}
		
		String strNum1=ar[0]; //=10		
		String strNum2=ar[1]; //=20
		
		//String => int
		int num1, num2, result;
		num1=Integer.parseInt(strNum1);
		num2=Integer.parseInt(strNum2);
		result=num1+num2;
		System.out.println("����� : "+result) ;
	}
}
