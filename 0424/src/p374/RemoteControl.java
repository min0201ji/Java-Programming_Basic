package p374;

public interface RemoteControl {

	public static final int MAX_VOLUME=10;
	public int MIN_VOLUME=0; //static final 생략되어 있음!
	
	public abstract void turnOn();
	public void turnOff(); //abstract 생략되어 있음!
	public void setVolume(int volume);
}
