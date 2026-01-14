import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] agrs) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qauntos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] numeros = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		double somaPares = 0.0;
		int counterPares = 0;
		
		for (int i=0; i<n; i++) {
			if (numeros[i] % 2 == 0) {
				somaPares += numeros[i];
				counterPares++;
			}
		}
		
		if (counterPares != 0) {
			double media = somaPares / counterPares;
			System.out.printf("MEDIA DOS PARES = %.1f", media);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();
	}
}
