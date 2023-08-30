package exam03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteTest {
	public static void main(String[] args) {
		OutputStream os = null;
		OutputStream os2 = null;
		OutputStream os3 = null;

		byte[] array = { 10, 20, 30 };
		try {
			os = new FileOutputStream("c:/Temp/test1.db");
			os2 = new FileOutputStream("c:/Temp/test2.db");
			os3 = new FileOutputStream("c:/Temp/test3.db");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		int a = 12345;
		int b = 20;
		int c = 30;

		try {
			os.write(a);
			os.write(b);
			os.write(c);
			os2.write(array);
			os3.write(array, 1, 2);
			os.flush();
			os.close();
			os2.flush();
			os2.close();
			os3.flush();
			os2.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
