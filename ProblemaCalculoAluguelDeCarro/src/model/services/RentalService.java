package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;
	
	private BrazilTaxService  taxService;
	
	//Não coloca o construtor vazio para obrigar a passagem dos parÂmetros

	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		double duration = Duration.between(carRental.getPickupTime(), carRental.getReturnTime()).toMinutes();
		double hours = duration / 60;
		double days = hours / 24;
		
		double basicPayment, tax;
		
		if (hours <= 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		} else {
			basicPayment = Math.ceil(days) * pricePerDay;
		}
		
		tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
