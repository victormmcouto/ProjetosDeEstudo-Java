package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;
import model.services.CalculationService;

public class Program {
	
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		
		String filePath = "C:\\Temp\\in.txt";
		
		List<Product> products = new ArrayList<>();
		
		try (BufferedReader file = new BufferedReader(new FileReader(filePath))) {
			String row = file.readLine();
			
			while (row != null) {
				String[] record = row.split(",");
				products.add(new Product(record[0], Double.parseDouble(record[1])));
				row = file.readLine();
			}
			
			System.out.println("Most expensive: ");
			System.out.println(CalculationService.max(products));
		
		} catch (IOException e) {
			System.out.println("Errror: " + e.getMessage());
		} catch (IllegalStateException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
