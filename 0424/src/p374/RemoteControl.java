package p374;

public interface RemoteControl {

	public static final int MAX_VOLUME=10;
	public int MIN_VOLUME=0; //static final �����Ǿ� ����!
	
	public abstract void turnOn();
	public void turnOff(); //abstract �����Ǿ� ����!
	public void setVolume(int volume);
}
