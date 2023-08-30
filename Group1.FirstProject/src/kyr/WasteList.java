package kyr;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class WasteList implements KeyListener {
	static DBjob dbJob = new DBjob();
	static UserMode userMode;
	static List<Seller> resultList;

	public static void WasteListRun() throws Exception {
		Scanner scanner = new Scanner(System.in);
		userMode = new UserMode();
		int cPage = 1;

//		// 초기에 데이터 가져오기
//		dbjob = new DBjob();
//		serverData();
		WasteUtil.printProgramTitle();

		do {
			String input = null, subInput;			

			WasteUtil.printMainMenu();
			WasteUtil.requestInput(userMode);
			input = scanner.nextLine();
			excuteMenu(input);

			do { // adm
//				System.out.println("userMode.isAdmin() : " + userMode.isAdmin());
				if (userMode.isAdmin()) {
					WasteUtil.printSubAdminMenu();
					userMode.setLoginMode("*");
					WasteUtil.requestInput(userMode);
					subInput = scanner.nextLine();
					excuteMenu(subInput);

					if (!userMode.getLoginMode().equals("*"))
						break;

				} else {
					WasteUtil.printMainMenu();
					WasteUtil.requestInput(userMode);
					subInput = scanner.nextLine();
					excuteMenu(subInput);
					break;
				}
			} while (true);
		} while (true);

//		scanner.close();
//		System.out.println("프로그램이 종료 되었습니다.");
	}

	// 메뉴선택에 따른 분기
	static void excuteMenu(String input) {
		if (input == null || input.equals("")) {
			System.err.println("메뉴를 선택해주세요!!");
			return;
		}
		char choose = input.charAt(0);

		switch (choose) {
		case '1':
			if (userMode.isAdmin()) { // 판매처 정보 전체 가져오기
				dbJob.insertSeller(inputSellerInfo());
			} else {
				conditionSearch(dbJob.ISTRASHBAG); // 종량제봉투취급처 보기 or 판매처 추가
			}
			break;
		case '2':
			if (userMode.isAdmin()) { // 판매처 정보 전체 가져오기
				prepareUpdate(input, choose);
			} else {
				conditionSearch(dbJob.ISGARBAG);
			}
			break;
		case '3':
			if (userMode.isAdmin()) { // 판매처 정보 전체 가져오기
				prepareDelete(input, choose);
			} else {
				conditionSearch(dbJob.ISGARBAG_LARGE);
			}
			break;
		case '4':
			if (userMode.isAdmin()) { // 판매처 정보 전체 가져오기
				dbJob.initDbRun();
			} else {
				conditionSearch(dbJob.ISWASTE_STICKER);
			}
			break;
		case '5':
			if (userMode.isAdmin()) { // 판매처 정보 전체 삭제
				dbJob.deleteSellerAll();
			} else {
				conditionSearch(dbJob.ISSPECIAL_ENVELOPE);
			}
			break;
		case '6':
			if (userMode.isAdmin()) {
//				dbJob.deleteSellerAll();
			} else {
//				System.out.println("input : " + input);
				conditionSearch(dbJob.SELLER_ADDR);
			}
			break;
		case 'e':
			if (userMode.getViewMode()) {
				userMode.setViewMode(false);
			} else {
				if (!userMode.isAdmin()) {
					System.out.println("\n프로그램을 종료합니다.");
					System.exit(0);
				} else {
					userMode.setLoginMode("U");
				}
			}
			break;
		case '*':
			userMode.setLoginMode("*");
			userMode.setViewMode(false);
			break;
		default:
			break;
		}
	}

	static List<Seller> prepareSearch() {
		Scanner s = new Scanner(System.in);
		System.out.print("주소로 검색할 키워드를 입력해주세요 : ");
		String addr = s.nextLine();
		List<Seller> listS = dbJob.searchData(dbJob.SELLER_ADDR, 1, " where seller_addr like '%" + addr + "%';");
//		System.err.println(" printResultData !!!");
		WasteUtil.printResultData(listS, 1, dbJob.PER_MAX_COUNT);
//		s.close();
		return listS;
	}

	static void conditionSearch(String column) {
//		if (!userMode.isAdmin()) {
		// 조건에 따른 데이터 가져오기
		if (column.equals(dbJob.SELLER_ADDR)) {
			resultList = prepareSearch();
		} else {
			resultList = dbJob.searchData(column, 1, "");
			WasteUtil.printResultData(resultList, 1, dbJob.PER_MAX_COUNT);
		}

		if (resultList.size() <= 0) {
			System.out.println("검색결과가 존재하지 않습니다.");
		}

//			

//		} else {
//			dbJob.insertSeller(inputSellerInfo());
//			System.out.println("구현???");
//		}
	}

	static Seller prepareUpdate(String input, int choose) {
		// 판매처 수정
		Scanner s = new Scanner(System.in);
		System.out.print("수정할 판매처명을 검색해주세요 : ");
		String sellerName = s.nextLine();
		List<Seller> listS = dbJob.searchData(input, choose, " where seller like '%" + sellerName + "%';");

		if (listS.size() == 0) {
			System.err.println("판매처 정보 검색 결과가 존재하지 않습니다. ");
		} else {
			WasteUtil.printResultData(listS, 1, dbJob.PER_MAX_COUNT);
			System.out.print("수정할 판매처의 번호를 입력해주세요 : ");
			int num = s.nextInt() - 1;

			if (num > (listS.size() - 1)) {
				System.err.println("목록에 있는 숫자인지 확인해주세요!! ");
			}
			sellerName = listS.get(num).getSeller();

			Seller newSeller = inputSellerInfo();
			if (sellerName != null && !sellerName.equals("")) {
				dbJob.modifySeller(newSeller, sellerName);
			}
		}
//		s.close();
		return null;
	}

	static void prepareDelete(String input, int choose) {
		// 판매처 삭제
		Scanner s = new Scanner(System.in);
		System.out.print("삭제할 판매처를 판매처명을 검색해주세요. : ");
		String sellerName = s.nextLine();
		List<Seller> listS = dbJob.searchData(input, choose, " where seller like '%" + sellerName + "%';");

		if (listS.size() == 0) {
			System.err.println("판매처 정보 검색 결과가 존재하지 않습니다.!! ");
		} else {
			WasteUtil.printResultData(listS, 1, dbJob.PER_MAX_COUNT);
			System.out.println("삭제할 판매처의 번호를 입력해주세요 : ");
			int num = s.nextInt() - 1;

			if (num > (listS.size() - 1)) {
				System.err.println("목록에 있는 숫자인지 확인해주세요!! ");
				return;
			}
			sellerName = listS.get(num).getSeller();
			dbJob.deleteSeller(sellerName);
		}
	}

	static Seller inputSellerInfo() {
		Scanner scanner = new Scanner(System.in);
		Seller seller = new Seller();
		boolean result = false;
		String printInputName;

		System.out.println("\n[정보입력]");
		System.out.println("부평구 종량제봉투 판매정보를 입력해 주세요.");
		System.out.print("판매처 : ");
		seller.setSeller(scanner.nextLine());
		System.out.print("도로명주소 : ");
		seller.setSellerAddr(scanner.nextLine());
		System.out.print("우편번호 : ");
		seller.setZipCode(scanner.nextLine());

		printInputName = "종량제봉투취급여부";
		System.out.print(printInputName + "(y/n) : ");
		seller.setIsTrashBag(WasteUtil.inputLoop(printInputName, scanner.nextLine()));
		printInputName = "음식물납부필증(가정용)취급여부";
		System.out.print(printInputName + "(y/n) : ");
		seller.setIsGarBag(WasteUtil.inputLoop(printInputName, scanner.nextLine()));
		printInputName = "임식물납부필증(120L)취급여부";
		System.out.print(printInputName + "(y/n) : ");
		seller.setIsGarbageLarge(WasteUtil.inputLoop(printInputName, scanner.nextLine()));
		printInputName = "대형폐기스티커취급여부";
		System.out.print(printInputName + "(y/n) : ");
		seller.setIsWasteSticker(WasteUtil.inputLoop(printInputName, scanner.nextLine()));
		printInputName = "특수규격봉투취급여부";
		System.out.print(printInputName + "(y/n) : ");
		seller.setIsSpecialEnvelope(WasteUtil.inputLoop(printInputName, scanner.nextLine()));
		System.out.print("데이터기준일자는 오늘 날짜로 자동 입력됩니다.\n\n");
		seller.setBaseDate(LocalDate.now());

		return seller;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("------ e1 : " + e);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("------ e : " + e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("------ e3 : " + e);
	}
}
