package principal;

class Peixe extends Animal{
	  
	  private String tipoHabitat;


	  public Peixe(String nome, double peso, String tipoHabitat){
	    super(nome , peso);
	    this.tipoHabitat = tipoHabitat;
	  }

	  public String gettipoHabitat(){
	    return this.tipoHabitat;
	  }

	  public void settipoHabitat(String tipoHabitat){
	   this.tipoHabitat = tipoHabitat;
	  }

	  @Override
	  public String toString() {
	   
	  return "Nome: "+super.getNome()+" Peso: "+super.getPeso()+" Tipo habitat: "+this.tipoHabitat;
	  }
	}