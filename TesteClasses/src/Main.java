import java.util.Locale;
import java.util.Scanner;

import Entities.Triangle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle t1, t2;
		double areaT1, areaT2;
		
		t1 = new Triangle();
		t2 = new Triangle();
		
		System.out.println("Enter the sides of a triangle: ");
		t1.a = sc.nextDouble();
		t1.b = sc.nextDouble();
		t1.c = sc.nextDouble();
		System.out.println("Enter the sides of a triangle: ");
		t2.a = sc.nextDouble();
		t2.b = sc.nextDouble();
		t2.c = sc.nextDouble();
		
		areaT1 = t1.area();
		areaT2 = t2.area();
		
		System.out.printf("Área T1: %.4f\n", areaT1);
		System.out.printf("Área T2: %.4f", areaT2);
		 		
		sc.close();
	}

}
