package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Product> productList = new ArrayList<>();


		System.out.print("Enter the number of products: ");
		int numberProducts = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < numberProducts; i++){
			System.out.printf("Product #%d data:\n", i + 1);
			System.out.print("Common, used or imported (c/u/i)? ");
			char choice = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if (choice == 'c'){
				productList.add(new Product(name, price));
			} else if (choice == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				productList.add(new UsedProduct(name, price, date));
			} else if (choice == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				productList.add(new ImportedProduct(name, price, customsFee));
			}
		}
		System.out.println();
		System.out.println("-- PRICE TAGS --");
		for (Product product : productList){
			System.out.println(product.priceTag());
		}
		sc.close();
	}
}