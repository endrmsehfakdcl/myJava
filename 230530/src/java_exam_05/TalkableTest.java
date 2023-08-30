package java_exam_05;

public class TalkableTest {

	public static class TalkableTest2{
	    static void speak(Talkable talkable) {
	         talkable.talk();
	    }

	    public static void main(String[] args) {
	        speak(new Korean());
	        speak(new American());
	    }
	}
}
//
//	== 결과 : 안녕하세요!
//	         Hello!