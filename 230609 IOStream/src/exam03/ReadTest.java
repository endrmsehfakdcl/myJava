package exam03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadTest {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("C:/Temp/test1.db");
 
		while (true) {
			int data = is.read();
			if (data == -1)
				break;
			System.out.println(data);
			// a = 12345 인데 57이 출력 되는 이유
			// 12345 = 11000000111001 (2)
			// byte는 8bit 이므로 00111001 (2) = 57
		}
		is.close();
	}
}
