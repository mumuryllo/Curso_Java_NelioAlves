package estrutura_repeticao;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        
        boolean notaValida = false;
        
        do {
           
            System.out.println("Entre com uma nota");
        
            double nota = scan.nextDouble();

            if (nota >=0 && nota <= 10){
                notaValida = true;
                System.out.println("Voc� digitou: " + nota);
            } else {
                //notaValida = false;
                System.out.println("Nota inv�lida, digite novamente.");
            }
            
        } while (!notaValida);
        

	}

}
