package p417;

public class Button {
	//�̺�Ʈ, ������, �ڵ鷯
	
	OnclickListener listener;

	public void setOnListener(OnclickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	static interface OnclickListener{
		void onClick();
	}
}
