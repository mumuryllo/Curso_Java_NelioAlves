package try_catch;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
	     
		 
		 // Try executa o c?digo normalmente
		 try {
			 String [] vetor = sc.nextLine().split(" ");
			 int posicao =sc.nextInt();
			 System.out.println(vetor[posicao]);
		 }
		 // catch executa caso uma exce??o ocorra e deve ser tratada
	     catch (ArrayIndexOutOfBoundsException e){
	    	 System.out.println("Posi??o inv?lida ");
	     }
		 catch (InputMismatchException e){
	    	 System.out.println("Tipo de dado inv?lido ");
	     }
		 // finally executa o bloco independetemente se ocorreu uma exce??o ou n?o
		 finally {
			 System.out.println(" Programa executou! ");
		 }

         System.out.println("Fim do programa! ");
		 sc.close();
	}

}
