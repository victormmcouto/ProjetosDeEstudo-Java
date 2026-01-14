package application;

import entities.Account;
import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {

		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		Account acc1 = bacc;
		// DOWNCASTING
		BusinessAccount bacc1 = (BusinessAccount) acc1;
		
		System.out.println(bacc1.getLoanLimit());
	}
}