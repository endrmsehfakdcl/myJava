package exam05;

public class Board {
	private String title;
	private String content;
	private String writer;

	public Board(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
 
	@Override
	public String toString() {
		return title + ", " + content + ", " + writer;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Board) {
			Board board = (Board) obj;
			return this.title.equals(board.title);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.title.hashCode();
	}
}
