package br.ucsal.veiculos;

public class Principal {

	
	public static void main(String[] args) {

		
		Veiculo[] lista = new Veiculo[5];
		lista[0] = new Fusca();
		lista[1] = new FordKa();
		lista[2] = new FordKa();
		lista[3] = new FordKa();
		lista[4] = new Fusca();
		
		for (Veiculo veiculo : lista) {
			System.out.println(veiculo.acelerar());
		}

	}
	
	
	
	
}
