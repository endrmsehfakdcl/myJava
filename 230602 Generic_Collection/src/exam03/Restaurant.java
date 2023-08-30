package exam03;

public class Restaurant {
	public static void main(String[] args) {
		Dish dish = new Dish();
		new Thread(new Customer(dish)).start();
		new Thread(new Cook(dish)).start();
	}
}
