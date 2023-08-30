package exam01;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SeoulLocationTest {

	List<SeoulLocationVO> list = new ArrayList<>();

	public static void main(String[] args) {

		SeoulLocationTest st = new SeoulLocationTest();
		st.seoulLocation();
	}

	private void seoulLocation() {
		// DAO 가져오기
		SeoulLocationDAO dao = SeoulLocationDAO.newInstance();
		SeoulLocationVO vo = new SeoulLocationVO();

		// https://korean.visitseoul.net/attractions?curPage=1
		// https://korean.visitseoul.net/attractions?curPage=46
//			Document doc = Jsoup.connect("https://korean.visitseoul.net/attractions").get();
		try {
			for (int i = 1; i <= 46; i++) {
				Document doc = Jsoup.connect("https://korean.visitseoul.net/attractions?curPage=" + i).get();
				Elements thumb = doc.select("ul.article-list li.item div.thumb");
				Elements title = doc.select("ul.article-list li.item div.infor-element span.title");
				Elements comment = doc.select("ul.article-list li.item div.infor-element span.text-dot-d");
				Elements link = doc.select("ul.article-list li.item a");
				System.out.println(i + "페이지");
//				System.out.println(title);
//				System.out.println(title.get(0).text());
//				System.out.println(title.text());

				for (int j = 0; j < thumb.size(); j++) {
					try {
						System.out.println(j + "번호");

						// title
						if (title.get(j).text().length() >= 200) {
							System.out.println(title.get(j).text());
							vo.setTitle(title.get(j).text().substring(0, 200));
						} else {
							System.out.println(title.get(j).text());
							vo.setTitle(title.get(j).text());
						}

						// titleInfo(comment)
						if (comment.get(j).text().length() >= 200) {
							System.out.println(comment.get(j).text());
							vo.setTitleInfo(comment.get(j).text().substring(0, 200));
						} else {
							System.out.println(comment.get(j).text());
							vo.setTitleInfo(comment.get(j).text());
						}

						//
						Document doc_s = Jsoup.connect("https://korean.visitseoul.net" + link.get(j).attr("href"))
								.get();

						try {
							for (int k = 0; k < doc_s.select("div.detail-map-infor:eq(0) dl").size(); k++) {

								// 전화번호
								Element phone1 = doc_s.select("div.detail-map-infor:eq(0) dl dt ").get(k);
								if (phone1.text().contains("전화")) {
									Element phone = doc_s.select("div.detail-map-infor:eq(0) dl dt + dd").get(k);
									vo.setPhone(phone.text());
									System.out.println(phone1.text() + " : " + phone.text());
								}

								// 이용시간
								Element info1 = doc_s.select("div.detail-map-infor:eq(0) dl dt").get(k);
								if (info1.text().contains("이용시간")) {
									Element info = doc_s.select("div.detail-map-infor:eq(0) dl dt + dd").get(k);
									if (info.text().length() >= 200) {
										System.out.println(info1.text() + " : " + info.text().substring(0, 200));
										vo.setInfo(info.text().substring(0, 200));
									} else {
										System.out.println(info1.text() + " : " + info.text());
										vo.setInfo(info.text());
									}
								}

								// 주소
								Element address1 = doc_s.select("div.detail-map-infor:eq(0) dl dt").get(k);
								if (address1.text().contains("주소")) {
									Element address = doc_s.select("div.detail-map-infor:eq(0) dl dt + dd").get(k);
									if (address.text().length() >= 200) {
										System.out.println(address1.text() + " : " + address.text().substring(0, 200));
										vo.setAddress(address.text().substring(0, 200));
									} else {
										System.out.println(address1.text() + " : " + address.text());
										vo.setAddress(address.text());
									}
								}

								// 트래픽 (교통정보)
								Element traffic_infomation1 = doc_s.select("div.detail-map-infor:eq(0) dl dt").get(k);
								if (traffic_infomation1.text().contains("교통")) {
									Element traffic = doc_s.select("div.detail-map-infor:eq(0) dl dt + dd").get(k);
									if (traffic.text().length() >= 200) {
										System.out.println(traffic_infomation1.text() + " : " + traffic.text());
										vo.setTraffic(traffic.text().substring(0, 200));
									} else {
										System.out.println(traffic_infomation1.text() + " : " + traffic.text());
										vo.setTraffic(traffic.text());
									}
								}

							}
						} catch (Exception e) {
							e.printStackTrace();
						}
						dao.SeoulLocationInsert(vo);

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
