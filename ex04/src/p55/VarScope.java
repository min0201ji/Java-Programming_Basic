package p55;

public class VarScope {
	public static void main(String ar[]) {
		int v1=15;
		
		boolean bool=true;
		
		if(bool)
			System.out.println("��");
			
		if(2>1)
			System.out.println("��");
		
		else System.out.println("����"); //{}�߰��ο� ;�� �߿伺 ����!
			
		
	}	
	
	boolean isEmpty() {
		return true;
	}
}
