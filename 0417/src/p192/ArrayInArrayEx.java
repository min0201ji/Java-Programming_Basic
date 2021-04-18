package p192;

public class ArrayInArrayEx {
	public static void main(String ar[]) {
		//int[][] mathScores=new int[2][3]; //행, 열
		int[][] mathScores= {{95, 80}, {92, 96, 80}, {12}}; //행(2), 열(2,3)
		System.out.println(mathScores.length);
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<mathScores[i].length; j++) {
				System.out.println("mathScores["+i+"]["+j+"]="+mathScores[i][j]);
						
				
			}
		}
		
	}
}
