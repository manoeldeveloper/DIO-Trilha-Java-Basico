package org.java.desafio.dio.poo;

public class Navegador {

	String exibirPagina, adicionarNovaAba, atualizarPagina;

	protected Navegador(String exibirPagina, String adicionarNovaAba, String atualizarPagina) {
		this.exibirPagina = exibirPagina;
		this.adicionarNovaAba = adicionarNovaAba;
		this.atualizarPagina = atualizarPagina;
	}

	protected String getExibirPagina() {
		return exibirPagina;
	}

	protected void setExibirPagina(String exibirPagina) {
		this.exibirPagina = exibirPagina;
	}

	protected String getAdicionarNovaAba() {
		return adicionarNovaAba;
	}

	protected void setAdicionarNovaAba(String adicionarNovaAba) {
		this.adicionarNovaAba = adicionarNovaAba;
	}

	protected String getAtualizarPagina() {
		return atualizarPagina;
	}

	protected void setAtualizarPagina(String atualizarPagina) {
		this.atualizarPagina = atualizarPagina;
	}
	
	
}
