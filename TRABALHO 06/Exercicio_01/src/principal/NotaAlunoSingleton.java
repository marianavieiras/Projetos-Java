package principal;

public class NotaAlunoSingleton {

	private static NotaAlunoSingleton instance;
	private String nome;
	private int nota;
	
	private NotaAlunoSingleton() {
		
	}
	
	public static NotaAlunoSingleton criaAluno() {
		if(instance == null) {			
			instance = new NotaAlunoSingleton();
		}
		return instance;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Aluno: "+this.nome+"\nNota: "+this.nota+"\n";
	}
}

