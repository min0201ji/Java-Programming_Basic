package p119;

public class CompareOperEx {
	public static void main(String ar[]) {
		int num1 = 10;
		int num2 = 20;
		boolean result1 = (num1 == num2); //�׻� ������ ����!
		System.out.println(result1);
		boolean result2 = (num1 != num2);
		System.out.println(result2);
		boolean result3 = (num1 >= num2);
		System.out.println(result3);
		boolean result4 = (num1 <= num2);
		System.out.println(result4);
		
		//p120
		String strVar1 = "ȫ�浿";
		String strVar2 = "ȫ�浿";
		System.out.println("���ڿ���1:"+(strVar1==strVar2));
		System.out.println("���ڿ���2:"+(strVar1.equals(strVar2))); //�����ʴٴ� (!strVar1~~~)))
		//���ڿ����� �������� ǥ���Ҷ� == �Ⱦ�, equals ���
		
		//String strVar1 = new String ("ȫ�浿");
		//String strVar2 = new String ("ȫ�浿");
		//System.out.println("���ڿ���1:"+(strVar1==strVar2));
		//system.out.println("���ڿ���2:"+(strVar1.equals(strVar2)));
	}
}
