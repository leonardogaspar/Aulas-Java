package estruturado;

public class ContaMesEstruturada {
	public static void main(String[] args) {
		double janAlimentos = 1000;
		double janEnergia = 300;
		double janAgua = 300;
 
		double fevAlimentos = 1000;
		double fevEnergia = 300;
		double fevAgua = 300;
	
		double janGasto = janAgua + janAlimentos + janEnergia; 
		double fevGasto = fevAgua + fevAlimentos + fevEnergia;
	
		if (janGasto > fevGasto) {
			System.out.println("O mês de janeiro teve mais gastos que o mês de fevereiro.");
		} else if (fevGasto > fevGasto){
			System.out.println("O mês de fevereiro teve mais gastos que o mês de janeiro.");
		} else {
			System.out.println("Os meses tiveram gastos equivalentes.");
		}
	}
}