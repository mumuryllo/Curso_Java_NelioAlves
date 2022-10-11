package Heranca;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Conta;
import Entidades.ContaJuridica;
import Entidades.SalvarConta;

public class Programa {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
	     
		 Conta conta = new Conta(0, null, 0);
		 ContaJuridica contj = new ContaJuridica(0, null, 0, 0);
		 SalvarConta salvCont = new SalvarConta(0, null, 0, 0);
		 
		 
	   
		 sc.close();
	}

}
