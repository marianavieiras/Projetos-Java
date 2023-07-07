package principal;

import java.util.HashSet;
import java.util.Set;

public class Nomes {
	private Set<String> nomes = new HashSet<> ();
	
	// lê uma serie de nomes
	public void addNome (String nome) {
		nomes.add(nome);
	}
	
	//remover um determinado nome
	public void removeNome (String nome) {
		if (nomes.contains(nome)) {
		nomes.remove(nome);
		System.out.println ("Nome removido");
		} else {
		System.out.println ("O nome não contém na lista");
		}
	}
	
	//verificar se um determinado nome j´a foi armazenado
	public boolean verificarNome (String nome) {
		if (nomes.contains(nome)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void removeTodos () {
		nomes.clear();
	}
	}