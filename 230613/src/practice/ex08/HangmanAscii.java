package practice.ex08;

public class HangmanAscii {
	static void draw(int lifeStock) {
		switch(lifeStock) {
		case 6: System.out.println("\t          +---+\r\n"
								 + "\t          |   |\r\n"
								 + "\t              |\r\n"
								 + "\t              |\r\n"
								 + "\t              |\r\n"
								 + "\t              |\r\n"
								 + "\t        ========");break;
		case 5: System.out.println("\t          +---+\r\n"
				 + "\t          |   |\r\n"
				 + "\t          O   |\r\n"
				 + "\t              |\r\n"
				 + "\t              |\r\n"
				 + "\t              |\r\n"
				 + "\t        ========");break;
		case 4: System.out.println("\t          +---+\r\n"
				 + "\t          |   |\r\n"
				 + "\t          O   |\r\n"
				 + "\t          |   |\r\n"
				 + "\t              |\r\n"
				 + "\t              |\r\n"
				 + "\t        ========");break;
		case 3: System.out.println("\t          +---+\r\n"
				 + "\t          |   |\r\n"
				 + "\t          O   |\r\n"
				 + "\t         /|   |\r\n"
				 + "\t              |\r\n"
				 + "\t              |\r\n"
				 + "\t        ========");break;
		case 2: System.out.println("\t          +---+\r\n"
				 + "\t          |   |\r\n"
				 + "\t          O   |\r\n"
				 + "\t         /|\\  |\r\n"
				 + "\t              |\r\n"
				 + "\t              |\r\n"
				 + "\t        ========");break;
		case 1: System.out.println("\t          +---+\r\n"
				 + "\t          |   |\r\n"
				 + "\t          O   |\r\n"
				 + "\t         /|\\  |\r\n"
				 + "\t         /    |\r\n"
				 + "\t              |\r\n"
				 + "\t        ========");break;
		case 0: System.out.println("\t          +---+\r\n"
				 + "\t          |   |\r\n"
				 + "\t          O   |\r\n"
				 + "\t         /|\\  |\r\n"
				 + "\t         / \\  |\r\n"
				 + "\t              |\r\n"
				 + "\t        ========");break;
		}
	}
}
