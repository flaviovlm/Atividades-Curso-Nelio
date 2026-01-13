package application;


import entities.client.Client;
import entities.order.Order;
import entities.order.OrderItem;
import entities.order.OrderStatus;
import entities.product.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


		System.out.println("Enter the client data:");
		System.out.print("Name: ");
		String nameClient = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date date = sdf.parse(sc.next());
		sc.nextLine();
		Client client = new Client(nameClient, email, date);
		System.out.println();
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine();
		System.out.print("How many items to this order? ");
		int quantityAddItems = sc.nextInt();
		sc.nextLine();

		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
		for (int i = 0; i < quantityAddItems; i++) {
			System.out.printf("Enter #%d item data: \n", i + 1);
			System.out.print("Product name: ");
			String nameProduct = sc.nextLine();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantityItem = sc.nextInt();
			sc.nextLine();
			Product product = new Product(nameProduct, price);
			OrderItem orderItem = new OrderItem(quantityItem, product.getPrice(), product);
			order.addItem(orderItem);
		}

		System.out.println(order);
	}
}