package p195;

public class AdvanceForEx {
	public static void main(String ar[]) {
		int[] scores= {10, 20, 30};
		
//		//일반적인 for
//		for(int i=0; i<scores.length; i++) {
//			System.out.println("출력: "+scores[i]);
//		}
		
		//향상된 for
		for(int score:scores) {
			System.out.println("출력: "+score);
		}
	}
}
