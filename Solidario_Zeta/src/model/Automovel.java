package model;

public class Automovel implements iRequisitavel {
	protected int id_automovel;
	protected String marca;
	protected String modelo;
	
	public Automovel(int id_automovel) {
		this.id_automovel = id_automovel;
	}
	
	public int getId() {
		return id_automovel;
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
