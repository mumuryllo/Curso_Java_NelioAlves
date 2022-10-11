package estrutura_condicional;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Entre com o 1 numero ");
         int num1= sc.nextInt();
         
         System.out.println("Entre com o 2 numero ");
         int num2= sc.nextInt();
         
         if(num1>num2) {
        	 System.out.println(num1 + " É maior que " + num2);
         }else {
        	 System.out.println(num2 + " É maior que " + num1);
         }
         
         sc.close();
	}

}