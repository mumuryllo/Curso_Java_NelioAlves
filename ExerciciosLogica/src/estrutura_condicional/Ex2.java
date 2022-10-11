package estrutura_condicional;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println(" Digite um número para saber se é positivo ou negativo ");
		  int num = sc.nextInt();
		  
		  if(num >0) {
			  System.out.println(" Esse número é POSITIVO! ");
		  }else if(num ==0){
			  System.out.println(" Esse número é NULO! ");
		  }else {
			  System.out.println(" Esse número é NEGATIVO! ");
		  }
		  
	         sc.close();

	}

}
