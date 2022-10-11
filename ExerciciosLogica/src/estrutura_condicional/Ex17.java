package estrutura_condicional;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println(" Digite o ano para saber se é bissexto ou não ");
          int ano=sc.nextInt();
          
          if((ano %400 ==0) || (ano %4 ==0 && ano %100 !=0)) {
        	  System.out.println(" é Bissexto! ");
          }else {
        	  System.out.println("Não é Bissexto! ");
          }
	}

}
