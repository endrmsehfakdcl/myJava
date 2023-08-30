package exam01;

public class RandomEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 0; i < 1; i++) {
//			double temp = Math.random();
//			npc = (int) (temp * 10);
//			System.out.println(temp);
//			System.out.println(npc);
//		}
		for (int i = 0; i < 1; i++) {
			double dValue = Math.random();
			char cValue = (char) ((dValue * 26) + 65); // 대문자
			// char cValue = (char)((dValue * 26) + 97); // 소문자
			System.out.println(cValue);
		}
	}
}
