package p64;

public class UniEx {
	public static void main(String ar[]) {
		char c1='a';  //" " ��� -> ���ڿ�(string), character�� ���ڶ� -> ' '���
		//���ڴ� ���ǹ���(unsigned)�� ������
		int num;
		num=c1; //"���� :"+num => 97<accii �ڵ�ǥ>
		c1=(char)num; //num(3)�� c1(2)�� �־�� �Ǳ� ������ (char)�� �Ἥ ���ڷ� ��ȯ
		//�����ڵ�!!
		
		System.out.println("���� : "+c1); //c1��ſ� num ������ ����� 97����
	}
}
