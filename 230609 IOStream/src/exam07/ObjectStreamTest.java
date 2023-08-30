package exam07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectStreamTest {
	public static void main(String[] args) throws Exception {
		writeList();
		List<Board> list = readList();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (Board board : list) {
			System.out.println(board.getBno() + "\t" + board.getTitle() + "\t" + board.getContent() + "\t"
					+ board.getWriter() + "\t" + sdf.format(board.getDate()));
		}
	}

	private static List<Board> readList() throws Exception {
		FileInputStream fis = new FileInputStream("C:/Temp/board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Board> list = (List<Board>) ois.readObject();
		return list;
	}

	private static void writeList() throws Exception {
		List<Board> list = new ArrayList<>();

		list.add(new Board(1, "제목1", "내용1", "작성자1", new Date()));
		list.add(new Board(2, "제목2", "내용2", "작성자2", new Date()));
		list.add(new Board(3, "제목3", "내용3", "작성자3", new Date()));
		list.add(new Board(4, "제목4", "내용4", "작성자4", new Date()));

		FileOutputStream fos = new FileOutputStream(new File("C:/Temp/board.db"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}
}
