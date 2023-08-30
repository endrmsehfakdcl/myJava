package exam02;

import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class CarFunctionTest {
	public static void main(String[] args) {

		Function<Car, String> f1 = c -> c.getModel();
		ToIntFunction<Car> f2 = c -> c.getAge();

		for (Car car : Car.cars) {
//			System.out.print("(" + car.getModel() + ", " + car.getAge() + ")");
			System.out.print("(" + f1.apply(car) + ", " + f2.applyAsInt(car) + ")");
		}
		System.out.println();
		double avgAge = average(Car.cars, c -> c.getAge());
		double avgMileage = average(Car.cars, c -> c.getMileage());

		System.out.println("평균 연식 : " + avgAge);
		System.out.println("평균 주행거리 : " + avgMileage);
	}

	private static double average(List<Car> cars, ToIntFunction<Car> f) {
		double sum = 0.0;

		for (Car car : cars) {
//			sum += car.getAge();
			sum += f.applyAsInt(car);
		}

		return sum / cars.size();

	}
}
