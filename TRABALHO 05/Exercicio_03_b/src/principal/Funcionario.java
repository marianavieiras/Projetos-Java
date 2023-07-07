package principal;

public class Funcionario implements Comparable<Funcionario>{

	String ID;
	String nome;
	double salario; 
	String dataContratacao;
	public Funcionario (String ID, String nome, double salario, String dataContratacao) {
		this.ID = ID;
		this.nome = nome;
		this.salario = salario;
		this.dataContratacao = dataContratacao;
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDataContratacao() {
		return dataContratacao;
	}
	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	
	public void imprime () {
		System.out.println("ID: "+this.ID);
		System.out.println("Nome: "+this.nome);
		System.out.println("Salario: "+this.salario);
		System.out.println("Data: "+this.dataContratacao);
		System.out.println ("______________________________");	
		}

	@Override
	public int compareTo(Funcionario o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}
