package secao_introducao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Conta;

public class Programa3 {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 Conta conta;
		 
		 System.out.println("Entre com o número da conta: ");
		 int numero= sc.nextInt();
		 
		 System.out.println("Entre com o nome do títular da conta: ");
		 sc.nextLine();
		 String titular= sc.nextLine();
		 
		 System.out.println("Deseja entrar com um depósito incial? (s/n): ");
		 char resposta = sc.nextLine().charAt(0);
		 
		 if(resposta == 's') {
			 System.out.println("Entre com o valor incial do depósito: ");
			 double DepositoInicial= sc.nextDouble();
			 conta = new Conta(numero, titular, DepositoInicial);
		 }else {
			 conta = new Conta(numero, titular); 
		 }
		 
		 System.out.println();
		 System.out.println("Conta: ");
		 System.out.println(conta);
          
		 
		 System.out.println();
		 System.out.println("Entre com o valor do depósito: ");
		 double depositoInicial= sc.nextDouble();
		 conta.deposito(depositoInicial);
		 System.out.println("Conta atualizada: ");
		 System.out.println(conta);
		 
		 System.out.println();
		 System.out.println("Entre com o valor do saque: ");
		 double saque= sc.nextDouble();
		 conta.saque(saque);
		 System.out.println("Conta atualizada: ");
		 System.out.println(conta);
		 
		 sc.close();
	}

}
