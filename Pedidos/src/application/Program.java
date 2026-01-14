package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		String name, email, status, pdctName, birthDate;
		Integer itemsToProcess, quantity;
		Double pdctPrice;
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Email: ");
		email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		birthDate = sc.next();
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		
		System.out.print("Status: ");
		status = sc.next();
		System.out.print("How many itens to this order: ");
		itemsToProcess = sc.nextInt();
		
		Order order = new Order(client, status);
		
		for (int i=1;i<=itemsToProcess;i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product Name: ");
			sc.nextLine();
			pdctName = sc.nextLine();
			System.out.print("Product Price: ");
			pdctPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			quantity = sc.nextInt();
			
			Product product = new Product(pdctName, pdctPrice);
			OrderItem orderItem = new OrderItem(quantity, product);
			
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}

}
