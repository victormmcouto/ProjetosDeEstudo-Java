import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double a, b;
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			
			if (b != 0) {
				System.out.printf("%.1f\n", a / b);
			}
			else {
				System.out.println("Divisão impossível!");
			}
		}
		
		sc.close();
	}

}
