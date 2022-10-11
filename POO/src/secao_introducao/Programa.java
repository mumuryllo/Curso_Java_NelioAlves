package secao_introducao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Triangulo;

public class Programa {

	public static void main(String[] args) {
    Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
    Triangulo x, y;
    x = new Triangulo();
    y = new Triangulo();

	
	System.out.println("Entre com os lados X do triangulo ");
	x.a= sc.nextDouble();
	x.b= sc.nextDouble();
	x.c= sc.nextDouble();

	
	System.out.println("Entre com os lados Y do triangulo ");
	y.a= sc.nextDouble();
	y.b= sc.nextDouble();
	y.c= sc.nextDouble();
	
	double areaX = x.area();
	double areaY = y.area();
	
	System.out.println("Area do triangulo X"+ areaX);
	System.out.println("Area do triangulo y"+ areaY);
	
	if(areaX>areaY) {
		System.out.println("A area do triangulo X é maior");
	}else {
		System.out.println("A area do triangulo Y é maior");
	}

	}

}
