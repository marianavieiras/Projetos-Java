package factory;

public class Sanduiche {
	
	private String pao;
    private String queijo;
    private String presunto;
    private String salada;
    private String nome;

    public Sanduiche(String pao, String queijo, String presunto, String salada, String nome) {
        this.pao = pao;
        this.queijo = queijo;
        this.presunto = presunto;
        this.salada = salada;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  "Lanchonete: " + nome + "\nSanduiche: "+
        		"\nPão: " + pao +
                "\nQueijo: " + queijo +
                "\nPresunto: " + presunto +
                "\nSalada: " + salada;
    }

}
