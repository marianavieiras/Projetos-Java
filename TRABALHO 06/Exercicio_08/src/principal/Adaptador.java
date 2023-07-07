package principal;

public class Adaptador extends MedidorCelsiusIF{
	private MedidorFarenheit obj;
	
	public Adaptador(MedidorFarenheit obj) {
		this.obj = obj;
	}
	
	@Override
	public double medirTemperatura() {		
		return obj.getTemperaturaFarenheit() - 32;
	}
}
