package fabrica;

public class Siena {
	private String fabrica;
	public Siena(String fabrica) {
		this.fabrica = fabrica;
	}
	
	public void exibirInfoSedan() {
		System.out.println("Modelo: Siena");
		System.out.println("Fabricado por: "+this.fabrica+"\n");
	}

}
