package empresa;

import java.util.Objects;

public abstract class Moeda {

	double valor;

	public Moeda(double valor) {
		super();
		this.valor = valor;
	}
	
	//Recebe nome e converte as moedas
	public abstract String getNome();
	public abstract double converter();

	//Codigo para imprimir os valores das moedas na listagem
	@Override
	public String toString() {
		return getNome() + ": "+ valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Moeda outraMoeda = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(outraMoeda.valor);
	}
	
	
	
}
