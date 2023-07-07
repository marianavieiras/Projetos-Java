package plantas.ufop.com;


public class Plantas {
private String nomeplanta;
private int estoqueAtual;
private int estoqueIdeal;

public Plantas (String nomeplanta, int estoqueAtual, int estoqueIdeal) {
	this.nomeplanta = nomeplanta;
	this.estoqueAtual = estoqueAtual;
	this.estoqueIdeal = estoqueIdeal;
}

public String getNomePlanta () {
	return nomeplanta;
	}
public void setNomePlanta (String nomeplanta) {
    this.nomeplanta = nomeplanta;
}

public int getEstoqueAtual () {
	return estoqueAtual;
	}

public void setEstoqueAtual (int estoqueAtual) {
    this.estoqueAtual = estoqueAtual;
}

public int getEstoqueIdeal () {
	return estoqueIdeal;
	}
public void setEstoqueIdeal (int estoqueIdeal) {
    this.estoqueIdeal = estoqueIdeal; 
}

}
