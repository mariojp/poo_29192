package br.ucsal.agenda;

public class Agenda {
	
	private Contato[] contatos = new Contato[10];
	
	void addContato(Contato contato) {
		int indice =0 ;
		while (contatos[indice] != null ) indice++;
		contatos[indice] = contato;
	}
	
	Contato busca(String nome) {
		for (int i = 0; (i < contatos.length && contatos[i] != null); i++) {
			if(contatos[i].getNome().equals(nome))
				return contatos[i]; 
		}
		return null;
	}

}
