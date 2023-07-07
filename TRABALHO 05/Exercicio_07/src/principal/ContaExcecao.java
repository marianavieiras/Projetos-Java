package principal;

public class ContaExcecao extends Exception {

    private String messagem;
    private double saldoDisponivel;

    public ContaExcecao(String mensagem, double saldo) {
        this.messagem = mensagem;
        this.saldoDisponivel = saldo;
    }

    public String getMessagem() {
        String complemento;
        complemento = "\nSaldo disnponivel para saque: " + getSaldoDisponivel();
        return messagem + complemento;
    }

    public void setMessagem(String message) {
        this.messagem = message;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }
}