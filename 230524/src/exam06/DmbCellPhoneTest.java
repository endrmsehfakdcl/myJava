package exam06;

public class DmbCellPhoneTest {

	public static void main(String[] args) {
		
		// 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "흰색", 10);

		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		System.out.println("채널 : " + dmbCellPhone.channel);

		System.out.println();
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoid("ㅎㅇ");
		dmbCellPhone.receiveVoice("ㅂㅇ");
		dmbCellPhone.hangup();

		System.out.println();

		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
