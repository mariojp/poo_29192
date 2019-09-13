package br.ucsal.model;

public class Ponto {
	
	private int x;
	private int y;
	
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		return "Ponto( x="+this.x+" y="+this.y+" )";
	}

}
