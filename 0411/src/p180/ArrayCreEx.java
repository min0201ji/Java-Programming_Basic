package p180;

public class ArrayCreEx {
	public static void main(String ar[]) {
		int[] scores= {83, 90, 87};
		//System.out.println()
		//배열의 범위를 지정해줄수있는 방법 //int scores [];
		
		//System.out.println("scores[0] :"+scores[0]);
//		System.out.println(scores.length);
		
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores["+i+"] :"+scores[i]);
		}
	}
}