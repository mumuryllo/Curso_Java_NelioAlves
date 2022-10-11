package estrutura_repeticao;
import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Entre com o n�mero para gerar a tabuada:");
	        int num = scan.nextInt();
	        
	        boolean invalido = true;
	        int numFinal, numInicio;
	        
	        do {
	            
	            System.out.println("Entre com o in�cio da tabuada");
	            numInicio = scan.nextInt();

	            System.out.println("Entre como final da tabuada");
	            numFinal = scan.nextInt();

	            if (numFinal > numInicio){
	                invalido = false;
	            }
	            
	        } while (invalido);
	        
	        
	        System.out.println("Tabuada de " + num + ":");
	        System.out.println("Come�ar por: " + numInicio);
	        System.out.println("Terminar em: " + numFinal);
	        System.out.println();
	        
	        for (int i=numInicio; i<=numFinal; i++){
	            System.out.println(num + " x " + i + " = " + (num*i));
	        }
	}

}
