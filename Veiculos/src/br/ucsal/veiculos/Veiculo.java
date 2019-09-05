package br.ucsal.veiculos;

public abstract class Veiculo {
	
	String cor;
	int potencia;
	int capacidade;
	
	public Veiculo() {
		cor = "Amarelo";
		potencia = 100;
	}
	
	public Veiculo(String cor) {
		this.cor = cor;
	}
	
	
	public abstract int acelerar();
	
	

}
