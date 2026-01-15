package entities;

import java.security.InvalidAlgorithmParameterException;
import java.time.Duration;
import java.time.LocalDateTime;

public class CarRenting {
	
	public Car car;
	public LocalDateTime pickupTime, returnTime;
	public Double priceHour, priceDay;
	
	public static final double brazilTaxUpTo100 = 0.2;
	public static final double brazilTaxAbove100 = 0.15;
	public static final int hourlyRentMaxTime = 12;
	
	public CarRenting() {
	}

	public CarRenting(Car car, LocalDateTime pickupTime, 
			          LocalDateTime returnTime, Double priceHour, Double priceDay) throws InvalidAlgorithmParameterException {
		if (pickupTime.isAfter(returnTime)) {
			throw new InvalidAlgorithmParameterException("Return date greater than pickup date!");
		}
		
		this.car = car;
		this.pickupTime = pickupTime;
		this.returnTime = returnTime;
		this.priceHour = priceHour;
		this.priceDay = priceDay;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public LocalDateTime getPickupTime() {
		return pickupTime;
	}

	public LocalDateTime getReturnTime() {
		return returnTime;
	}

	public Double getPriceHour() {
		return priceHour;
	}

	public void setPriceHour(Double priceHour) {
		this.priceHour = priceHour;
	}

	public Double getPriceDay() {
		return priceDay;
	}

	public void setPriceDay(Double priceDay) {
		this.priceDay = priceDay;
	}
	
	public Duration totalTime() {
		return Duration.between(pickupTime, returnTime);
	}
	
	public Double basicPayment() {
		double totalHour = (double) totalTime().toMinutes() / 60;
		double totalDays = (double) totalTime().toMinutes() / (60 * 60);
		
		if (totalHour <= hourlyRentMaxTime) {
			return Math.ceil(totalHour) * priceHour;
		} else {
			return Math.ceil(totalDays) * priceDay;
		}
	}
	
	public Double totalTax() {
		if (basicPayment() <= 100) {
			return basicPayment() * brazilTaxUpTo100;
		} else {
			return basicPayment() * brazilTaxAbove100;
		}
	}
	
	public Double totalPayment() {
		return basicPayment() + totalTax();
	}
	
	public String invoice() {
		return "INVOICE:\n" +
			   "Basic payment: " + String.format("%.2f", basicPayment()) + "\n" +
			   "Tax: " + String.format("%.2f", totalTax()) + "\n" +
			   "Total payment: " + String.format("%.2f", totalPayment());
	}
}
