package principal;

class Empregado extends Pessoa {
	  
	  private String matricula;
	  private double salario;


	  public Empregado(String nome, int idade, String sexo,double salario, String matricula){
	    super(nome , idade, sexo);
	    this.matricula = matricula;
	    this.salario = salario;
	  }

	  public String getMatricula(){
	    return this.matricula;
	  }

	  public void setMatricula(String matricula){
	   this.matricula = matricula;
	  }
	  public double getSalario(){
	    return this.salario;
	  }

	  public void setSalario(double salario){
	   this.salario = salario;
	  }

	  @Override
	  public String toString() {
	   
	    return "Nome: "+super.getNome()+" Idade: "+super.getIdade()+" Sexo:     "+super.getSexo()+" Salario: "+this.salario+" Matricula: " 
	   +this.matricula;
	  }
	}
