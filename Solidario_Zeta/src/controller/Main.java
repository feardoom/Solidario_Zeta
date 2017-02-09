package controller;
import model.*;

public class Main {

	public static void main(String[] args) {
		
		Entidade mecena = new Entidade("Luis", "Rua A", 201236595, 917423568, "rr@ss.pt");
		
		String atributos [] = {"Marca", "Tamanho"};
		String caracteristicas [] = {"Nike", "40"};
		
		Donativo donation = new Donativo(mecena, "24/02/2017", atributos, caracteristicas, "Calçado", "Bom estado");
		donation.doar();
		
		
		Entidade requisitante = new Utente(59, "Utente1", "Rua C", 222232215, 936587421, "aa@as.ipss.pt");
		Requisicao requisicao = new Requisicao();
		Item requisitavel = new Item(68);
		
		requisicao.setRequisitante(requisitante);
		requisicao.setItemRequisitado(requisitavel);
		requisicao.setDataRequisicao("24/02/2010");
		requisicao.setDataInicio("24/02/2017");
		requisicao.setDataFim("25/02/2017");
		requisicao.setMotivo("Preciso de botas");
		
		requisicao.requisitar();
		
	}

}
