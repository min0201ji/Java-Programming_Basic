package p195;

public class AdvanceForEx {
	public static void main(String ar[]) {
		int[] scores= {10, 20, 30};
		
//		//�Ϲ����� for
//		for(int i=0; i<scores.length; i++) {
//			System.out.println("���: "+scores[i]);
//		}
		
		//���� for
		for(int score:scores) {
			System.out.println("���: "+score);
		}
	}
}
