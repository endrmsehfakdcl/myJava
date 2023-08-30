package java_exam_05;

public class Radio extends Controller {
	public Radio(boolean power) {
		super(power);
	}

	@Override
	public String getName() {
		String name = "Radio";
		return name;
	}


}
