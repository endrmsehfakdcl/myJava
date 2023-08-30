package exam01;

public class Constants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_SIZE = 100;
		final char CONST_CHAR = '굿';
		final int CONST_ASSIGNED;

		CONST_ASSIGNED = 12;

		System.out.println("상수1 :" + MAX_SIZE);
		System.out.println("상수2 :" + CONST_CHAR);
		System.out.println("상수3 :" + CONST_ASSIGNED);

		final int MALE = 0;
		final int FEMALE = 1;

		final int SOUTH = 1 ;
		
		int gender = FEMALE;
		if (gender == FEMALE) {
			System.out.println(FEMALE + "은 병역의 의무가 없습니다.");
		} else {
			System.out.println(MALE + "은 병역의 의무가 있습니다.");
		}
		
		if (gender == SOUTH) {
			System.out.println(SOUTH + "???????");
		}
	}

}
