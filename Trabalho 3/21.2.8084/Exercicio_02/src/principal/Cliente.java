package principal;

class Cliente extends Pessoa {
	  
	  private int anoNascimento;
	  private double valorDivida;


	  public Cliente(String nome, double valorDivida,int idade, String sexo,  int anoNascimento){
	    super(nome , idade, sexo);
	    this.anoNascimento = anoNascimento;
	    this.valorDivida = valorDivida;
	  }

	  public int getAnoNascimento(){
	    return this.anoNascimento;
	  }

	  public void setAnoNascimento(int anoNascimento){
	   this.anoNascimento = anoNascimento;
	  }
	  public double getValorDivida(){
	    return this.valorDivida;
	  }

	  public void setValorDivida(double valorDivida){
	   this.valorDivida = valorDivida;
	  }

	  @Override
	  public String toString() {
	   
	    return "Nome: "+super.getNome()+" Idade: "+super.getIdade()+" Sexo:     "+super.getSexo()+" Valor da divida: "+this.valorDivida+" Ano de   nascimento: "+ this.anoNascimento;
	  }
	}
