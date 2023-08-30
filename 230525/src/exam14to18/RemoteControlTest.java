package exam14to18;

public class RemoteControlTest {

	public static void main(String[] args) {

		RemoteControl rc;	// Interface
		rc = new Television();
		rc = new Audio(); // new Audio로 덮어씌움

		rc.turnOn();	// Audio
		rc.setVolume(80); // MAX = 10;
		rc.turnOff();

		SmartTelevision tv = new SmartTelevision();
		RemoteControl rc2 = tv; //SmartTV
		Searchable sb = tv;		//SmartTV

		//rc2 = tv 
		sb.search("www.google.com");
		rc2.turnOn();
		rc2.setVolume(125); // MAX = 10;
		rc2.turnOff();
	}

}
