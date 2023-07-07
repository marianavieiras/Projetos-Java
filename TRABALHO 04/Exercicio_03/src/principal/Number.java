package principal;
import java.util.Objects;

public class Number {
	private int Numero;

	public void setNumero(int numero) {
		Numero = numero;
	}
	public int getValue() {
		return Numero;
	}
	

	public int hashCode() {
		return Objects.hash(Numero);
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
			}
		
		else if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
			}
		
		Number outro = (Number) obj;
		return Numero == outro.Numero;
	}

	
	public String toString() {
	return "Numero: "+this.Numero;
}


}
