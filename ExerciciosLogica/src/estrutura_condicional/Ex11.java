package estrutura_condicional;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println(" Digite o seu salario");
          double salario=sc.nextDouble();
          
          int percentual = 0;
          
          if(salario<=280) {
        	  percentual=20;
          }else if(salario > 280 && salario<700) {
        	  percentual=15;
          }
          else if(salario >= 700 && salario<1500) {
        	  percentual=10;
          }
          else if(salario >=1500) {
        	  percentual=5;
          }
          
          double aumento=(salario/100)*percentual;
          double salarioAjustado= aumento+salario;
          
          System.out.println("Salario "+ salario);
          System.out.println("Percentual "+ percentual);
          System.out.println("Aumento "+ aumento);
          System.out.println("Salario ajustado "+ salarioAjustado);


          
          
	}

}
