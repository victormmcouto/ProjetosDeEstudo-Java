package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.ImportedProduct;
import entites.Product;
import entites.UsedProduct;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int numOfProducts = sc.nextInt();
		
		List<Product> products = new ArrayList<>();
		
		for (int i=1; i<=numOfProducts; i++) {
			System.out.println("Product #" + i + " data:");
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char commomUsedOrImported = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (commomUsedOrImported == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				
				products.add(new ImportedProduct(name, price, customsFee));
			} else if (commomUsedOrImported == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String manufactureDate = sc.next();
				
				products.add(new UsedProduct(name, price, manufactureDate));
			} else {
				products.add(new Product(name, price));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		
		for (Product product: products) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}
}
