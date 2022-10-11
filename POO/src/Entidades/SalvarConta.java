package Entidades;

public class SalvarConta extends Conta {
     
	private double taxaJuro;
	private double balanco;

	public SalvarConta(int numero, String nome, double depositoIncial, double taxaJuro) {
		super(numero, nome, depositoIncial);
		this.taxaJuro = taxaJuro;
	}

	public double getTaxaJuro() {
		return taxaJuro;
	}

	public void setTaxaJuro(double taxaJuro) {
		this.taxaJuro = taxaJuro;
	}
	
	
	public double getBalanco() {
		return balanco;
	}

	public void setBalanco(double balanco) {
		this.balanco = balanco;
	}

	public void atualizarSaldo() {
		balanco += balanco*taxaJuro;
	}
	
}
