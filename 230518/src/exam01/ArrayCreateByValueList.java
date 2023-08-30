package exam01;

public class ArrayCreateByValueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = { 90, 80, 70 };
		int sum = add(scores);
		System.out.println(sum);

		sum = add(new int[] { 80, 90, 100 });
		System.out.println(sum);

	}

	public static int add(int[] scores) {

		
		int sum = 0;
//		for (int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}
		
		// 향상된 for 문
		for (int i : scores ) {
			sum += i;
		}
		return sum;
	}
	
	
	

}
