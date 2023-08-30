package exam01;

import java.util.Scanner;
import java.util.Random;

public class Exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6. 가위 바위 보 게임 r,p,s 중 하나를 입력해 승자 또는 무승부를 출력하는 프로그램
		int s, r, p;
		char pc;
		int npc = 0;
		Random rd = new Random();
		Scanner scanner = new Scanner(System.in);
//----------------------------------------------------------------
		System.out.print("가위(r), 바위(p), 보(s) 중 하나를 입력 : ");
		pc = scanner.nextLine().charAt(0);
		if (pc == 114) {
			System.out.println("철수 : 가위");
		} else if (pc == 112) {
			System.out.println("철수 : 바위");
		} else if (pc == 115) {
			System.out.println("철수 : 보");
		}
//--------------------------------------------------------------------
		for (int i = 0; i < 30; i++) {
			double temp = Math.random();
			npc = (int) (temp * 10); // 정수형 난수
			if (npc == 0) {
				System.out.println("영희 : 가위");
				break;
			} else if (npc == 1) {
				System.out.println("영희 : 바위");
				break;
			} else if (npc == 2) {
				System.out.println("영희 : 보");
				break;
			}
		}
		if ((pc == 114 & npc == 2) | (pc == 112 & npc == 0) | (pc == 115 & npc == 1)) {
			System.out.println("철수, 승!");
		} else if (((pc == 114 & npc == 1) | (pc == 112 & npc == 2) | (pc == 115 & npc == 0))) {
			System.out.println("영희, 숭!");
		} else if (((pc == 114 & npc == 0) | (pc == 112 & npc == 1) | (pc == 115 & npc == 2))) {
			System.out.println("무승부!");
		}

	}

}
