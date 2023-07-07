package fabrica;

public class FabricaFiat extends FabricaDeCarro {
	@Override
	public CarroSedan criarCarroSedan (String carro) {
		if(carro.equals("Siena")) {
			return new CarroSedan (carro, "Fiat");
		} else {			
			System.out.println("Carro inexistente.");
		}
		
		return new CarroSedan(" ", " ");
	}

}
