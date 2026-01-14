import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double eixoX = sc.nextDouble();
		double eixoY = sc.nextDouble();
		
		while (eixoX != 0 && eixoY != 0) {
			if (eixoX > 0 && eixoY > 0) {
				System.out.println("primeiro");
			}
			else if (eixoX > 0 && eixoY < 0) {
				System.out.println("quarto");
			}
			else if (eixoX < 0 && eixoY > 0) {
				System.out.println("segundo");
			}
			else if (eixoX < 0 && eixoY < 0) {
				System.out.println("terceiro");
			}
			
			eixoX = sc.nextDouble();
			eixoY = sc.nextDouble();
		}
		
		sc.close();
	}

}
