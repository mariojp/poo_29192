package br.ucsal.pokemongame;

public class Pokemon {
	
	String nome;
	String tipo;
	int vida;
	
	
	boolean esquivar() {
		return Math.random() > 0.5; 
	}
	
	void atacar(Pokemon inimigo) {
		if(!inimigo.esquivar()) {
			inimigo.vida--; // inimigo.vida = inimigo.vida -1;
			
		}
	}
	
	

}
