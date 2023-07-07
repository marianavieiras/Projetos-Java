package fabrica;

public class Fiesta {
	private String fabrica;
	public Fiesta(String fabrica) {
		this.fabrica = fabrica;
	}
	
	public void exibirInfoSedan() {
		System.out.println("Modelo: Fiesta");
		System.out.println("Fabricado por: "+this.fabrica+"\n");
	}

}
