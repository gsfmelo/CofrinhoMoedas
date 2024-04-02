package empresa;

import java.util.ArrayList;

public class Cofrinho {

	//Codigo para listagem das moedas
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	//Codigo para adicionar moedas na listagem
	public void adicionar(Moeda m) {
		listaMoedas.add(m);
	}
	
	//Codigo para remover moedas da listagem
	public void remover(Moeda m) {
		listaMoedas.remove(m);
	}
	
	//Codigo mostrar listagem das moedas
	public void listagemMoedas() {
		System.out.println("Moedas:");
		for (int i = 0; i < listaMoedas.size(); i++) {
			System.out.println(listaMoedas.get(i));
		}
	}
	
	//Codigo para fazer conversao de  moedas
	public double totalConvertido() {
		double total = 0;
		for (Moeda m : listaMoedas) {
			total += m.converter();
		}
		return total;
	}
	
}

	