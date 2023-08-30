package exam14to18;

public interface RemoteControl {
	// field
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// method
	void turnOn();

	void turnOff();

	void setVolume(int volume);
}
