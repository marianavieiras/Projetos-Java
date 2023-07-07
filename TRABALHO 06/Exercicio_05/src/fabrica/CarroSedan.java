package fabrica;

public class CarroSedan {
	private String carro;
	private Siena carro_Siena;
	private FiestaSedan carro_FiestaSedan;
	
	public CarroSedan(String carro, String fabrica) {
		this.carro = carro;
		if(carro.equals("Siena")) {
			carro_Siena = new Siena(fabrica);
		} else if(carro.equals("Fiesta Sedan")) {
			carro_FiestaSedan = new FiestaSedan();
		}
	}
	
	public void exibirInfoSedan() {
		if(carro.equals("Siena")) {			
			carro_Siena.exibirInfoSedan();
		} else if(carro.equals("Fiesta Sedan")) {
			carro_FiestaSedan.exibirInfoSedan();
		}
	}

}
