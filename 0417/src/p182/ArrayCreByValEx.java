package p182;

public class ArrayCreByValEx {
	public static void main(String ar[]) {
		int[] scores, check;
		check=new int[10];
		scores=new int[] {83, 90, 87};
		int sum1=0;
		for(int i=0; i<scores.length; i++) {
			sum1=sum1+scores[i];
		}
		
		System.out.println("���� : "+sum1);
		System.out.println("add() : "+add(new int[] {10, 20, 30, 40}));
		
	}

	public static int add(int[] scores) {
		int sum=0;
		for(int i=0; i<3; i++) {
			//i<scores.length �ϸ� ���̿� ����
			sum+=scores[i];
		}
		return sum;
	}

}