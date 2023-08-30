package exam05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamTest {
	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}

	private static String read() throws Exception {
		FileInputStream fis = new FileInputStream("C:/Temp/test4.txt");
		Reader reader = new InputStreamReader(fis);
		// 버퍼 사이즈를 파일의 사이즈보다 적게하면 적게 읽음
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		System.out.println(readCharNum);
		reader.close();
		String data = new String(buffer, 0, readCharNum);
		return data;
	}

	private static void write(String string) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/test4.txt");
		Writer writer = new OutputStreamWriter(fos);
		writer.write(string);
		writer.close();

	}
}
