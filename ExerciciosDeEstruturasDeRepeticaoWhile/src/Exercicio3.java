import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int somaAlcool = 0; 
		int somaGasolina = 0;
		int somaDiesel = 0;
		
		int codigo = sc.nextInt();
		
		while (codigo != 4) {
			while (!(codigo >= 1 && codigo <= 4)) {
				System.out.println("Código inválido!");
				codigo = sc.nextInt();
			}
			
			switch (codigo) {
			case 1:
				somaAlcool += 1;
				break;
			case 2:
				somaGasolina += 1;
				break;
			case 3:
				somaDiesel += 1;
				break;
			}
			
			codigo = sc.nextInt();
		}
		
		System.out.println("\nMUITO OBRIGADO");
		System.out.println("Alcool: " + somaAlcool);
		System.out.println("Gasolina: " + somaGasolina);
		System.out.println("Diesel: " + somaDiesel);
		
		sc.close();
	}

}
