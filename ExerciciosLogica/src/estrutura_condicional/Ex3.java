package estrutura_condicional;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println(" Digite o seu genero (F)-FEMININO (M)-MASCULINO");

		  String genero=sc.next();
		  
		  if(genero.equalsIgnoreCase("f") ) {
			  System.out.println(" Sexo FEMININO! ");
		  }else if(genero.equalsIgnoreCase("m")){
			  System.out.println(" Sexo MASCULINO! ");
		  }else {
			  System.out.println(" Sexo invalido! ");
		  }
		  
		  //equalsIgnoreCase ignora se a letra é maiuscula ou minuscula
	      sc.close();

	}

}
