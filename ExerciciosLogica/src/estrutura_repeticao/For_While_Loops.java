package estrutura_repeticao;

import java.util.Scanner;

public class For_While_Loops {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
//        int i=1;// count ou cont
//        int max=10;
//        
//        System.out.println("Contando até " + max);
//        
//        while(i<=max) {
//        	System.out.println("Valor de i " + i);
//        	i++;// mesma coisa que i+= 1 ou i= i+1;
//        }
        
        for(int i=0; i<5; i++) {
        	System.out.println(i);
        }
        
        sc.close();

	}

}
