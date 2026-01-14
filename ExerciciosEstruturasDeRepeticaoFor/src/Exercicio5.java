import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int fatorial = 1;
		
		if (N != 1) {
			for (int i=0; i<N; i++) {
				fatorial *= N - i;
			}
			
			System.out.println(fatorial);
		}
		else {
			System.out.println(1);
		}
			
		sc.close();
	}

}
