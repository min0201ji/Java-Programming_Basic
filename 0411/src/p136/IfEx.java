package p136;

public class IfEx {
	public static void main(String ar[]) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수는 90보다 크고 A등급 입니다.");
		}else if(score>=80){
			System.out.println("점수는 80보다 작고 B등급 입니다");
		}else if(score>=70){
			System.out.println("점수는 70보다 작고 C등급 입니다");
		}else if(score>=60){
			System.out.println("점수는 60보다 작고 D등급 입니다");
		}else{
			System.out.println("점수는 50보다 작고 F등급 입니다");
		}	
//		if(score<90) {
//			System.out.println("점수는 90보다 작고 B등급 입니다.");
//		}
	}
}