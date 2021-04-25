package p446;

public class TryCatchFinallyEx {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		
		try {
			Class clazz =  Class.forName("java.lang.String"); //java.lang.String1 -> catch로
			System.out.println("String 클래스가 존재합니다.");
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

}
