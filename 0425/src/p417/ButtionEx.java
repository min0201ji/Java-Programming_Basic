package p417;

public class ButtionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn=new Button();
				btn.setOnListener(new CallListener());
				btn.touch();
				
				btn.setOnListener(new MessageListener());
				btn.touch();
	}

}
