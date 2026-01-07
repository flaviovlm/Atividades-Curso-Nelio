package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int numberAccount =  sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String nameHolder = sc.nextLine();

		System.out.print("Is there an initial deposit (1 - YES/2- NO)? ");
		int choice = sc.nextInt();
		sc.nextLine();

		Account account;
		if (choice == 1){
			System.out.print("Enter initial deposit value: ");
			double initialBalance = sc.nextDouble();
			account = new Account(numberAccount, nameHolder,initialBalance);
		} else {
			 account = new Account(numberAccount, nameHolder);
		}

		System.out.println();
		System.out.println("Account Data: ");
		System.out.println(account);

		System.out.print("Enter a deposit value: ");
		double valueDeposit = sc.nextDouble();
		account.deposit(valueDeposit);
		System.out.println(account);
		System.out.print("Enter a withdraw value: ");
		double valueWithdraw = sc.nextDouble();
		account.withdraw(valueWithdraw);
		System.out.println(account);
		sc.close();
	}
}
