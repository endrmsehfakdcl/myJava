package exam07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineTest {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader(ReadLineTest.class.getResource("language.txt").getPath());
		BufferedReader br = new BufferedReader(reader);
		
		System.out.println(ReadLineTest.class.getResource("language.txt").getPath());
		while (true) {
			String data = br.readLine();
			if (data == null) {
				break;
			}
			System.out.println(data);
		}
		
		br.close();
	}
}
