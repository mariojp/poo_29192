package br.ucsal.pokemongame;

import br.ucsal.pokemongame.player.Pokemon;

public class Principal {

	
	public static void main(String[] args) {

		Pokemon pikathu = new Eletrico("Pikathu");
		
		Pokemon bulbasaur = new Planta("Bulbasaur",30);
		
		System.out.println(new Game().luta(pikathu, bulbasaur));
	
			
	}
	
}
