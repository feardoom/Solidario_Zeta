package model;

public class Utente extends Entidade {
	private int id_utente;
		
	public Utente(String nome, String morada, int nif, int niss, String contacto) {
		super(nome, morada, nif, niss, contacto);
	}

	public int getID() {
		return this.id_utente;
	}
	
}
