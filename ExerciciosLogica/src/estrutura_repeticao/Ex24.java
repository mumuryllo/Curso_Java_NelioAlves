package estrutura_repeticao;
import java.util.Scanner;


public class Ex24 {

	public static void main(String[] args) {
		   
        System.out.println("Pre?o do p?o: R$ 0.18");
        System.out.println("Panificadora P?o de Ontem - Tabela de pre?os");
        
        for (int i=1; i<=50; i++){
            System.out.println(i + " - R$ " + (0.18*i));
        }
	}

}
