package application;

import java.util.Locale;
import java.util.Scanner;

import model.entites.Account;
import model.exceptions.WithdrawException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, initialBalance, withdrawLimit);
		
		System.out.println();

		try {
			System.out.print("Enter amount for withdraw: ");
			account.withdraw(sc.nextDouble());
			
			System.out.printf("New balance: %.2f", account.getBalance());
			
		} catch (WithdrawException e) {
			System.out.println((e.getMessage()));
		} 
		
		sc.close();
	}

}
