package metodosPOO;

public class Roupa {
	String marca;
	String tipo;
	String tamanho;
	int quantidade;
	double valor;
	
	public double valorEstoque() {
		double total = quantidade * valor;
		return total;
	}
	
	public void aumentarQuantidade(int valor) {
	    quantidade += valor;
	}

	public void diminuirQuantidade(int valor) {
		if (quantidade >= valor) {
			quantidade -= valor;
		}
	}

	public String toString() {
		return "Marca: " + marca +
				" | tipo: " + tipo +
				" | tamanho: " + tamanho +
				" | quantidade: " + quantidade +
				" | valor unitario: R$" + valor;
	}
	
	
}
