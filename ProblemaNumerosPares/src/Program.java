import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Quantos numeros voce vai diditar? ");
		int n = sc.nextInt();
		int evenTotal = 0;
		
		int[] numeros = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.printf("%nNUMEROS PARES:%n");
		
		for (int i=0; i<n; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
				evenTotal++;
			}
		}
		
		System.out.printf("%n%nQUANTIDADE DE PARES = %d", evenTotal);
		
		sc.close();
	}

}
