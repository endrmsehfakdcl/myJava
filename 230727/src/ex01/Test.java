package ex01;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Test {
	
	public static void test() {

		Test test = new Test();
		test.bRank();
	}

	private void bRank() {
		// TODO Auto-generated method stub
		DAO dao = DAO.newInstance();
		VO vo = new VO();

		// https://www.koreabaseball.com/TeamRank/TeamRank.aspx
		try {
			Document doc = Jsoup.connect("https://www.koreabaseball.com/TeamRank/TeamRank.aspx").get();

			for (int i = 0; i < 10; i++) {
				// 연도
				Elements year1 = doc.select("select:eq(0) option[selected]");
				year1.removeAttr("selected");
				Elements year = doc.select("select:eq(0) option[value='2023']");
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

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}

/*
 * private int no; => ai private int year; private int ranking; private String *
 * teamname; private int matches; private int win; private int lose; private int
 * * tie; private float percentage;
 */