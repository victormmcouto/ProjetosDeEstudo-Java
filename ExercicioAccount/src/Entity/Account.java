package Entity;

public class Account {
	private final double TAX = 5.00;
	
	private int accountID;
	private String holderName;
	private double balance;
	
	public Account() {
	}
	
	public Account(int accountID, String holderName, double deposit) {
		this.accountID = accountID;
		this.holderName = holderName;
		this.balance = deposit;
	}
	
	public Account(int accountID, String holderName) {
		this.accountID = accountID;
		this.holderName = holderName;
	}
	
	public int getAccountID() {
		return accountID;
	}
	
	public String getHolderName() {
		return holderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	
	public void deposit(double depositValue) {
		balance += depositValue;
	}
	
	public void withdraw(double withdrawValue) {
		balance -= withdrawValue - TAX;
	}
	
	public String toString() {
		return "Account: " + accountID + ", "
			   + "Holder: " + holderName + ", "
			   + "Balance: $ " + String.format("%.2f", balance);
	}
}
