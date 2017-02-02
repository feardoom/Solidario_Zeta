package controller;
import model.*;

public class Main {

	public static void main(String[] args) {
		
		Entidade mecena = new Entidade("Luis", "Rua A", 201236595, 917423568, "rr@ss.pt");
		
		String atributos [] = {"Marca", "Tamanho"};
		String caracteristicas [] = {"Nike", "40"};
		
		
		Donativo donation = new Donativo(mecena, "24/02/2017", atributos, caracteristicas, "Calçado", "Bom estado");
		donation.doar();
		
	}

}
