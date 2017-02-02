package model;

public class Utente extends Entidade {
	private int id_utente;
		
	public Utente(int id_utente, String nome, String morada, int nif, int niss, String contacto) {
		super(nome, morada, nif, niss, contacto);
		this.id_utente = id_utente;
	}

	public int getID() {
		return this.id_utente;
	}
	
}
