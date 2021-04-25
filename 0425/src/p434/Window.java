package p434;

public class Window {
	Button btn1 = new Button();
	Button btn2 = new Button();
	
	Button.OnclickListener listener=new Button.OnclickListener() {
		
		@Override
		public void onClick() {
			// TODO Auto-generated method stub
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window(){
		System.out.println("Window 클래스 실행!");
		
		btn1.setOnClickListener(listener);
		btn2.setOnClickListener(new Button.OnclickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("메세지를 보냅니다");
			}
		});
	}
}
