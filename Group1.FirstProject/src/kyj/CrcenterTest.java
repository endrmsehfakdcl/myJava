package kyj;


import java.util.Scanner;

public class CrcenterTest {

	public static void CrcenterRun() {

		Scanner scanner = new Scanner(System.in);
		CrCenterList cr = new CrCenterList();
		boolean ismain = true;
		boolean iscenter = true;

		
		while (ismain) {
			System.out.println("서울특별시 유치원 정보 조회 서비스");
			System.out.println("|1. 일반유저 | 2. 관리자 | 3. 종료 |");
			System.out.println("메뉴를 입력하세요 :");
			int caseNumber = Integer.parseInt(scanner.nextLine());
			switch (caseNumber) {
			case 99:
				cr.loadDataFromJson("src/kyj/request.json");
			// 일반유저 화면
			case 1:
				while (iscenter) {
					System.out.println("=============================(일반유저)=============================");
					System.out.println("| 메뉴 | 1. 어린이집 전체 조회 | 2. 어린이집 명 검색 | 3. 지역별 어린이집 검색 | 4. 종료 |");
					System.out.println("메뉴를 입력하세요 :");
					int caseNumber1 = Integer.parseInt(scanner.nextLine());
					switch (caseNumber1) {
					// 어린이집 전체 조회
					case 1:
						cr.sqlRun();
						break;
					// 어린이집 이름 검색
					case 2:
						System.out.println("어린이집 이름 검색합니다.");
						System.out.print("어린이집 이름을 입력해주세요. :");
						String key1 = scanner.nextLine();
						cr.crnameSearch(key1);
						break;
					// 지역별 어린이집 검색
					case 3:
						System.out.println("지역별 어린이집을 검색합니다.");
						System.out.println("어린이집 지역을 입력해주세요. :");
						String key2 = scanner.nextLine();
						cr.craddrSearch(key2);
						break;
					case 4:
						iscenter = false;
						break;
					}
				}
				break;

			// 관리자 화면
			 case 2:
				 CrCenterList crCenterList = new CrCenterList();
				 boolean iscenter1 = crCenterList.counti();
				 
				 while (iscenter1) {
						System.out.println(
									"=======================================================================(관리자)=======================================================================");
						System.out.println(
									"| 메뉴 | 1. 어린이집 전체 조회 | 2. 어린이집 명 검색 | 3. 지역별 어린이집 검색 | 4. 어린이집 정보 추가 | 5. 어린이집 정보 수정 | 6. 어린이집 정보 삭제 | 7. 종료 |");
						System.out.println("메뉴를 입력하세요 :");
							int caseNumber2 = Integer.parseInt(scanner.nextLine());
							switch (caseNumber2) {
									// 어린이집 전체 조회
									case 1:
										cr.sqlRun();
										break;
									// 어린이집 이름 검색
									case 2:
										System.out.println("어린이집 이름 검색합니다.");
										System.out.print("어린이집 이름을 입력해주세요. :");
										String key1 = scanner.nextLine();
										cr.crnameSearch(key1);
										break;
									// 지역별 어린이집 검색
									case 3:
										System.out.println("지역별 어린이집을 검색합니다.");
										System.out.println("어린이집 지역을 입력해주세요. :");
										String key2 = scanner.nextLine();
										cr.craddrSearch(key2);
										break;
		
									// 어린이집 정보 삽입
									case 4:
										System.out.println("어린이집 정보를 추가합니다.");
										System.out.println("추가할 어린이집 정보를 입력해주세요.");
										cr.insert();
										break;
									// 어린이집 정보 수정
									case 5:
										System.out.println("어린이집 정보를 추가합니다.");
										System.out.println("수정할 어린이집 정보를 입력해주세요.");
										System.out.println("기존에 등록된 어린이집 시설코드를 입력하세요:");
										String key3 = scanner.nextLine();
										cr.modify(key3);
										break;
									// 어린이집 정보 삭제
									case 6:
										System.out.println("어린이집 정보를 삭제합니다.");
										System.out.println("삭제할 어린이집 시설코드를 입력하세요:");
										String key4 = scanner.nextLine();
										cr.crdelete(key4);
										break;
									 
									case 7:
										iscenter1 = false;
										break;
							}
						}
				
			// 종료
			case 3:
				ismain = false;
				break;
				
			default:
				System.out.println("잘못된 메뉴 선택입니다. 다시 입력해주세요.");
				break;
			}
		}
		scanner.close();
	}

}
