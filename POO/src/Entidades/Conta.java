package Entidades;

public class Conta {
	
	private int numero;
	private String nome;
	private double balanco;
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public Conta(int numero, String nome, double depositoIncial) {
		this.numero = numero;
		this.nome = nome;
		deposito(depositoIncial);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getBalanco() {
		return balanco;
	}

	public void deposito (double amount) {
		balanco +=amount;
	};
	
	public void saque (double amount) {
		balanco -=amount +5.0;
	};
	
    public String toString() {
    	return "Conta"
    			+ numero
    			+ ", Titular: "
    			+ nome
    			+ ", Balanço: R$ "
    			+ String.format("%.2f", balanco);
    }
}
