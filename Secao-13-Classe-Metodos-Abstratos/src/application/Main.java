package application;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.TaxPayers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayers> taxPayersList = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int numberTaxPayers = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < numberTaxPayers; i++) {
			System.out.printf("Tax payer #%d data:\n", i + 1);
			System.out.print("Individual or Company (i/c)? ");
			char choice = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double annualIncome = sc.nextDouble();
			if (choice == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenses = sc.nextDouble();
				taxPayersList.add(new NaturalPerson(name, annualIncome, healthExpenses));
			} else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				sc.nextLine();
				taxPayersList.add(new LegalPerson(name, annualIncome, numberEmployees));
			}

		}
		System.out.println();
		System.out.println("-- TAXES PAID --");

		double sum = 0;
		for (TaxPayers taxPayers : taxPayersList) {
			System.out.println(taxPayers.getName() + ": $" + String.format("%.2f", taxPayers.taxPaid()));
			sum += taxPayers.taxPaid();

		}

		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

		sc.close();
	}
}