import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor1, valor2, valor3;
		double mediaPonderada;
		int p1 = 2, p2 = 3, p3 = 5;
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			valor1 = sc.nextDouble();
			valor2 = sc.nextDouble();
			valor3 = sc.nextDouble();
			
			mediaPonderada = (valor1 * p1 + valor2 * p2 + valor3 * p3) / 
										(p1 + p2 + p3);
			
			System.out.printf("%.1f\n", mediaPonderada);
		}
		
		sc.close();
	}
}
