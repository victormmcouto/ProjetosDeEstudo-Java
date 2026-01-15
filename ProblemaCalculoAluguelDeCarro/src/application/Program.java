package application;

import java.security.InvalidAlgorithmParameterException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Car;
import entities.CarRenting;

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
		
		try {
			CarRenting carRenting = new CarRenting(new Car(model), pickupTime, returnTime,
					                               priceHour, priceDay);
			
			System.out.println(carRenting.invoice());
		} catch (InvalidAlgorithmParameterException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
