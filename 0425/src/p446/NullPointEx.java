package p446;

public class NullPointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String data = null;
			System.out.println(data.toString());
		}catch(Exception e) { // e에 오류저장
			e.getMessage(); //system.out.println("예외 처리: "+e.getMessafe()); 도 가능 / e.printStacjTrace(); 도 가능(이거는 오류 그대로 보여줌)
		}finally {
			System.out.println("Null 값은 오류를 일으킬수 있습니다.");
		}
	}	
}
