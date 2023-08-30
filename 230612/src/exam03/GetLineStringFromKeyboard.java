package exam03;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineStringFromKeyboard {
	public static void main(String[] args) throws Exception {

		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);

		while (true) {
			System.out.print("입력하세요 : ");
			String str = br.readLine();
			if (str.equals("q") | str.equals("quit")) {
				System.out.println("종료합니다.");
				break;
			}
			System.out.println("입력된 내용 : " + str);
			System.out.println();
		}
		br.close();
	}
}
