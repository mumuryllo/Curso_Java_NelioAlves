package arrays_vetores;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Pensao;

public class Programa4 {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
	     
		 // Só tem até 10 quartos
		 Pensao[] pensionistas = new Pensao[10];
		 
		 System.out.println("Quantos quartos deseja alugar? ");
		 int n= sc.nextInt();
		 
		 for (int i =1; i<=n; i++) {
			 System.out.println("Quarto #" +i + ": ");
			 
			 System.out.println("Nome: ");
			 sc.nextLine();
			 String nome = sc.nextLine();
 
			 System.out.println("Email:");
             String email = sc.next();
             
             System.out.println("Quarto :");
             int numeroQuarto = sc.nextInt();
             pensionistas[numeroQuarto]= new Pensao(nome, email);
             
		 }
		 
		 System.out.println();
         System.out.println("Quartos alugados :");
		 for (int i =0; i<10; i++) {
			 if(pensionistas[i] != null) {
				 System.out.println(i + " : " + pensionistas[i]);     
			 }
		 }
		 

		 sc.close();
	}
	}


