package principal;

import java.util.Random;

public class MedidorCelsiusIF implements MedirTemperatura {
	public double medirTemperatura() {
		return new Random().nextDouble();
	}
}

