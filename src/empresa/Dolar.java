package empresa;

public class Dolar extends Moeda {

	public Dolar(double valor) {
		super(valor);
		
	}

	//Codigo de conversao de valores de moeda
	@Override
	public double converter() {
		return 5 * valor;
	}
	
	//Codigo que retorna o nome da moeda
	
	@Override
	public String getNome() {
		return "Dolar";
	}

}
