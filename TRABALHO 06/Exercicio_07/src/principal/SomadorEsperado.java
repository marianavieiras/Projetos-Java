package principal;

public class SomadorEsperado implements InterSomadorEsperado{
	
	public int somaVetor(int[] vetor) {
		int resultado = 0;
		for (int i = 0; i < vetor.length; i++) {
			resultado = resultado + vetor[i];
		}
		
		return resultado;
	}
}
