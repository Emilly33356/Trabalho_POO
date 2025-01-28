package Classe_abstrata;

public class Main {
	
	public static void main (String[]args) {
		
		Circulo c1 = new Circulo(9);
		c1.calcularArea();
		
		Retangulo r1 = new Retangulo(5 , 6);
		r1.calcularArea();	
	}
	
}
