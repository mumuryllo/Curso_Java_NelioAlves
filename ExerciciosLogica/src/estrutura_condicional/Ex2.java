package estrutura_condicional;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println(" Digite um n�mero para saber se � positivo ou negativo ");
		  int num = sc.nextInt();
		  
		  if(num >0) {
			  System.out.println(" Esse n�mero � POSITIVO! ");
		  }else if(num ==0){
			  System.out.println(" Esse n�mero � NULO! ");
		  }else {
			  System.out.println(" Esse n�mero � NEGATIVO! ");
		  }
		  
	         sc.close();

	}

}
