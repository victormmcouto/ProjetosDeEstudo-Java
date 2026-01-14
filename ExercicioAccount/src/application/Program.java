package application;

import java.util.Locale;
import java.util.Scanner;
import Entity.Account;

public class Program {
	public static void main(String[] args) {	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountID = sc.nextInt();
		System.out.printf("Enter account holder:%n");
		String holderName = sc.nextLine();
		System.out.print("Is there a initial deposit (y/n)? ");
		String hasFirstDeposit = sc.next();
		
		double initialDeposit = 0.0;
		
		if (hasFirstDeposit == "y") {
			System.out.print("Enter initial deposit Value: ");
			initialDeposit = sc.nextDouble();
		}
		
		Account account = new Account(accountID, holderName, initialDeposit);
		
		System.out.printf("%nAccount data:");
		System.out.printf(account + "%n");
		
		System.out.printf("%nEnter a deposit value: ");
		account.deposit(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.printf(account + "%n");
		
		System.out.printf("%nEntera withdraw value: ");
		account.withdraw(sc.nextDouble());
		System.out.println("Updadte account data: ");
		System.out.printf(account + "%n");
		
		sc.close();
	}
}
