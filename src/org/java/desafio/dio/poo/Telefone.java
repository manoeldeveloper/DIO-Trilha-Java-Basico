package org.java.desafio.dio.poo;

public class Telefone {
	
	private int ligar, atender, correioVoz;
	private int contato;
	
	
	



	protected Telefone(int contato, int ligar, int atender, int correioVoz) {
		super();
		this.ligar = ligar;
		this.atender = atender;
		this.correioVoz = correioVoz;
		this.contato = contato;
	}






	protected int getLigar() {
		return ligar;
	}






	protected void setLigar(int ligar) {
		this.ligar = ligar;
	}






	protected int getAtender() {
		return atender;
	}






	protected void setAtender(int atender) {
		this.atender = atender;
	}






	protected int getCorreioVoz() {
		return correioVoz;
	}






	protected void setCorreioVoz(int correioVoz) {
		this.correioVoz = correioVoz;
	}






	protected double getContato() {
		return contato;
	}






	protected void setContato(int contato) {
		this.contato = contato;
	}






	@Override
	public String toString() {
		return "Número: " + getContato() + ", Ligações feitas: " + getLigar() + ", Ligações Recebidas: " + getAtender();
	}

	
	

}
