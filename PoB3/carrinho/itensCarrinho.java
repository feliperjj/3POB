package carrinho;

import java.util.*;

public class itensCarrinho {

	int id;
	int idProduto;
	int quant=0;
	public itensCarrinho(int id, int idProduto, int quant) {
		super();
		this.id = id;
		this.idProduto = idProduto;
		this.quant = quant;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	
}
