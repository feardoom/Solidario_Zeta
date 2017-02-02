package model;

public class Donativo {
	protected int id_donativo;
	protected Entidade mecena;
	protected String data;
	protected String [] atributos;
	protected String [] caracteristicas;
	protected String designacao;
	protected String descricao;
	
	public Donativo(Entidade mecena, String data, String [] atributos, String [] caracteristicas, String designacao, String descricao) {
		super();
		this.mecena = mecena;
		this.data = data;
		this.atributos = atributos;
		this.caracteristicas = caracteristicas;
		this.designacao = designacao;
		this.descricao = descricao;
	}

	public int getId() {
		return id_donativo;
	}

	public Entidade getMecena() {
		return mecena;
	}

	public void setMecena(Entidade mecena) {
		this.mecena = mecena;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String [] getAtributos() {
		return atributos;
	}

	public void setAtributos(String [] atributos) {
		this.atributos = atributos;
	}

	public String [] getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String [] caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public String getDesignacao() {
		return designacao;
	}

	public void setDesignacao(String designacao) {
		this.designacao = designacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public boolean doar() {
		
		return true;
	}
	
	
	
	
}
