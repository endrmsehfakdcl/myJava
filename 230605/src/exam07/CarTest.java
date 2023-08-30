package exam07;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
	public static void main(String[] args) {
		List<Car> diselCars = findCars(Car.cars, c -> !c.isGasoline());
		System.out.println("디젤 자동차 : " + diselCars);

		List<Car> oldCars = findCars(Car.cars, c -> c.getAge() >= 10);
		System.out.println("10년 이상된 자동차 : " + oldCars);

		List<Car> oldDiselCars = findCars(Car.cars, c -> (c.getAge() >= 10) & (!c.isGasoline()));
		System.out.println("10년 이상된 자동차 : " + oldDiselCars);

		System.out.println("디젤 자동차 = ");
		printCars(diselCars, c -> System.out.println(c.getModel() + " " + c.getAge()));
		System.out.println("\n 10년 이상된 자동차 : ");
		printCars(oldCars, c -> System.out.println(c.getModel() + " " + c.getAge() + " " + c.getMileage()));

	}

	public static List<Car> findCars(List<Car> all, CarPredicate cp) {
		List<Car> result = new ArrayList<Car>();

		for (Car car : all) {
			if (cp.test(car)) {
				result.add(car);
			}
		}
		return result;
	}

	public static void printCars(List<Car> all, CarConsumer cc) { //cc : 구현체
		for (Car car : all) {
			cc.accept(car);
		}
	}
}
