package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entites.Contract;
import model.entites.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter contract data:");
		System.out.print("Contract number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), format);
		System.out.print("Contract value: ");
		double value = sc.nextDouble();
		System.out.print("Number of installments: ");
		int numInstallments = sc.nextInt();
		
		Contract contract = new Contract(number, date, value);
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, numInstallments);
		
		System.out.println("Installments: ");
		
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		
		sc.close();
	}
}
