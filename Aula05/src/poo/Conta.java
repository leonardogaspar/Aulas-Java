package poo;

public class Conta {
	double agua;
	double alimentacao;
	double luz;
	double somaConta;
	
	public double total() {
		somaConta = agua + alimentacao + luz;
		return somaConta;
	}
	
	public void exibirInfo() {
		System.out.println(somaConta);
	}
}
