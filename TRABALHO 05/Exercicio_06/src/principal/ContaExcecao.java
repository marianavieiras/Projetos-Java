package principal;

public class ContaExcecao extends Exception {
	private String mensagem;
	private double saldo;
	
	public ContaExcecao(String msg) {
		this.mensagem = msg;
	
	}

	public String getMensagem() {
		return mensagem + "\nSaldo: "+this.saldo;
	}
}