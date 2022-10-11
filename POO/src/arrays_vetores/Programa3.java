package arrays_vetores;

import java.util.Locale;
import java.util.Scanner;



public class Programa3 {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
	     
		 System.out.println("Digite o numero de pessoas a ser cadastradas : ");
		 int tamanho= sc.nextInt();
		 
		 // Aqui declaro o tamanho do meu vetor
		 String [] nome = new String[tamanho];
		 int [] idade = new int[tamanho];
		 double [] altura = new double[tamanho];

		   
		 for(int i=0; i<tamanho; i++) {
			 System.out.println("Dados da " + (i+1) + "Pessoa : ");
			 System.out.print("Nome : ");
			 nome[i]=sc.next();
			 System.out.print( "Idade : ");
			 idade[i]=sc.nextInt();
			 System.out.print("Altura : ");
			 altura[i] = sc.nextDouble();			
		 }
		 
		 double soma=0.0;
		 for(int i=0; i<tamanho; i++) {
			 soma += altura[i];
		 }
		 double media = soma/tamanho;
		 System.out.println("Altura m�dia das pessoas cadastradas : " + media);
		 
		 
		 int contador=0;
		 for(int i=0; i<tamanho; i++) {
		  if(idade[i]<16) {
			  contador += 1;
		  }		
		 }
		 
		
		 
		 double porcentagem  = contador*100.0/tamanho;
		 System.out.println("Pessoas com menos de 16 anos " + porcentagem + "%");
		 
		 for(int i=0; i<tamanho; i++) {
			  if(idade[i]<16) {
				 System.out.println(nome[i]);
			  }		
		 
		  
		 sc.close();
	}
	}
}
