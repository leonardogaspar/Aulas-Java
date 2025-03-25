package entidade;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Carro civic = new Carro();
		civic.fabricante = "Honda";
		civic.modelo = "Civic 8";
		civic.ano = 2008;
		civic.cor = "Prata";
		civic.placa = "83KHH6";
		civic.exibirInfo();
		
		Carro kicks = new Carro();
		kicks.fabricante = "Nissan";
		kicks.modelo = "Kicks SV";
		kicks.ano = 2024;
		kicks.cor = "Vermelho";
		kicks.placa = "33K9HB";
		kicks.exibirInfo();
		
		Carro strada = new Carro();
		strada.fabricante = "Fiat";
		strada.modelo = "Strada Vulcan";
		strada.ano = 2023;
		strada.cor = "Branco";
		strada.placa = "09FD7M";
		strada.exibirInfo();
		
	}

}
