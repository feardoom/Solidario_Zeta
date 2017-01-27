package model;

import java.util.Date;

public class Requisicao {
	public int id_requisicao;
	protected iRequisitavel itemRequisitado;
	protected Utilizador requisitante;
	protected Date dataRequisicao;
	protected Date dataInicio;
	protected Date dataFim;
	protected String motivo;
	
	public Requisicao() {
		
	}
	
	protected boolean requisitar(iRequisitavel item, Utilizador requisitante) {
		
		return true;
	}
	
}
