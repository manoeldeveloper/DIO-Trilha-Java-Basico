package org.java.desafio.dio.poo;

public class Musical {

	private String nome;

	
	
	@Override
	public String toString() {
		return "Musica: " + getNome();
	}

	protected Musical(String nome) {
		this.nome = nome;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	
}
