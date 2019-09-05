package br.ucsal.pokemongame.player;

public abstract class Pokemon {
	
    String nome;
	
	protected int vida;
	
	private int limiteVIda;
	
	public abstract void especial(Pokemon inimigo);
	
	public Pokemon(String nome) {
		this(nome,70);
	}
	
	public Pokemon(String nome, int vida) {
		this.nome = nome;
		this.vida = vida;
		this.limiteVIda = this.vida;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		
		this.vida = vida;
	}

	
	
	public boolean esquivar() {
		return Math.random() > 0.5; 
	}
	
	public void atacar(Pokemon inimigo) {
		if(!inimigo.esquivar()) {
			inimigo.vida--; // inimigo.vida = inimigo.vida -1;
		}
	}
	
	

}
