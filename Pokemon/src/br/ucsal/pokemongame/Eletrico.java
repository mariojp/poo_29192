package br.ucsal.pokemongame;

import br.ucsal.pokemongame.player.Pokemon;

public class Eletrico extends Pokemon{
	
	
	public Eletrico(String nome) {
		super(nome);
	}
	
	
	@Override
	public
	void atacar(Pokemon inimigo) {
		if(Math.random()>0.5) {
			super.atacar(inimigo);
		}
		super.atacar(inimigo);
	}


	@Override
	public void especial(Pokemon inimigo) {
		inimigo.setVida(inimigo.getVida()-3);
	}

}
