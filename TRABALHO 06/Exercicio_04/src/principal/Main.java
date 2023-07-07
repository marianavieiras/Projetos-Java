package principal;
import factory.LanchoneteCG;
import factory.LanchoneteJP;
import factory.LanchoneteRT;
import factory.Sanduiche;
import factory.Factory;

public class Main {

	public static void main(String[] args) {
		System.out.println("____________________________________________");
		Factory sanduiche = new LanchoneteCG();
		Sanduiche CG = sanduiche.FactorySanduiche ();
		System.out.println(CG);
		System.out.println("____________________________________________");
		Factory sanduiche2 = new LanchoneteCG();
		Sanduiche RT = sanduiche2.FactorySanduiche ();
		System.out.println(RT);
		System.out.println("____________________________________________");
		Factory sanduiche3 = new LanchoneteCG();
		Sanduiche JP = sanduiche3.FactorySanduiche ();
		System.out.println(JP);
		
		System.out.println("____________________________________________");
		
		
	}

}
