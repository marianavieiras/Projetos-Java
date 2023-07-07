package exercicio7.ufop.com;

public class Invoice {

private int num; 
private String descricao;
private int qnt; 
private float preco;
private float total;

public Invoice (int num, String descricao, int qnt, float preco, float total) {
	this.num = num; 
	this.descricao = descricao;
	this.qnt = qnt;
	
	if(this.preco <=0) {
		this.preco = 0;
	}
	if(this.total <= 0) {
		this.total = 0;
	}

}


public int getNum () {
	return num;
}
public void setNum (int num) {
	this.num = num;
}
public String getDescricao () {
	return descricao;
}
public void setDescricao (String descricao) {
	this.descricao = descricao;
}
public int getQnt () {
	return qnt;
}
public void setQnt (int qnt) {
	this.qnt = qnt;
}
public float getPreco () {
	return preco;
}
public void setPreco (float preco) {
	this.preco = preco;
}

public void setInvoiceAmount (float total) {
		this.total = total;
	}
public float getInvoiceAmount () {
	return total;
}
}


