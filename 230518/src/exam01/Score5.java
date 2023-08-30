package exam01;

import java.util.Scanner;

public class Score5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		double avg = 0;

//배열 초기화1
//		int[] scores = {90, 80 , 76, 54, 76} ;

//배열 초기화2
		int[] scores = new int[5];
		
//배열 초기화3
//		int[]scores;
//		scores = new int {scores1, scores2, scores3, scores4, scores5};
		
		System.out.println("점수를 5개 입력해주세요.");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt();
		}
		for (int j = 0; j < scores.length; j++) {
			sum += scores[j];
		}

		avg = sum / scores.length;
		System.out.println("점수의 합은 : " + sum);
		System.out.println("점수의 평균은 : " + avg);
	}
}
