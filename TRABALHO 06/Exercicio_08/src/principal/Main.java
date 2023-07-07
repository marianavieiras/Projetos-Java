package principal;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		MedidorFarenheit f = new MedidorFarenheit();
		
		MedidorCelsiusIF c = new MedidorCelsiusIF();
		
		ArrayList<MedidorCelsiusIF> dados = new ArrayList<MedidorCelsiusIF>();
		
		Adaptador a = new Adaptador(f);
		dados.add(c);
		dados.add(a);
		
		for (MedirTemperatura medida : dados) {
			System.out.println("Celsius: "+medida.medirTemperatura());;
		}
	}

}
