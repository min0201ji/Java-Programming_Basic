package p446;

public class NullPointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String data = null;
			System.out.println(data.toString());
		}catch(Exception e) { // e�� ��������
			e.getMessage(); //system.out.println("���� ó��: "+e.getMessafe()); �� ���� / e.printStacjTrace(); �� ����(�̰Ŵ� ���� �״�� ������)
		}finally {
			System.out.println("Null ���� ������ ����ų�� �ֽ��ϴ�.");
		}
	}	
}
