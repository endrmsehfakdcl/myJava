package java_exam_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Integer> list = new ArrayList<Integer>();

		while (true) {
			int score = scanner.nextInt();
			if (score < 0)
				break;
			list.add(score);

		}
		scanner.close();
		System.out.println("학생들의 성적 : " + list);

		int max = Collections.max(list);
		char grade;

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) > max - 10)
				grade = 'A';
			else if (list.get(i) > max - 20)
				grade = 'B';
			else if (list.get(i) > max - 30)
				grade = 'C';
			else if (list.get(i) > max - 40)
				grade = 'D';
			else
				grade = 'F';
			System.out.println((i + 1) + "번 학생의 성적은 " + list.get(i) + "이며 " + grade + "등급입니다.");
		}

	}
}
