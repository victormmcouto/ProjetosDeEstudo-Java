package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double convert(double price, double quantity) {
		double valueToBePaid = price * quantity;
		return valueToBePaid + valueToBePaid * IOF;
	}
}
