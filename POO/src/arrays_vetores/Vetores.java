package arrays_vetores;

import java.util.Locale;
import java.util.Scanner;


public class Vetores {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
	     
		 int tamanho= sc.nextInt();
		 
		 // Aqui declaro o tamanho do meu vetor
		 double [] vetor = new double[tamanho];
		 
		 for(int i=0; i<tamanho; i++) {
			 vetor[i] = sc.nextDouble();
		 }
		 
		 double soma=0.0;
		 for(int i=0; i<tamanho; i++) {
			 soma += vetor[i];
		 }
		 double media = soma/tamanho;
		 System.out.println(media);
		 sc.close();
	}

}
