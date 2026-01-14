package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.OrderItem;
import entities.Product;

public class Program {
	
	public static void main (String[] args) {
		
		String sourcePath = "C:\\Users\\victor.couto\\eclipse-workspace2\\LeituraEscritaArquivosCSV\\source.csv";
		String summaryPath = "C:\\Users\\victor.couto\\eclipse-workspace2\\LeituraEscritaArquivosCSV\\out\\summary.csv";
		String name;
		double price;
		int quantity;
		
		List<OrderItem> items = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourcePath))) {
			String line = br.readLine();

			while (line != null) {
				String[] lineData = line.split(",");
				
				name = lineData[0];
				price = Double.valueOf(lineData[1]);
				quantity = Integer.valueOf(lineData[2]);

				items.add(new OrderItem(quantity, price, new Product(name, price)));
				
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		File path = new File("C:\\Users\\victor.couto\\eclipse-workspace2\\LeituraEscritaArquivosCSV\\out\\");
		
		if (!path.exists()) path.mkdir();
				
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(summaryPath))) {
			for (OrderItem item : items) {
				name = item.getProduct().getName();
				
				bw.write(name + "," + String.format("%.2f", item.subTotal()) + "\n");
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
