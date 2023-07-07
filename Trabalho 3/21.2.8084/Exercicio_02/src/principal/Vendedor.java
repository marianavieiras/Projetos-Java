package principal;

class Vendedor extends Empregado {
	  
	  private int qntdVendas;
	  private double valorVendas;


	  public Vendedor(String nome,int idade, String sexo,  double salario, String matricula, int qntdVendas,double valorVendas){
	    super(nome, idade, sexo, salario, matricula);
	    this.qntdVendas = qntdVendas;
	    this.valorVendas = valorVendas;
	  }

	  public int getQntdVendas(){
	    return this.qntdVendas;
	  }

	  public void setQntdVendas(int qntdVendas){
	   this.qntdVendas = qntdVendas;
	  }
	  public double getValorVendas(){
	    return this.valorVendas;
	  }

	  public void setValorVendas(double valorVendas){
	   this.valorVendas = valorVendas;
	  }

	  @Override
	  public String toString() {
	   
	    return super.toString()+" Quantidade de Vendas: "+this.qntdVendas+" Valor Vendas:"+this.valorVendas;
	  }
	}
