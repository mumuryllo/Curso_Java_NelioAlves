package estrutura_condicional;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
		  
		  System.out.println(" Digite em que turno você esta (V)- vespertino, (N)- noturno, (M)-matutino");
		  String turno=sc.next();
		  
		  if(turno.length()>1) {
			  System.out.println("Digite novamente!");
		  }
		  
		  
		  if(turno.equalsIgnoreCase("v") ) {
			  System.out.println(" Vespertino ");
		  }else if(turno.equalsIgnoreCase("n")){
			  System.out.println(" Noturno ");
		  }else if(turno.equalsIgnoreCase("m")){
			  System.out.println("Matutino");
		  }else {
			  System.out.println("Turno inválido!");
		  }
		  
		  //equalsIgnoreCase ignora se a letra é maiuscula ou minuscula
	      sc.close();
	}

}
