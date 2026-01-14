import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] numeros = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
		}
		
		double sum = 0;
		double media;
		
		System.out.printf("%nVALORES = ");
		
		for (int i=0; i<n; i++) {
			System.out.print(numeros[i] + " ");
			sum += numeros[i];
		}
		
		media = sum / n;
		
		System.out.printf("%nSOMA = %.2f", sum);
		System.out.printf("%nMEDIA = %.2f", media);
		
		sc.close();
	}
}
