package java8streams;

import java.util.Arrays;
import java.util.List;

public class ChainingOpsExample {
	static class Order {
		public Order(double price, int quantity, String name, boolean deliveredStatus) {
			super();
			this.price = price;
			this.quantity = quantity;
			this.name = name;
			this.deliveredStatus = deliveredStatus;
		}

		double price;
		int quantity;
		String name;
		boolean deliveredStatus;
	}

	public static void main(String[] args) {

		List<Order> orderList = Arrays.asList(new Order(80000, 1, "Laptop", true), new Order(30, 5, "Pen", true),
				new Order(700, 1, "Mouse", true), new Order(900, 1, "Earphones", false));

		Double sum = orderList.stream().filter(o -> o.deliveredStatus).map(o -> o.price * o.quantity).reduce(0.0,
				Double::sum);
		System.out.println("Total bill is " + sum);
	}
}
