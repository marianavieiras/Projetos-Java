package principal;
import formas.FormaGeometricaFactory;
import formas.FormaGeometrica;

public class Main {
	public static void main(String[] args) {
		FormaGeometrica forma = FormaGeometricaFactory.FactoryFormaGeometrica("Circulo");
		forma.criar();
		
		FormaGeometrica forma2 = FormaGeometricaFactory.FactoryFormaGeometrica("Quadrado");
		forma2.criar();
		
		FormaGeometrica forma3 = FormaGeometricaFactory.FactoryFormaGeometrica("Losangolo");
		forma3.criar();
	}

}
