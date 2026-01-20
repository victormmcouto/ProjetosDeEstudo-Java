package model.entities;

import java.time.LocalDateTime;

public class CarRental {
	
	private Car car;
	private Invoice invoice;
	
	private LocalDateTime pickupTime, returnTime;
	
	public CarRental() {
	}

	public CarRental(LocalDateTime pickupTime, LocalDateTime returnTime, Car car)  {		
		this.car = car;
		this.pickupTime = pickupTime;
		this.returnTime = returnTime;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public LocalDateTime getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(LocalDateTime pickupTime) {
		this.pickupTime = pickupTime;
	}

	public LocalDateTime getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(LocalDateTime returnTime) {
		this.returnTime = returnTime;
	}
	
}
