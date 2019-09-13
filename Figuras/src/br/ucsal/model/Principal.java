package br.ucsal.model;

public class Principal {

	public static void main(String[] args) {

		Ponto p1 = new Ponto(5, 3);
		
		System.out.println(p1);
		
		Circulo c1 = new Circulo(3, 3, 3);
		System.out.println(c1);
		System.out.println("Area "+c1.area());
		System.out.println("Circunferencia "+c1.circunferencia());
		
		Circulo c2 = new Circulo(p1, 5);
		
		System.out.println(c2);
		System.out.println("Area "+c2.area());
		System.out.println("Circunferencia "+c2.circunferencia());
	}

}
