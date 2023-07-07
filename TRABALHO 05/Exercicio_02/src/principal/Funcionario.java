package principal;

public class Funcionario {
 // Faca um mapa que associe um ID de um empregado a seu nome
	
	String ID;
	String nome;
	 public Funcionario (String ID, String nome) {
	        this.ID = ID;
	        this.nome = nome;
	    }
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
