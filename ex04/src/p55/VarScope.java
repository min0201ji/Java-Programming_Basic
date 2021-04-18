package p55;

public class VarScope {
	public static void main(String ar[]) {
		int v1=15;
		
		boolean bool=true;
		
		if(bool)
			System.out.println("참");
			
		if(2>1)
			System.out.println("참");
		
		else System.out.println("거짓"); //{}중가로와 ;의 중요성 복습!
			
		
	}	
	
	boolean isEmpty() {
		return true;
	}
}
