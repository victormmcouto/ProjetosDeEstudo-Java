package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Person;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		Person[] people = new Person[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:%n", i+1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			
			people[i] = new Person(name, age, height);
		}
		
		int lessThan16Counter = 0;
		double heightAccumulator = 0.0;
		String namesLessThan16 = "";
		
		for (int i=0; i<n; i++) {
			if (people[i].getAge() < 16) {
				lessThan16Counter++;
				namesLessThan16 += people[i].getName() + "%n";
			}
			heightAccumulator += people[i].getHeight();
		}
		
		System.out.println();
		
		double averageHeight = heightAccumulator / people.length;
		double percentageLessThan16 = lessThan16Counter / (double) n * 100;
		
		System.out.printf("Altura média: %.2f%n", averageHeight);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", percentageLessThan16);
		System.out.printf(namesLessThan16);
		
		sc.close();
	}
}
