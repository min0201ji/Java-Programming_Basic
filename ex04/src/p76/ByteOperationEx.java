package p76;

public class ByteOperationEx {
	public static void main(String ar[]) {
		byte num1=10;
		byte num2=20;
		//byte result=num1+num2;//����������� ������ �ع����� byte�� �ڵ����� int�� �ٲ� �׷��� ������
		//�׷��� byte result=(byte)(num1+num2); �̷��� �ϸ� ����(��������)
		//num1+num2 �� �������(�̹̰����ִ�)������ ���� *�ѹ��� ����!
		System.out.println("��");
		
		
		//p.80 code
		int x=1;
		int y=2;
		//double result = x/y; //���� �������� 0.5�� ������ �ȵǱ� ������ 0.0�� ����
		double result=(double)x/y; //�׷��� double�� ������ߵȴ�.
		System.out.println("�Ǽ� �����: "+result); 
		
		System.out.println(y+"123"); //"123"�� ���ڿ��̿��� ����� 2123���� ����
	}
}
