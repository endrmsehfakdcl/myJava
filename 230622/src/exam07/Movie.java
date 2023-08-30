package exam07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//0ac474d8daf76142d10e52d29bf9c9ab
public class Movie {
	public static void main(String[] args) {
		String key = "0ac474d8daf76142d10e52d29bf9c9ab";

		String result = "";

		try {
			URL url = new URL("http://kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieInfo.json?key=" + key
					+ "&movieCd=20124039");
			BufferedReader bf;
			bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8")); // url이 가지고 있는 스트림
			result = bf.readLine();

			JSONParser jsonParser = new JSONParser(); // json 파싱
			JSONObject jsonObject = (JSONObject) jsonParser.parse(result); // jsonobject로 형변환

			JSONObject movieInfoResult = (JSONObject) jsonObject.get("movieInfoResult"); // movieInfoResult
			JSONObject movieInfo = (JSONObject) movieInfoResult.get("movieInfo"); // movieInfo
			// MovieNm MovieNmEn 영화명
			System.out.println("영화코드 : " + movieInfo.get("movieCd"));
			System.out.println("영화명(한글) : " + movieInfo.get("movieNm"));
			System.out.println("영화명(영문) : " + movieInfo.get("movieNmEn"));

			// nations 국적
			JSONArray nations = (JSONArray) movieInfo.get("nations"); // 배열이므로 배열타입으로 가져온다
			JSONObject nations_nationNm = (JSONObject) nations.get(0); // nationNm 을 확인한다
			System.out.println("제작국가 : " + nations_nationNm.get("nationNm"));
			// directors 감독
			JSONArray directors = (JSONArray) movieInfo.get("directors");
			JSONObject directors_directors_NM = (JSONObject) directors.get(0);
			System.out.println("감독 : " + directors_directors_NM.get("peopleNm"));
			// genre 장르
			JSONArray genres = (JSONArray) movieInfo.get("genres");
			JSONObject genres_genre_NM = (JSONObject) genres.get(0);
			System.out.println("장르 : " + genres_genre_NM.get("genreNm"));
			// actors 배우
			JSONArray actors = (JSONArray) movieInfo.get("actors");
			String peopleNm = "";
			for (int i = 0; i < actors.size(); i++) {
				JSONObject actors_peopleNm = (JSONObject) actors.get(i);
				peopleNm += actors_peopleNm.get("peopleNm") + " ";
//				peopleNm = peopleNm + actors_peopleNm.get("peopleNm");
			}
			System.out.println("출연 배우 : " + peopleNm);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
