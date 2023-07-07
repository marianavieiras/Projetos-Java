package principal;

public class Calculator {
	
	double divisao (double a, double b) throws InvalidOperationException {
        if (b == 0) {
            InvalidOperationException e = new InvalidOperationException("Não é possivel realizar divisão por 0");
            throw e;
        }
        return a / b;
    }

    double log10(double a) throws InvalidOperationException {
        return Math.log10(a);
    }

}
