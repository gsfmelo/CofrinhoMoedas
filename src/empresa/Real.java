package empresa;

public class Real extends Moeda{

	public Real(double valor) {
		super(valor);
		
	}

	//Codigo de conversao de valores de moeda, apesar de nao necessario para real.
	@Override
	public double converter() {
		return valor;
	}

	//Codigo que retorna o nome da moeda
	@Override
	public String getNome() {
		return "Real";
	}
	
	

}
