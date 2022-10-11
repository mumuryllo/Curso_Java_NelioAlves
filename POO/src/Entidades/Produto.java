package Entidades;

public class Produto {

	//this referencia o objeto e n o parametro
	
	
	private String nome;
	private double preco;
	private int quantidade;
	
	
	
	// Construtores serve para imperdir de iniciar dados vazios
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	
	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



	public int getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}



	public double valorTotalEstoque() {
		return preco*quantidade;
	}
	
	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	// void quando o metodo n retorna nada
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	// ToString s� imprimi aquilo que vc quer
	@Override
	public String toString() {
		return "Produto nome=" 
	              + nome +    ", preco=" 
				+ preco + ", quantidade=" 
	          + quantidade + "" +
				" Total "+
	          valorTotalEstoque();
	}
	
	
}
