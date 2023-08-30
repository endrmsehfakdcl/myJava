package exam01;

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("구글", "안드로이드");

		String strObj = smartPhone.toString();
		System.out.println(strObj);
		System.out.println(smartPhone);
	}

}
