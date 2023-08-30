package kyr;

import java.util.List;
import java.util.Scanner;

public class WasteUtil {
	static <T> int isBoolValueFromString(T value) {
		boolean result = false;
		return value.toString().equals("Y") ? 1 : 0;
	}

	static <T> boolean isYorN(T value) {
		boolean result = false;
		return value.toString().toUpperCase().equals("Y") || value.toString().toUpperCase().equals("N") ? true : false;
	}

	static String inputLoop(String printInputName, String input) {
		Scanner scanner = new Scanner(System.in);
		boolean result = false;
		String newInput = "";

		while (!WasteUtil.isYorN(input)) {
			System.err.println("y or n 중에서만 입력해 주세요.");
			System.out.print(printInputName + "(y/n) : ");

			input = scanner.nextLine();

			if (input != null) {
				result = input.substring(0, 1).toUpperCase().equals("Y") ? true : false;

//				System.out.println("input.substring(0, 1) : " + input.substring(0, 1));
//				System.out.println("input.substring(0, 1).toUpperCase() : " + input.substring(0, 1).toUpperCase());
//				System.out.println("input.substring(0, 1).toUpperCase().equals(\"Y\") : " +input.substring(0, 1).toUpperCase().equals("Y"));
			}
		}
		;
//		scanner.next();
		return result ? "Y" : "N";
	}

//	static void printMainMenu() {
//		System.out.println("▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽");
//		System.out.println(" 1. 일반접속(u)");
//		System.out.println(" 2. 관리자접속(a)");
//		System.out.println(" 9. 프로그램 나가기(e)");
//		System.out.println("△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△");
//	}

	// 프로그램 타이틀
	static void printProgramTitle() {
		System.out.println("\n■■■■■■■■■■■■■■■■■■■■■■■■ 인천시 부평구 종량제봉투 판매정보 시스템 ■■■■■■■■■■■■■■■■■■■■■■■■");
	}

	// 일반접속인 경우
	static void printMainMenu() {
		String[] menuString = { "[1] 종량제봉투취급처 보기", "[2] 음식물납부필증(가정용)취급처 보기", "[3] 임식물납부필증(120L)취급여부",
				"[4] 대형폐기스티커취급처 보기", "[5] 특수규격봉투취급처 보기", "[6] 판매처 주소검색", "[*] 관리자 모드 전환", "[e] 종료",

		};

		System.out.println("\n▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽");
		for (String menu : menuString) {
			System.out.printf("\t\t\t%s\n", menu);
		}
		System.out.println("△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△");
	}

	static void printViewMenu(int start, int end) {
		System.out.println("\n------------------------------------------------------------");
		System.out.println("	 [P]rev 이전  【 " + start + " / " + end + " 】  다음 [N]ext  ");
		System.out.println("------------------------------------------------------------");
//		System.out.println("[p]이전페이지 / [n]다음페이지 / [e]메뉴로이동 : ");
//		if (start == 1) {
//			System.out.println("[p]이전 또는 다음[n]");
//		}
	}

	static void printResultData(List<Seller> ls, int startAddr, int size) {
		int forLength = ls.size();
//		System.out.println("forLength1 : " + forLength);
//		System.out.println("forLength2 : " + (startAddr + size));
//		if(forLength <= size) {
//			forLength = (startAddr + size);
//		}
//		
		System.out.printf("%4s  %-11s\t      %-35s%10s\t" + "\t%s \t%s \t%s \t%s \t%s \t%10s", "NO", "SELLER", "ADDR",
				"ZIP CODE", "1", "2", "3", "4", "5", "BASE DATE\n");

		for (int i = startAddr - 1; i < forLength; i++) {
			Seller s = ls.get(i);
			System.out.printf("%4d", (i + 1));
			System.out.printf("  %-11s", s.getSeller());
			System.out.printf("\t      %-35s", s.getSellerAddr());
			System.out.printf("%10s\t", (s.getZipCode() != null) ? s.getZipCode() : "");
			System.out.printf("\t%s ", (s.getIsTrashBag() != null) ? s.getIsTrashBag() : "N");
			System.out.printf("\t%s ", (s.getIsGarBag() != null) ? s.getIsGarBag() : "N");
			System.out.printf("\t%s ", (s.getIsGarbageLarge() != null) ? s.getIsGarbageLarge() : "N");
			System.out.printf("\t%s ", (s.getIsWasteSticker() != null) ? s.getIsWasteSticker() : "N");
			System.out.printf("\t%s ", (s.getIsSpecialEnvelope() != null) ? s.getIsSpecialEnvelope() : "N");
			System.out.printf("%10s", s.getBaseDate());
			System.out.println();
		}

//		ls.forEach(s -> {
//			System.out.print(s.getSeller());
//			System.out.print("\t" + s.getSellerAddr());
//			System.out.print("\t" + s.getZipCode());
//			System.out.print("\t" + s.getIsTrashBag());
//			System.out.print("\t" + s.getIsGarBag());
//			System.out.print("\t" + s.getIsGarbageLarge());
//			System.out.print("\t" + s.getIsWasteSticker());
//			System.out.print("\t" + s.getIsSpecialEnvelope());
//			System.out.println("\t" + s.getBaseDate());
//		});
	}

	// 관리자접속인 경우
	static void printSubAdminMenu() {
		String[] menuString = { "[1] 판매처 추가", "[2] 판매처 수정", "[3] 판매처 삭제", "[4] 서버 최신데이터 가져오기", "[5] 판매처 정보 전체 삭제",
				"[e] 관리자 모드 나가기", };

		System.out.println("\n▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼");
		for (String menu : menuString) {
			System.out.printf("\t\t\t%s\n", menu);
		}
		System.out.println("▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲");
	}

	static void requestInput(UserMode userMode) {
		if (userMode.getLoginMode().equals("*")) {
			System.out.print("(관리자모드)\n☞ []안의 메뉴를 선택해 주세요. : ");
		} else {
//			if (userMode.getViewMode()) {
//				System.out.print("☞ 계속 보기기 이전(p) / 다음(n) / 종료(e) 선택해 주세요 : ");
//			} else {
			System.out.print("☞ []안의 메뉴를 선택해 주세요. : ");
//			}
		}
	}

	static boolean isExit(String str) {
		if (str == null || str.equals("")) {
			System.err.println("메뉴를 선택해주세요!!");
			return false;
		}

		if (str.charAt(0) == '3' || str.charAt(0) == 'e') {
			return true;
		} else {
			return false;
		}
	}

	static boolean isAdmin(String str) {
		if (str == null || str.equals("")) {
			System.err.println("메뉴를 선택해 주세요.");
			return false;
		} else {
			if (str.charAt(0) == '*') {
//				System.out.println("관리자입니다.");
				return true;
			} else {
//				System.out.println("관리자가 아닙니다.");
				return false;
			}
		}
	}

	static boolean is(String str) {
		if (str.charAt(0) == '*') {
//			System.out.println("관리자입니다.");
			return true;
		} else {
//			System.out.println("관리자가 아닙니다.");
			return false;
		}
	}
}
