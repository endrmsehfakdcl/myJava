package exam03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadArrayTest {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("c:/temp/test2.db");
		byte[] buffer = new byte[100];
		while (true) {
			int readByteNum = is.read(buffer);
			// EOF = -1
			if (readByteNum == -1) {
				break;
			}
			for (int i = 0; i < readByteNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();
	}
}
 