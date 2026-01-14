package application;

import java.util.Scanner;
import java.util.Locale;
import util.CurrencyConverter;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollar will be bought? ");
		double quantity = sc.nextDouble();
		
		double valueConverted = CurrencyConverter.convert(dollarPrice, quantity);
		
		System.out.printf("Amount to be paid in reais = R$ %.2f", valueConverted);
		
		sc.close();
	}
}
