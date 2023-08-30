package java_exam_04;

public class Smartphone extends Telephone {
	private String game;

	Smartphone() {
	}

	Smartphone(String owner, String game) {
		this.owner = owner;
		this.game = game;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	void playGame() {
		System.out.println(owner + "가 " + game + " 게임을 하는 중이다.");
	}
}
