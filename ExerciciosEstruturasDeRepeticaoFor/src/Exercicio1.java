import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um inteiro de 1 à 1000: ");
		int valor = sc.nextInt();
		
		while (!(valor >= 1 && valor <= 1000)) {
			System.out.println("Valor inválido!");
			System.out.print("Insira um inteiro de 1 à 1000: ");
			valor = sc.nextInt();
		}
		
		for (int i=1; i<=valor; i += 2) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
