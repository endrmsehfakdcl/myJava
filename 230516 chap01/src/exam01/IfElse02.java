package exam01;

public class IfElse02 {
	public static void main(String[] args) {
		int n = 24;

		if (n >= 0 & n <= 10) {
			System.out.println("n은 0~10사이의 수");

		} else if (n >= 10 & n < 20) {
			System.out.println("n은 10~20사이의 수");
		} else if (n >= 20 & n < 30) {
			System.out.println("n은 20~30사이의 수");
		} else {
			System.out.println("n은 30이상의 수");
		}
		
		
		switch (n/10) {
		
		case 0 : 
			System.out.println("n은 0~10사이의 수");
			break;
		case 1 :
			System.out.println("n은 10~20사이의 수");
			break;
		case 2 :
			System.out.println("n은 20~30사이의 수");
			break;
		default :
			System.out.println("n은 30이상의 수");
		}
	}
}