package exam;

public class Exam10 {

	public static void main(String[] args) {
//10. 100이하 자연수 중에서 2의 배수이자 7의 배수인 수를 출력하고, 그 수들의 합을 구해 출력하는 프로그램을 while문을 이용해서 작성해보자.
		int nature = 1;
		int sum = 0;
		System.out.print("2의 배수이자 7의 배수인 자연수: ");
		while (nature <= 100) {
			if (nature % 2 == 0 & nature % 7 == 0) {
				System.out.print(nature + " ");
				sum += nature;
			} 
			nature++;
		}
		System.out.println();
		System.out.println("2와 7의 배수인 자연수의 합 : " + sum);

	}

}
