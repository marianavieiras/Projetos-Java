package AbstractFactory;
import Produto.TipoPao;
import Produto.TipoPresunto;
import Produto.TipoQueijo;
import Produto.TipoSalada;


public class Sanduiche implements SanduichesIngredientFactory {
	private TipoPao pao;
	private TipoPresunto presunto;
	private TipoQueijo queijo;
	private TipoSalada salada;
	private String lanchonete;
	
	protected Sanduiche(TipoPao pao, TipoQueijo queijo, TipoPresunto presunto, TipoSalada salada, String lanchonete) {
		this.pao = pao;
		this.queijo = queijo;
		this.salada = salada;
		this.presunto = presunto;
		this.lanchonete = lanchonete;
	}
	
	@Override
	public String toString() {
		return  "________________________________"+
				"\nLanchonete: "+this.lanchonete+
				"\nPão escolhido: \n"+this.pao.getTipoPao()+
				"\nQueijo escolhido: \n"+this.queijo.getTipoQueijo()+
				"\nPresunto escolhido: \n"+this.presunto.getTipoPresunto()+
				"\nSalada escolhida: \n"+this.salada.getTipoSalada()+"\n";
	}
}
