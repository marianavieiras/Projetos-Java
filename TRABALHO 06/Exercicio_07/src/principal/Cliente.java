package principal;

public class Cliente {
	private InterSomadorEsperado soma;
	private Cliente(InterSomadorEsperado soma) {
		this.soma = soma;
	}
	public Cliente () {
		
	}
	
	public void executar() {
		int[] vetor = new int[] {1, 2,3, 4, 5, 6, 7, 8, 9, 10};
		SomadorExistente somaExistente = new SomadorExistente();
		Adaptador adaptador = new Adaptador(somaExistente);
		int soma = adaptador.somaVetor(vetor);
		System.out.println("Resultado: "+soma);
	}
}
