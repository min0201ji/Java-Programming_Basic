package p434;

public class Button {
	//이벤트, 리스너, 핸들러
	
	OnclickListener listener;

	public void setOnClickListener(OnclickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	static interface OnclickListener{
		void onClick();
	}
}
