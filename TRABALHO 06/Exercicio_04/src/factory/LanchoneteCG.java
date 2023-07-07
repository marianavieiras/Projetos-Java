package factory;

public class LanchoneteCG extends Factory{
	 @Override
	    public Sanduiche FactorySanduiche () {
	        return new Sanduiche("Pão Integral", "Prato", "De Frango", "Sem verdura", "CG");
	    }

}
