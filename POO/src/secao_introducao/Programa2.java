package secao_introducao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Produto;

public class Programa2 {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
			
		 
		 System.out.println("Entre com o nome do produto ");
		 String nome = sc.nextLine();
		 System.out.println("Entre com o preço do produto ");
		 double preco = sc.nextDouble();
		 System.out.println("Entre com a quantidade do produto ");
		 int quantidade = sc.nextInt();
		 
		 Produto produto = new Produto(nome, preco, quantidade);
		 
		 System.out.println();
		 System.out.println(produto );
		 
		 System.out.println();
		 System.out.println("entre com o numero de produtos a ser adicionado em estoque ");
		  quantidade = sc.nextInt();
		 produto.addProdutos(quantidade);

		 
		 System.out.println();
		 System.out.println("produto atualizado " + produto);
		 
		 System.out.println();
		 System.out.println("entre com o numero de produtos a ser removido em estoque ");
		 quantidade = sc.nextInt();
		 produto.removerProdutos(quantidade);
		 
		 System.out.println();
		 System.out.println("produto atualizado " + produto);
		 
		 sc.close();	
	}

}
