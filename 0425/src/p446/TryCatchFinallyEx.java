package p446;

public class TryCatchFinallyEx {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		
		try {
			Class clazz =  Class.forName("java.lang.String"); //java.lang.String1 -> catch��
			System.out.println("String Ŭ������ �����մϴ�.");
		}catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}

}
