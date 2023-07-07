package fabrica;

public class FabricaFord extends FabricaDeCarro {
	@Override
	public CarroPopular criarCarroPopular (String carro) {
		if(carro.equals("Fiesta")) {
			return new CarroPopular(carro, "Ford");
		} else {			
			System.out.println("Carro inexistente.");
		}
		
		return new CarroPopular(" ", " ");
	}
}
