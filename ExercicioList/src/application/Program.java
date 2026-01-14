package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("How many employees will be resgistered? ");
		int numEmployees = sc.nextInt();
		
		System.out.println();
		
		for (int i=1; i<numEmployees + 1; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			System.out.println();
			
			employees.add(new Employee(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		Employee employeeFound = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (employeeFound != null) {
			System.out.print("Enter the percentage: ");
			Double percentage = sc.nextDouble();
			employeeFound.increaseSalary(percentage);
		} else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		System.out.println("List of employees:");
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		sc.close();
	}
}
