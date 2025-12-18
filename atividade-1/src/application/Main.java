package application;

import entities.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Groos Salary: ");
        employee.grossSalary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        sc.nextLine();
		System.out.println(employee);
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		sc.nextLine();
		employee.IncreaseSalary(percentage);
		System.out.println("Update data: " +employee);

        sc.close();

    }
}