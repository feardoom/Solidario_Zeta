package model;

public class Sala implements iRequisitavel {
	protected int id_sala;
	protected String numero;
	protected String funcao;
	protected int lotacao;
		
	
	public Sala(String numero, String funcao, int lotacao) {
		super();
		this.numero = numero;
		this.funcao = funcao;
		this.lotacao = lotacao;
	}

	public int getId() {
		return id_sala;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getFuncao() {
		return funcao;
	}
	
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public int getLotacao() {
		return lotacao;
	}
	
	public void setLotacao(int lotacao) {
		this.lotacao = lotacao;
	}
	
	
	
	
}
