package exam01;

public class SwitchToIf {
	public static void main(String[] args) {

//		int n = 5;
//		switch (n) {
//		case 1: // n == 1
//			System.out.println("simple java");
//			break;
//		case 2:
//			System.out.println("funny java");
//			break;
//		case 3:
//			System.out.println("fantastic java");
//			break;
//		default:
//			System.out.println("the best programming language");
//
//		}
//		System.out.println("Do You Like Java?");
//-------------------------------------------------------------------------
		int n = 5;
		if (n == 1) {
			System.out.println("simple java");
		} else if (n == 2) {
			System.out.println("funny java");
		} else if (n == 3) {
			System.out.println("fantastic java");
		} else {
			System.out.println("the best programming language");
		}
		System.out.println("Do You Like Java?");

		n = 2;
		if (n == 1) {
		} else if (n == 2) {

		} else if (n == 3) {
			System.out.println("case 1, 2, 3");
		} else {
			System.out.println("default");
		}

	}
}
