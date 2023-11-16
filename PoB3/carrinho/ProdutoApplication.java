package carrinho;

public class ProdutoApplication {

	public Produto IncluirProduto(String nome, String upc, String sku, String descricao, double valor, int estoque) {
		// fazer validação
		Produto produto = new Produto(nome, upc, sku, descricao, valor, estoque);
		return produto;
	}
}