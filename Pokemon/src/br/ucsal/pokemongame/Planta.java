package br.ucsal.pokemongame;

import br.ucsal.pokemongame.player.Pokemon;

public class Planta extends Pokemon {
	
	

	public Planta(String nome, int vida) {
		super(nome, vida);
	}
	
	@Override
	public boolean esquivar() {
		 if(Math.random() > 0.5) {
			 this.vida++;
			 return true;
		 }
		return false;
	}

	@Override
	public void especial(Pokemon inimigo) {
		
	}

}
