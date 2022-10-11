package estrutura_condicional;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		  System.out.println(" Digite uma letra para saber se é vogal ou consoante");
		  String letra=sc.next();
		  
		  if(letra.length()>1) {
				 System.out.println(" Letra invalida! ");	  
				  }
		  if(   letra.equalsIgnoreCase("a") 
		     || letra.equalsIgnoreCase("e") 
		     || letra.equalsIgnoreCase("i") 
		     || letra.equalsIgnoreCase("o") 
		     || letra.equalsIgnoreCase("u") ) {
			  System.out.println(" Essa letra é uma vogal! ");
			
		  }else{
			  System.out.println(" Essa letra é uma consoante! ");
		  }
		  
		
		  // outra maneira
		  
		  switch(letra) {
		  case "a":
		  case "e":
		  case "i":
		  case "o":
		  case "u":  System.out.println(" Essa letra é uma vogal! ");
		  break;
		  default:   System.out.println(" Essa letra é uma consoante! ");
		  }
	      sc.close();
	}

}
