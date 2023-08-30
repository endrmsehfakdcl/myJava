package exam01;

public class MainStringArrayArgument {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("매개변수의 숫자가 부족함.");
			System.exit(0);
			
		}
		String str1 = args[0];
		String str2 = args[1];

		System.out.println(str1 + ", " + str2);
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		System.out.println(num1+ "+" + num2 + "=" + (num1+num2));
		
		//2차원 배열의 길이 [행][렬] > 참조영역이라 주소값만 들고있음
		int[][] scores = new int [2][3];
		
		System.out.println(scores.length);		//2
		System.out.println(scores[0].length);	//3
		System.out.println(scores[1].length);	//3
	}

}
