package exam06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferTest {
	public static void main(String[] args) throws Exception {

		String OriginalFilePath1 = BufferTest.class.getResource("bg001.jpg").getPath();
		String targetFilePath1 = "C:/Temp/targetFile1.jpg"; // 파일 이름 지정함
		FileInputStream fis = new FileInputStream(OriginalFilePath1); // InputStream 생성
		FileOutputStream fos = new FileOutputStream(targetFilePath1); // OutputStream 생성

		String OriginalFilePath2 = BufferTest.class.getResource("bg001.jpg").getPath();
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(OriginalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);

		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);

		System.out.println("OriginalFilePath1 : " + OriginalFilePath1);
		System.out.println("OriginalFilePath2 : " + OriginalFilePath2);
		System.out.println("targetFilePath1 : " + targetFilePath1);
		System.out.println("targetFilePath2 : " + targetFilePath2);
		long nonBufferTime = copy(fis, fos);
		System.out.println("nonBufferTime : " + nonBufferTime);
		long bufferTime = copy(bis, bos);
		System.out.println("bufferTime    : " + bufferTime);

		fis.close();
		fos.close();
		bis.close();
		bos.close();
		fis2.close();
		fos2.close();
	}

//	static int data = -1;
	// new 없이 쓰려고 static으로 내부
	private static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime(); // 시간 스타트
		while (true) {
			int data = is.read(); // InputStream 리딩
			if (data == -1) {
				break;
			}
			os.write(data);
		}
		os.flush(); // 끝나고 플러싱

		return (System.nanoTime() - start); // 리턴하는 시간 - 스타트 시간
	}
}
