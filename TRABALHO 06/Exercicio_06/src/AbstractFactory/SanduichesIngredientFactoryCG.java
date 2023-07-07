package AbstractFactory;
import Produto.TipoPao;
import Produto.TipoPresunto;
import Produto.TipoQueijo;
import Produto.TipoSalada;
import Produto.PaoFrances;
import Produto.Peru;
import Produto.Mussarela;
import Produto.PaoBola;
import Produto.Cheddar;
import Produto.SemSalada;

public class SanduichesIngredientFactoryCG implements SanduichesIngredientFactory{
	
	public static Sanduiche FactorySanduiche(String pao, String queijo, String presunto, String salada) {
		TipoPao novo = new TipoPao(" ");
		if(pao.equals("Pão francês")) {
			novo = new PaoFrances();
		} else if(pao.equals("Pão bola")) {
			novo = new PaoBola();
		} else {
			System.out.println("Pão não encontrado");
		}
		
		TipoQueijo outro = new TipoQueijo("");
		
		if(queijo.equals("Queijo Cheddar")) {
			outro = new Cheddar();
		} else if(queijo.equals("Queijo Mussarela")) {
			outro = new Mussarela();
		} else {
			System.out.println("Queijo não encontrado");
		}
		
		TipoPresunto dif = new TipoPresunto("");
		if(presunto.equals("Presunto de peru")) {
			dif = new Peru();
		} else {
			System.out.println("Presunto não encontrado");
		}
		
		TipoSalada alt = new TipoSalada("");
		if(salada.equals("Com salada")) {
			alt = new SemSalada();
		} else {
			System.out.println("Salada não encontrada");
		}
		
		return new Sanduiche(novo, outro, dif, alt, "CG");
	}
}
