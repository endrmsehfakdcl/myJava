package exam14to18;

public class MyClass {
	// field
	RemoteControl rc = new Television(); // 기본값

	// constructor
	MyClass() { // default constructor

	}

	MyClass(RemoteControl rc) { // rc = new Television.turnOn, Television.setVolume
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}

	// method
	void methodA() {
		RemoteControl rc2 = new Audio(); // rc2 = Audio.turnOn, Audio,setVolume
		rc2.turnOn();
		rc2.setVolume(5);

	}

	void methodB(RemoteControl rc2) {// rc2 = Audio
		rc2.turnOn();
		rc2.setVolume(6);
	}
}
