package java_exam_05;

public class TV extends Controller {
	public TV(boolean power) {
		super(power);
	}

	@Override
	public String getName() {
		String name = "TV";
		return name;
	}
	

}
