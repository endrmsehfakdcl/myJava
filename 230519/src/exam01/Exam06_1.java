package exam01;

import java.util.Scanner;

public class Exam06_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("철수 : ");
		char pc = scanner.nextLine().charAt(0);
		System.out.print("영희 : ");
		char npc = scanner.nextLine().charAt(0);

		if (pc == npc) {
			System.out.println("무승부!");
		} else if (((pc == 114 & npc == 112) | (pc == 112 & npc == 115) | (pc == 115 & npc == 114))) {
			System.out.println("영희, 숭!");
		} else {
			System.out.println("철수, 승!");
		}
	}
}
