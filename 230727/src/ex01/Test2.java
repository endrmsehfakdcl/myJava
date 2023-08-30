package ex01;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver"; // 드라이버 ID
	public static final String WEB_DRIVER_PATH = "C:\\chromedriver.exe"; // 드라이버 경로

	public static void main(String[] args) {
		// 드라이버 설정
		try {
			System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 크롬 설정을 담은 객체 생성
		ChromeOptions options = new ChromeOptions();
		// 브라우저가 눈에 보이지 않고 내부적으로 돈다.
		// 설정하지 않을 시 실제 크롬 창이 생성되고, 어떤 순서로 진행되는지 확인할 수 있다.
//		options.addArguments("headless");

		// 위에서 설정한 옵션은 담은 드라이버 객체 생성
		// 옵션을 설정하지 않았을 때에는 생략 가능하다.
		// WebDriver객체가 곧 하나의 브라우저 창이라 생각한다.
		WebDriver driver = new ChromeDriver(options);

		// 이동을 원하는 url
		String url = "https://www.koreabaseball.com/TeamRank/TeamRank.aspx";

		// WebDriver을 해당 url로 이동한다.
		driver.get(url);

		// 브라우저 이동시 생기는 로드시간을 기다린다.
		// HTTP응답속도보다 자바의 컴파일 속도가 더 빠르기 때문에 임의적으로 1초를 대기한다.
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		DAO dao = DAO.newInstance();
		VO vo = new VO();

		try {
			// 2023년도부터 2015년도 데이터까지
			for (int dy = 2023; dy >= 2015; dy--) {
				String desiredYear = Integer.toString(dy);

				WebElement dropdown = driver.findElement(By.id("cphContents_cphContents_cphContents_ddlYear"));
				Select yearSelect = new Select(dropdown);
				yearSelect.selectByValue(desiredYear);

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

//			Document doc = Jsoup.connect("https://www.koreabaseball.com/TeamRank/TeamRank.aspx").get();
				Document doc = Jsoup.parse(driver.getPageSource());

				for (int i = 0; i < 10; i++) {
					// 연도
					Elements year = doc.select("select:eq(0) option[selected]");
//				year1.removeAttr("selected");
//				Elements year = doc.select("select:eq(0) option[value='2022']");
					year.attr("selected", "selected");
					System.out.println(year.text() + "년");
					vo.setYear(Integer.parseInt(year.text()));

					Elements ranking = doc.select(
							"div#cphContents_cphContents_cphContents_udpRecord>table tbody tr:eq(" + i + ") td:eq(0)");
					System.out.println("순위 : " + ranking.text());
					vo.setRanking(Integer.parseInt(ranking.text()));

					Elements teamname = doc.select(
							"div#cphContents_cphContents_cphContents_udpRecord> table tbody tr:eq(" + i + ") td:eq(1)");
					System.out.println("팀명 : " + teamname.text());
					vo.setTeamname(teamname.text());

					Elements matches = doc.select(
							"div#cphContents_cphContents_cphContents_udpRecord> table tbody tr:eq(" + i + ") td:eq(2)");
					System.out.println("경기 : " + matches.text());
					vo.setMatches(Integer.parseInt(matches.text()));

					Elements win = doc.select(
							"div#cphContents_cphContents_cphContents_udpRecord> table tbody tr:eq(" + i + ") td:eq(3)");
					System.out.println("승 : " + win.text());
					vo.setWin(Integer.parseInt(win.text()));

					Elements lose = doc.select(
							"div#cphContents_cphContents_cphContents_udpRecord> table tbody tr:eq(" + i + ") td:eq(4)");
					System.out.println("패 : " + lose.text());
					vo.setLose(Integer.parseInt(lose.text()));

					Elements tie = doc.select(
							"div#cphContents_cphContents_cphContents_udpRecord> table tbody tr:eq(" + i + ") td:eq(5)");
					System.out.println("무 : " + tie.text());
					vo.setTie(Integer.parseInt(tie.text()));

					Elements percentage = doc.select(
							"div#cphContents_cphContents_cphContents_udpRecord> table tbody tr:eq(" + i + ") td:eq(6)");
					System.out.println("승률 : " + percentage.text());
					vo.setPercentage(Float.parseFloat(percentage.text()));

					System.out.println(vo);
					dao.Insert(vo);
				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		// 1초 대기
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//		}

//		try {
//			// 드라이버가 null이 아니라면
//			if (driver != null) {
//				// 드라이버 연결 종료
//				driver.close(); // 드라이버 연결 해제
//
//				// 프로세스 종료
//				driver.quit();
//			}
//		} catch (Exception e) {
//			throw new RuntimeException(e.getMessage());
//		}
	}

}