package p112;

public class InCreDeCreEx {

	public static void main(String[] args) {
		int x=10;
		int y=10;
		int z;
		
		System.out.println("=================");
		x++; //11
		++x; //12
		System.out.println("x="+x);
		
		System.out.println("=================");
		y--; //9
		--y; //8
		System.out.println("y="+y);
		
		System.out.println("=================");
		z=x++; // 연산자의 우선순위 여기선 대입(=)먼저
		//z=++x; //연산자의 우선순위 증감(++)먼저 한다음 대입
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		x=y=z;
	}

}
