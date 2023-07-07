package exercicio1.ufop.com;

public class Caixa {
	private int pe, mao, podologa;
    private float valor1, valor2, valor3;
    private String nome;
   
    public Caixa(String nome ,int pe, int mao, int podologa, float valor1, float valor2, float valor3){
        this.pe = pe;
        this.mao = mao;
        this.podologa = podologa;
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
        this.nome = nome;
    }
    public int pe () {
    	return pe;
    }
    public int mao () {
    	return mao;
    }
    public int podologa () {
    	return podologa;
    }
 
    public float valor1() {
        return valor1;
    }
    public float valor2() {
        return valor2;
    }
    public float valor3() {
        return valor3;
    }
 
    public String getNomeManicure() {
    	return nome;
    	}
              
    
  
}
