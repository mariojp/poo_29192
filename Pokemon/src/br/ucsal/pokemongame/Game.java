package br.ucsal.pokemongame;

import br.ucsal.pokemongame.player.Pokemon;

public class Game {


	
	public String luta(Pokemon pokemon1, Pokemon pokemon2) {
		int rodadas = 0;
		while(pokemon1.getVida() > 0 && pokemon2.getVida() > 0) {
			if(rodadas % 3 == 0) {
				
				pokemon1.especial(pokemon2);
				pokemon2.especial(pokemon1);
			}else {
				pokemon1.atacar(pokemon2);
				pokemon2.atacar(pokemon1);
			}
		}
		String result = "";
		
		if( pokemon1.getVida() == pokemon2.getVida() ) {
			result = "Empate";
		}else if ( pokemon1.getVida() > 0 ){
			result = pokemon1.getNome()+" venceu";
		}else {
			result = pokemon2.getNome()+" venceu";
		}
		
		return result;
	}

}
