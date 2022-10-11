package Entidades;

public class Triangulo {

       public double a;	
       public double b;	
       public double c;	
       
// nesse caso n tem parametro pois as variaveis a, b e c ja existem
	  public double area() {
		  double p = (a+b+c)/2.0;
		  double result =Math.sqrt(p*(p-a)*(p-b)*(p-c));
		  return result;
	  }
}
