import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor;
		int in = 0;
		int out = 0;
		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			valor = sc.nextInt();
			
			if (valor >= 10 && valor <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		
		System.out.printf("%d in\n%d out\n", in, out);
		
		sc.close();
	}

}
