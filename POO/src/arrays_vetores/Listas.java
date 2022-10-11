package arrays_vetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Listas {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
	     
	      List<String> lista = new ArrayList<>();
	      
             //funções
	      
	        lista.add("Muryllo");
	        lista.add("Marli");
	        lista.add("Mattheus");
	        lista.add("Michell");
	        lista.add("Marriane");
	        
	        
	        lista.remove(0);
	        lista.remove("Mattheus");
	        
	        System.out.println(lista.size());
	        
	        for(String x: lista) {
	        	System.out.println(x);
	        }

		 sc.close();
	}

}
