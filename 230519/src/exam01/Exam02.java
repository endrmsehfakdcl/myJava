package exam01;
import java.util.Scanner;
public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2 . 키보드로 등수를 입력받아 1등이면 아주 잘했씁니다
		Scanner scanner = new Scanner(System.in);
		System.out.print("등수 : ");
		int rank = scanner.nextInt();
		switch (rank) {
		case 1 :
			System.out.println("아주 잘했습니다");
			break;
		case 2 :
		case 3 : 
			System.out.println("보통입니다");
			break;
		default : 
			System.out.println("노력하겠습니다");
			break;
		
		}
		
	}

}
