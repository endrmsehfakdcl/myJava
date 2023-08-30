package exam01;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		switch (n) {
		case 1: // n == 1
			System.out.println("simple java");
			break;
		case 2:
			System.out.println("funny java");
			break;
		case 3:
			System.out.println("fantastic java");
			break;
		default:
			System.out.println("the best programming language");

		}
		System.out.println("Do You Like Java?");

		n = 2;
		switch (n) {
		case 1:
		case 2:
		case 3:
			System.out.println("case 1, 2 3");
			break;
		default:
			System.out.println("default");
		}

	}

}
