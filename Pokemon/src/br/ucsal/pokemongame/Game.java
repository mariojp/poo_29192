package br.ucsal.pokemongame;

public class Game {

	public static void main(String[] args) {

		Pokemon pikathu = new Pokemon();
		pikathu.nome = "Pikathu";
		pikathu.tipo = "eletrico";
		pikathu.vida = 70;
		
		Pokemon bulbasaur = new Pokemon();
		bulbasaur.nome = "Pikathu";
		bulbasaur.tipo = "eletrico";
		bulbasaur.vida = 70;
		
		while(pikathu.vida > 0 && bulbasaur.vida > 0) {
			pikathu.atacar(bulbasaur);
			bulbasaur.atacar(pikathu);
		}
		
		if( pikathu.vida == bulbasaur.vida ) {
			System.out.println("Draw");
		}else if ( pikathu.vida > 0 ){
			System.out.println("pkathu win");
		}else {
			System.out.println("bulbasaur win");
		}
		
		
		System.out.println(pikathu == bulbasaur);
		
		System.out.println(bulbasaur instanceof Pokemon);
		System.out.println(pikathu instanceof Pokemon);
			
			
		
		
	}

}
