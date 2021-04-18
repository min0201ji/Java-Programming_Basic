package p53;

public class VarEx {
	public static void main(String ar[]) {
		//세공간을 만들고, 각 값을 입력한 다음 값의 위치를 바꾸는 방법 
		int x=3, y=5;
		int temp;
		temp=x;
		x=y;
		y=temp; //같다라는 뜻은 ==, =은 대입(왼->오)
		// 위에 것은 알고리즘의 개념과 비슷함 
		
		//x=y; //x가 결과, 항상 오른쪽에서 왼쪽으로
		System.out.println("x값 :"+x+", y값 : "+y);
		
	}

}
