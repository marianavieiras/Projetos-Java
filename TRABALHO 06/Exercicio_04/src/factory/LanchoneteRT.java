package factory;

public class LanchoneteRT extends Factory {
	 @Override
	    public Sanduiche FactorySanduiche () {
	        return new Sanduiche("Pão bola", "Cheddar", "De Peru", "Sem Verdura", "RT");
	    }

}
