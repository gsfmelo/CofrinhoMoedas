package empresa;

public class Euro extends Moeda {

	public Euro(double valor) {
		super(valor);
		
	}

	//Codigo de conversao de valores de moeda
	@Override
	public double converter() {
		return 5.40 * valor;
	}

	@Override
	public String getNome() {
		return "Euro";
	}
	

}
