import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double notaT1, notaT2;
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		double[] medias = new double[n];
		String[] nomes = new String[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Digite nome, primeia e segunda nota do %do aluno:\n", i + 1);
			sc.nextLine();
			
			nomes[i] = sc.nextLine();
			notaT1 = sc.nextDouble();
			notaT2 = sc.nextDouble();
			
			medias[i] = (notaT1 + notaT2) / 2;
		}
		
		System.out.println("Alnos aprovados:");
		
		for (int i=0; i<n; i++) {
			if (medias[i] >= 6.0) System.out.println(nomes[i]);
		}
		
		sc.close();
	}
}
