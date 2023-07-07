package principal;

import java.util.ArrayList;
import java.util.List;

public class Adaptador extends SomadorEsperado {
	private SomadorExistente obj;
	
	public Adaptador(SomadorExistente obj) {
		this.obj = obj;
	}
	
	public int somaVetor (int[] vetor) {
		List<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < vetor.length; i++) {
			lista.add(vetor[i]);
		}
		return obj.somaLista(lista);
	}
}