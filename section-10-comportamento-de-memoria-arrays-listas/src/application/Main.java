package application;

import entities.Rooms;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rooms[] vect = new Rooms[10];
		int option = 0;

		do {
			System.out.println("----- MENU -----");
			System.out.println("1 - Register Tenants");
			System.out.println("2 - List all Tenant");
			System.out.println("3 - Exit");
			System.out.print("Choice: ");
			option = sc.nextInt();
			sc.nextLine();

			switch (option) {
				case 1:
					System.out.print("How many rooms will be rented? ");
					int number = sc.nextInt();
					sc.nextLine();
					for (int i = 0; i < number; i++) {
						System.out.printf("Rent #%d: \n", i + 1);
						System.out.print("Name: ");
						String name = sc.nextLine();
						System.out.print("Email: ");
						String email = sc.nextLine();
						System.out.print("Room: ");
						int numberRoom = sc.nextInt();
						sc.nextLine();
						System.out.println();

						vect[numberRoom] = new Rooms(name, email);
					}
					break;
				case 2:

					System.out.println("Busy Rooms: ");
					for (int i = 0; i < vect.length; i++) {
						if (vect[i] != null) {
							System.out.println(+i+" : "+vect[i].getName()+ ", " +vect[i].getEmail());
						}
					}
					break;
				case 3:
					System.out.println("Leaving...");
					break;
				default:
					System.out.println("Typographical error. Please enter 1 to 3.");
					break;
			}
		} while (option != 3);
	}
}