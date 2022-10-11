package arrays_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
	     
		 System.out.println("Digite aqui o tamnho do Vetor: ");
		 int tamanho= sc.nextInt();
		 
		 // Aqui declaro o tamanho do meu vetor
		 int [] vetor = new int[tamanho];
		 
		 for(int i=0; i<tamanho; i++) {
			 System.out.println("Digite o número: ");
			 vetor[i] = sc.nextInt();
		 }
		 
		 System.out.println("Numeros negativos: ");
		 for(int i=0; i<tamanho; i++) {
			if(vetor[i]<0) {
				System.out.println(vetor[i]);
			}
		 }
		 

		 sc.close();
	}

}
