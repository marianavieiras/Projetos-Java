package principal;
import AbstractFactory.FabricaDeSanduichesRT;
import AbstractFactory.Sanduiche;
import AbstractFactory.SanduichesIngredientFactoryCG;
import AbstractFactory.SanduichesIngredientFactoryJP;

public class Main {
	public static void main(String[] args) {
		
		Sanduiche lancheJP = SanduichesIngredientFactoryJP.FactorySanduiche("Pão integral", "Queijo Prato", "Presunto de peru", "Sem salada");
		System.out.println(lancheJP);
		
		Sanduiche lancheGC = SanduichesIngredientFactoryCG.FactorySanduiche("Pão bola", "Queijo Cheddar", "Presunto de peru", "Com salada");
		System.out.println(lancheGC);
				
		Sanduiche lancheRT = FabricaDeSanduichesRT.FactorySanduiche("Pão francês", "Queijo Prato", "Presunto de frango", "Com salada");
		System.out.println(lancheRT);
		
		
	}

}
