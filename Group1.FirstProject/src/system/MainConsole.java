package system;

import java.util.Scanner;

import kjh.Login;
import kyj.CrcenterTest;
import kyr.WasteList;
import lht.BikeConsole;

public class MainConsole {

	public static int printMainMenu() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		while (true) {
			System.out.println("┌──────────────┐");
			System.out.println("│1. 조장 이희태   │");
			System.out.println("│2. 조원 김영란   │");
			System.out.println("│3. 조원 김유진   │");
			System.out.println("│4. 조원 김재훈   │");
			System.out.println("└──────────────┘");

			System.out.print("이름을 입력해주세요 : ");
			String str = scanner.nextLine();
			if ((str.equals("이희태")) || (str.equals("1")) || (str.equals("조장"))) {
				menu = 1;
				break;
			} else if ((str.equals("김영란")) || (str.equals("2"))) {
				menu = 2;
				break;
			} else if ((str.equals("김유진")) || (str.equals("3"))) {
				menu = 3;
				break;
			} else if ((str.equals("김재훈")) || (str.equals("4"))) {
				menu = 4;
				break;
			} else {
				menu = 0;
				break;
			}
		}
		return menu;
	}

	public static void mainRun(int menu) {
		int choiceNum = menu;

		switch (choiceNum) {
		case 1:
			System.out.println("조장 이희태의 프로젝트를 열람합니다.");
			BikeConsole.BikeConsoleRun();
			break;
		case 2:
			System.out.println("2. 조원 김영란의 프로젝트를 열람합니다");
			try {
				WasteList.WasteListRun();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 3:
			System.out.println("3. 조원 김유진의 프로젝트를 열람합니다");
			CrcenterTest.CrcenterRun();
			break;
		case 4:
			System.out.println("4. 조원 김재훈의 프로젝트를 열람합니다");
			Login.loginRun();
			break;
		default:
			System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			break;
		}
	}

	public static void main(String[] args) {

		// 메인 시작
		MainConsole.mainRun(MainConsole.printMainMenu());
	}
}
