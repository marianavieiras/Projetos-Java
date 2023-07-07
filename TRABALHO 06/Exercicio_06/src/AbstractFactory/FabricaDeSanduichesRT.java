package AbstractFactory;
import Produto.TipoPao;
import Produto.TipoPresunto;
import Produto.TipoQueijo;
import Produto.TipoSalada;
import Produto.PaoFrances;
import Produto.PaoIntegral;
import Produto.Frango;
import Produto.Mussarela;
import Produto.Prato;
import Produto.ComSalada;


public class FabricaDeSanduichesRT implements SanduichesIngredientFactory{
	public static Sanduiche FactorySanduiche(String pao, String queijo, String presunto, String salada) {
		TipoPao novo = new TipoPao(" ");
		if(pao.equals("Pão francês")) {
			novo = new PaoFrances();
		} else if(pao.equals("Pão integral")) {
			novo = new PaoIntegral();
		} else {
			System.out.println("Pão não encontrado");
		}
		
		TipoQueijo outro = new TipoQueijo(" ");
		
		if(queijo.equals("Queijo Prato")) {
			outro = new Prato();
		} else if(queijo.equals("Queijo Mussarela")) {
			outro = new Mussarela();
		} else {
			System.out.println("Queijo não encontrado");
		}
		
		TipoPresunto dif = new TipoPresunto(" ");
		if(presunto.equals("Presunto de frango")) {
			dif = new Frango();
		} else {
			System.out.println("Presunto não encontrado");
		}
		
		TipoSalada alt = new TipoSalada("");
		if(salada.equals("Com salada")) {
			alt = new ComSalada();
		} else {
			System.out.println("Salada não encontrada");
		}
		
		return new Sanduiche(novo, outro, dif, alt, "RT");
	}
}