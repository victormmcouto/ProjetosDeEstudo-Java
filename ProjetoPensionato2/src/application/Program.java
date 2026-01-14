package application;

import java.util.Scanner;
import entities.Rent;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int numOfRooms = sc.nextInt();
		
		Rent[] rents = new Rent[10];
		
		for(int i=0; i<numOfRooms; i++) {
			System.out.printf("\nRent #%d\n", i + 1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			rents[room - 1] = new Rent(name, email, room);
		}
		
		System.out.printf("\nBusy rooms:\n");
		
		for(int i=0; i<rents.length; i++) {
			if (rents[i] != null) System.out.println(rents[i]);
		}
		
		sc.close();
	}
}
