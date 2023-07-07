package principal;

public class Main {
    public static void main(String[] args)  {
    	Conta minhaConta = new Conta();
		minhaConta.deposita(100);
		minhaConta.setLimite(100);
		 try {
	            minhaConta.saca(1000);
	            System.out.println("Saldo: " + minhaConta.getSaldo());
	        } catch (ContaExcecao e) {
	            System.out.println("Saldo indisponivel");
	            }
}
}