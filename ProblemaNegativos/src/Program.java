import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		
		int quantidade;
		
		do 
			 quantidade = sc.nextInt();
		while (quantidade != 10);
		
		int[] numeros = new int[quantidade];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextInt(); 
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) System.out.println(numeros[i]);
		}
		
		sc.close();
	}
}
