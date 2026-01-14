import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas vai digitar? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}
		
		int maiorIdade = idades[0];
		String nomeMaisVelho = "";
		
		for (int i=0; i<n; i++) {
			if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				nomeMaisVelho = nomes[i];
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s", nomeMaisVelho);
		
		sc.close();
	}
}
