package model;

public class Item implements iRequisitavel {
	private int id_item;
	private String nome;
	private String tipoQuantidade;
	private int quantidade;
	
	public Item(String nome, String tipoQuantidade, int quantidade) {
		super();
		this.nome = nome;
		this.tipoQuantidade = tipoQuantidade;
		this.quantidade = quantidade;
	}

	public int getId() {
		return id_item;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipoQuantidade() {
		return tipoQuantidade;
	}
	
	public void setTipoQuantidade(String tipoQuantidade) {
		this.tipoQuantidade = tipoQuantidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
