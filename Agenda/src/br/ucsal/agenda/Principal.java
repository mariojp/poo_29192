package br.ucsal.agenda;

public class Principal {

	public static void main(String[] args) {

		Agenda agenda = new Agenda();
		
		Contato c1 = new Contato("Pedro","7777-7777");
		agenda.addContato(c1);
		
		Contato c2 = new Contato("Joa","8888");
		c2.setNome("Joao");
		c2.setTelefone("8888-8888");

		agenda.addContato(c2);
		
		Contato c3 = agenda.busca("Pedro");
		System.out.println(c3.getTelefone());
		
		
		
		
		
	}
}


