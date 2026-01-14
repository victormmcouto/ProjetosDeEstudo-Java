import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senhaCorreta = 2002;
		int senhaDigitada = sc.nextInt();
		
		while (senhaDigitada != senhaCorreta) {
			System.out.println("Senha Inválida");
			senhaDigitada = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}
}
