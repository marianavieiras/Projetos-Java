package fabrica;

public class FabricaDeCarro {
	public CarroSedan criarCarroSedan(String carro) {
		return new CarroSedan(carro, " ");
	}
	public CarroPopular criarCarroPopular(String carro) {
		return new CarroPopular(carro, " ");
	}
	
	

}
