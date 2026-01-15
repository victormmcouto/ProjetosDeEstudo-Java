package entities;

import java.time.Duration;
import java.time.LocalDateTime;

public class CarRenting {
	
	public Car car;
	public LocalDateTime pickupTime, returnTime;
	public Double priceHour, priceDay;
	
	public static final Double brazilTax = 0.2;
	
	public CarRenting() {
	}

	public CarRenting(Car car, LocalDateTime pickupTime, LocalDateTime returnTime, Double priceHour, Double priceDay) {
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
		return Duration.between(returnTime, pickupTime);
	}
	
	/*public Double basicPayment() {
		return totalTime().;
	}
	
	/*public Double getTotalTax() {
		
	}
	
	public String invoice() {
		
	}*/
}
