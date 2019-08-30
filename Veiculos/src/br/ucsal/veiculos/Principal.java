package br.ucsal.veiculos;

public class Principal {

	
	public static void main(String[] args) {
		Veiculo carro;
		if(args.length == 1) {
			 carro = new Veiculo(args[0]);
		}else {
			carro = new Veiculo();
		}
		
		System.out.println(carro.cor);

	}
	
	
	
	
}
