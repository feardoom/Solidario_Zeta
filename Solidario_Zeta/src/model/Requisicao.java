package model;

import tools.easyIO;

public class Requisicao {
	private easyIO io = new easyIO();
	
	private int id_requisicao;
	private iRequisitavel itemRequisitado;
	private Entidade requisitante;
	private String dataRequisicao;
	private String dataInicio;
	private String dataFim;
	private String motivo;
	
	public Requisicao() {
		
	}
	
	public int getId() {
		return id_requisicao;
	}

	public iRequisitavel getItemRequisitado() {
		return itemRequisitado;
	}

	public void setItemRequisitado(iRequisitavel itemRequisitado) {
		this.itemRequisitado = itemRequisitado;
	}

	public Entidade getRequisitante() {
		return requisitante;
	}

	public void setRequisitante(Entidade requisitante) {
		this.requisitante = requisitante;
	}

	public String getDataRequisicao() {
		return dataRequisicao;
	}

	public void setDataRequisicao(String dataRequisicao) {
		this.dataRequisicao = dataRequisicao;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	

	protected boolean requisitar(iRequisitavel item, Entidade requisitante) {
		
		return true;
	}
	
}
