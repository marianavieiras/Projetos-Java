package principal;

class Gerente extends Empregado {
	  
	  private String nomeGerencia;



	  public Gerente(String nome,int idade, String sexo,  double salario, String matricula,String nomeGerencia){
	    super(nome, idade, sexo, salario, matricula);
	    this.nomeGerencia = nomeGerencia;
	  }

	  public String getNomeGerencia(){
	    return this.nomeGerencia;
	  }

	  public void setNomeGerencia(String nomeGerencia){
	   this.nomeGerencia = nomeGerencia;
	  }

	  public double valorINSS(){
	    return super.getSalario()*1.11;
	  }
	  
	  @Override
	  public String toString() {
	   
	    return super.toString()+" Nome gerente: "+this.nomeGerencia+ "Valor INSS"+this.valorINSS();
	  }
	}
