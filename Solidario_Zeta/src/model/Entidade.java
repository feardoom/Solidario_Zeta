package model;

public class Entidade {
	protected String nome;
	protected String morada;
	protected int nif;
	protected int niss;
	protected String contacto;
		
	public Entidade(String nome, String morada, int nif, int niss, String contacto) {
		this.nome = nome;
		this.morada = morada;
		this.nif = nif;
		this.niss = niss;
		this.contacto = contacto;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMorada() {
		return morada;
	}
	
	public void setMorada(String morada) {
		this.morada = morada;
	}
	
	public int getNif() {
		return nif;
	}
	
	public void setNif(int nif) {
		this.nif = nif;
	}
	
	public int getNiss() {
		return niss;
	}
	
	public void setNiss(int niss) {
		this.niss = niss;
	}
	
	public String getContacto() {
		return contacto;
	}
	
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
	
	
}
