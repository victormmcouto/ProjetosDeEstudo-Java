package entities;

public class PessoaFisica extends Pessoa {
	private Double gastosComSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}
	
	@Override
	public Double impostos() {
		double calculoTemp;
		if (rendaAnual < 20000.00) {
			calculoTemp = rendaAnual * 0.15;
		} else {
			calculoTemp = rendaAnual * 0.25;
		}
		return calculoTemp - (gastosComSaude * 0.5);
	}
}
