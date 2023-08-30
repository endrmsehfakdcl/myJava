package exam01;

public class EnumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gender gender = Gender.FEMALE;
		if (gender == Gender.MALE) {
			System.out.println(Gender.MALE + "병역의 의무가 있습니다.");
		}
		else {
			System.out.println(Gender.FEMALE + "병역의 의무가 없습니다.");
		}
		
		Direction direction = Direction.NORTH;
		if(direction == Direction.SOUTH) {
			System.out.println(Direction.SOUTH);
		}
		else {
			System.out.println(Direction.NORTH);
		}
	}

	enum Gender {
		MALE, FEMALE
	}

	enum Direction {
		EAST, WEST, SOUTH, NORTH
	}

}
