package estrutura_condicional;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	         
	         System.out.println("Entre com o 1 numero ");
	         int num1= sc.nextInt();
	         
	         System.out.println("Entre com o 2 numero ");
	         int num2= sc.nextInt();
	         
	         System.out.println("Entre com o 3 numero ");
	         int num3= sc.nextInt();
	         
	         if(num1<=num2 && num1<=num3 && num2<=num3) {
	        	 System.out.println(num3 + "-" + num2 + "-" + num1 );
	         }else if(num1<=num2 && num1<=num3 && num3<=num2) {
	        	 System.out.println(num2 + "-" + num3 +  "-"+ num1 );
	         }else if(num2<=num1 && num1<=num2 && num1<=num2) {
	        	 System.out.println(num1  + "-" + num3  +  "-" + num2  );
	         }else if(num3<=num1 && num3<=num2 && num1<=num2) {
	        	 System.out.println(num2  + "-" + num1  +  "-" + num3  );
	         }else if(num3<=num1 && num3<=num2 && num2<=num1) {
	        	 System.out.println(num1  + "-" + num2  +  "-" + num3  );
	         }
	         
	         
	         
	         sc.close();

	}

}
