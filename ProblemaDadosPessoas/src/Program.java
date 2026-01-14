import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double maiorAltura, menorAltura, mediaAlturaMulheres;
		double somaAlturaMulheres;
		int quantidadeHomens, quantidadeMulheres;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		double[] alturas = new double[n];
		char[] sexos = new char[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			alturas[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			sexos[i] = sc.next().charAt(0);
		}
		
		maiorAltura = alturas[0];
		menorAltura = alturas[0];
		
		for (int i=0; i<n; i++) {
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			} else if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}			
		}
		
		somaAlturaMulheres = 0.0;
		quantidadeMulheres = 0;
		quantidadeHomens = 0;
		
		for (int i=0; i<n; i++) {
			if (sexos[i] == 'F') {
				somaAlturaMulheres += alturas[i];
				quantidadeMulheres++;
			 } else {
				 quantidadeHomens++;
			 }
		}
		
		mediaAlturaMulheres = somaAlturaMulheres / quantidadeMulheres;
		
		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
		System.out.printf("Numero de homens = %d", quantidadeHomens);
		
		sc.close();
	}
}
