package exam03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadArrayOffsetTest {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("c:/Temp/test2.db");
		byte[] buffer = new byte[5];

		int readByteNum = is.read(buffer, 1, 3); // buffer[1], buffer[2], buffer[3] 에 저장

		for (int i = 0; i < buffer.length; i++) {
			System.out.println(buffer[i]);
		}

		is.close();
	}
}
 