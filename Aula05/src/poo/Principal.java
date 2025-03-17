package poo;

public class Principal {

	public static void main(String[] args) {
		Conta jan = new Conta ();
		Conta fev = new Conta();
		
		jan.agua = 190;
		jan.alimentacao = 1020;
		jan.luz = 110;
		
		
		fev.agua = 260;
		fev.alimentacao = 854;
		fev.luz = 310;
		
		double gastoJan = jan.total();
		double gastoFev = fev.total();
		
		if (gastoJan > gastoFev) {
			System.out.println("O mês de janeiro teve mais gastos que o mês de fevereiro.");
		} else if (gastoFev > gastoJan){
			System.out.println("O mês de fevereiro teve mais gastos que o mês de janeiro.");
		} else {
			System.out.println("Os meses tiveram gastos equivalentes.");
		}
	}

}
