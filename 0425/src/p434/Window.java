package p434;

public class Window {
	Button btn1 = new Button();
	Button btn2 = new Button();
	
	Button.OnclickListener listener=new Button.OnclickListener() {
		
		@Override
		public void onClick() {
			// TODO Auto-generated method stub
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};
	
	Window(){
		System.out.println("Window Ŭ���� ����!");
		
		btn1.setOnClickListener(listener);
		btn2.setOnClickListener(new Button.OnclickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("�޼����� �����ϴ�");
			}
		});
	}
}
