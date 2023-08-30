package exam;

public class Exam11 {
//11. 구구단의 짝수 단인 2, 4, 6, 8단만 출력하는 프로그램을 작성하되 2단은 2X2까지, 4단은 4X4까지, 6단은 6X6까지 , 8단은 8X8까지 출력하도록 작성하자.
	public static void main(String[] args) {
		System.out.println("----------------------------------------");
		for(int gugu = 1 ; gugu<3 ; gugu++) {
			System.out.println("2 x " + gugu + " = " + 2*gugu);
		}
		System.out.println("----------------------------------------");
		for(int gugu = 1 ; gugu<5 ; gugu++) {
			System.out.println("4 x " + gugu + " = " + 4*gugu);
		} 
		System.out.println("----------------------------------------");
		for(int gugu = 1 ; gugu<7 ; gugu++) {
			System.out.println("6 x " + gugu + " = " + 6*gugu);
		} 
		System.out.println("----------------------------------------");
		for(int gugu = 1 ; gugu<9 ; gugu++) {
			System.out.println("8 x " + gugu + " = " + 8*gugu);
		} 
	}

}
