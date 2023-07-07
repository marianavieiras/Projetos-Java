package fabrica;

public class Cliente {
	public static void main(String[] args) {
		try {			
			FabricaFiat fiat = new FabricaFiat();
			CarroSedan sedan_fiat = fiat.criarCarroSedan("Siena");
			sedan_fiat.exibirInfoSedan();
			
			CarroPopular popular_fiat = fiat.criarCarroPopular("Palio");
			popular_fiat.exibirInfoPopular();
			
			
			FabricaFord fabrica = new FabricaFord();
			CarroSedan sedan_ford = fabrica.criarCarroSedan("Fiesta Sedan");
			sedan_ford.exibirInfoSedan();
			
			CarroPopular popular_ford = fabrica.criarCarroPopular("Fiesta");
			popular_ford.exibirInfoPopular();
		} catch(Exception e) {
			System.out.println("Erro inesperado");
		}
	}
}
