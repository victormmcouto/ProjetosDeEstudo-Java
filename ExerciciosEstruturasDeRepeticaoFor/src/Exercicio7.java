import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		while (N <= 0) {
			System.out.println("O valor deve ser maior que 0");
			N = sc.nextInt();
		}
		
		for (int i=1; i<=N; i++) {
			System.out.printf("%d %d %d\n", i, i*i, i*i*i);
		}
		
		sc.close();
	}
}
