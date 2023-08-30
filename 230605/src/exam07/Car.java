package exam07;

import java.util.Arrays;
import java.util.List;

public class Car {
	private String model;
	private boolean gasoline;
	private int age;
	private int mileage;

	public Car(String model, boolean gasoline, int age, int mileage) {
		this.model = model;
		this.gasoline = gasoline;
		this.age = age;
		this.mileage = mileage;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isGasoline() {
		return gasoline;
	}

	public void setGasoline(boolean gasoline) {
		this.gasoline = gasoline;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", gasoline=" + gasoline 
				+ ", age=" + age + ", mileage=" + mileage + "]";
	}

	public static final List<Car> cars = Arrays.asList(
			new Car("소나타", true, 18, 210000),
			new Car("코란다", false, 15, 200000),
			new Car("그랜저", true, 12, 150000),
			new Car("산타페", false, 10, 220000),
			new Car("아반테", true, 5, 70000),
			new Car("에쿠스", true, 6, 120000),
			new Car("산타페", false, 2, 2000)
			);
}
