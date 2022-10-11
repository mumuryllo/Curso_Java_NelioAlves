package Entidades;

public class ContaJuridica extends Conta{

     private double limite;

	public ContaJuridica(int numero, String nome, double depositoIncial, double limite) {
		super(numero, nome, depositoIncial);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
     
	public void emprestimo (double saque) {
		if(saque <= limite) {
			deposito(saque);	
		}
	}
	
}
