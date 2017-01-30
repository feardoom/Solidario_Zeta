package model;

import java.util.Date;
import tools.easyIO;

public class Requisicao {
	private easyIO io = new easyIO();
	
	private int id_requisicao;
	private iRequisitavel itemRequisitado;
	private Entidade requisitante;
	private Date dataRequisicao;
	private Date dataInicio;
	private Date dataFim;
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

	public Date getDataRequisicao() {
		return dataRequisicao;
	}

	public void setDataRequisicao(Date dataRequisicao) {
		this.dataRequisicao = dataRequisicao;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
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
