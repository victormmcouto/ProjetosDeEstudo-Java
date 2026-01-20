package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Car;
import model.entities.CarRental;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter rental data");
		System.out.print("Car model: ");
		String model = sc.nextLine();
		System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
		LocalDateTime pickupTime = LocalDateTime.parse(sc.nextLine(), format);
		System.out.print("Return (dd/MM/yyyy hh:ss): ");
		LocalDateTime returnTime = LocalDateTime.parse(sc.nextLine(), format);
		System.out.print("Enter price per hour: ");
		double priceHour = sc.nextDouble();
		System.out.print("Enter price per day: ");
		double priceDay = sc.nextDouble();
		
		CarRental carRental = new CarRental(pickupTime, returnTime, new Car(model));
		
		RentalService rentalService = new RentalService(priceHour, priceDay, new BrazilTaxService());
		
		rentalService.processInvoice(carRental);
		
		System.out.println("INVOICE:");
		System.out.printf("Basic payment: %.2f\n", carRental.getInvoice().getBasicPayment());
		System.out.printf("Tax: %.2f\n", carRental.getInvoice().getTax());
		System.out.printf("Total Payment: %.2f", carRental.getInvoice().getTotalPayment());
		
		sc.close();
	}

}
