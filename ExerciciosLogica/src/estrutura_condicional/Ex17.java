package estrutura_condicional;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println(" Digite o ano para saber se � bissexto ou n�o ");
          int ano=sc.nextInt();
          
          if((ano %400 ==0) || (ano %4 ==0 && ano %100 !=0)) {
        	  System.out.println(" � Bissexto! ");
          }else {
        	  System.out.println("N�o � Bissexto! ");
          }
	}

}
