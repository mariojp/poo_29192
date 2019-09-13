package br.ucsal.model;

public class Circulo {

	private Ponto origem;
	private int raio;
	
	
	public Circulo(Ponto ponto, int raio) {
		this.origem = ponto;
		this.raio = raio;
	}
	
	public Circulo(int x, int y, int raio) {
		this(new Ponto(x, y),raio);
		//this.origem = new Ponto(x, y);
		//this.raio = raio;
	}
	
	
	public double area() {
		return Math.PI* Math.pow(raio, 2);
	}
	
	public double circunferencia() {
		return Math.PI * raio * 2;
	}
	
	@Override
	public String toString() {
		return "Circulo ( raio="+this.raio+" "+this.origem.toString()+" )";
	}
	
	
	
	
	
	
}
