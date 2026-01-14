package applicaton;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> pessoasPagadoraDeImpostos = new ArrayList<>();
		
		System.out.print("Entre com o número de pessoas pagadoras de impostos: ");
		int numPagadores = sc.nextInt();
		
		for (int i=1; i<=numPagadores; i++) {
			System.out.println("Dados da pessoa pagadora de impostos #" + i + ": ");
			System.out.print("Pessoa física ou Juridica (f/j)? ");
			char fiscaOuJuridica = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			
			if (fiscaOuJuridica == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastosComSaude = sc.nextDouble();
				pessoasPagadoraDeImpostos.add(new PessoaFisica(nome, rendaAnual, gastosComSaude));
			} else {
				System.out.print("Numero de funcionarios: ");
				int numeroDeFuncionarios = sc.nextInt();
				pessoasPagadoraDeImpostos.add(new PessoaJuridica(nome, rendaAnual, numeroDeFuncionarios));
			}
		}
		
		System.out.println();
		System.out.println("IMPOSTOS PAGOS: ");
		
		double soma = 0.0;
		
		for (Pessoa pessoa : pessoasPagadoraDeImpostos) {
			System.out.printf("%s: $ %.2f%n".formatted(pessoa.getNome(), pessoa.impostos()));
			soma += pessoa.impostos();
		}
		
		System.out.println();
		System.out.printf("IMPOSTOS TOTAIS: $ %.2f", soma);
		
		sc.close();
	}

}
