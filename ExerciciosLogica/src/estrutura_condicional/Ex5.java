package estrutura_condicional;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
           
		  System.out.println(" Digite a primeira nota ");
          double nota1=sc.nextDouble();
		  
		  System.out.println(" Digite a segunda nota");
          double nota2=sc.nextDouble();
          
          double media= (nota1+nota2)/2;
          
           if(media ==10.0) {
       	   System.out.println("Aprovado com honra!");
       	   System.out.println("nota" + media);
          }

           if(media >=7) {
        	   System.out.println("Aprovado");
        	   System.out.println("nota" + media);
           }else {
        	   System.out.println("Reprovado");
        	   System.out.println("nota" + media);
           }
           
          
		 sc.close();
	}

}
