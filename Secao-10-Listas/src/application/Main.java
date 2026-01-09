package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> emp = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int opcao = sc.nextInt();
		for (int i = 0; i < opcao; i++) {
			sc.nextLine();
			System.out.printf("Employee #%d: \n", i + 1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();
			emp.add(new Employee(id, name, salary));
		}

		System.out.print("Enter the employee id that will have salary increase: ");
		int idSearch = sc.nextInt();
		sc.nextLine();
		Employee result = emp
				.stream()
				.filter(search -> search.getId() == idSearch)
				.findFirst().orElse(null);


		if (result != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			result.increaseSalary(percentage);
		} else {
			System.out.println("This id does not exist!");
		}

		for (Employee employee : emp){
			System.out.println(employee);
		}


	}
}
