package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		System.out.print("Enter full file path: ");
		String filePath = sc.next();

		List<Employee> employees = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");

				String name = fields[0];
				String email = fields[1];
				Double salary = Double.parseDouble(fields[2]);

				employees.add(new Employee(name, email, salary));

				line = br.readLine();
			}

			System.out.print("enter salary: ");
			Double salary = sc.nextDouble();

			System.out.println("Email of people whoe salary is more than 2000.00:");
			employees.stream().filter(x -> x.getSalary() > salary).map(x -> x.getEmail()).sorted()
					.forEach(System.out::println);

			Double sumOfCapitalM = employees.stream().filter(x -> x.getName().toUpperCase().charAt(0) == 'M')
					.map(x -> x.getSalary()).reduce(0.0, (x, y) -> x + y);

			System.out.println("Sum of salary of people whoe name starts with 'M': " + sumOfCapitalM);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
