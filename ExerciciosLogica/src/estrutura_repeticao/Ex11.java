package estrutura_repeticao;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Entre com o primeiro n�mero");
	        int num1 = scan.nextInt();
	        
	        System.out.println("Entre com o segundo n�mero");
	        int num2 = scan.nextInt();
	        
	        int soma = 0;
	        
	        for (int i=num1; i<=num2; i++){
	            soma += i;
	        }
	        
	        System.out.println("Soma: " + soma);
	}

}
