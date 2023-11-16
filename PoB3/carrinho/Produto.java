package carrinho;

public class Produto {
	private String nome;
	private String upc; // identificador universal
	private String sku;  //identificador da loja/vendedor
	private String descricao;
	private double valor;
	private double peso;
	private int estoque;
	public Produto(String nome, String upc, String sku, String descricao, double valor,double peso, int estoque) {
		super();
		this.nome = nome;
		this.upc = upc;
		this.peso=peso;
		this.sku = sku;
		this.descricao = descricao;
		this.valor = valor;
		this.estoque = estoque;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public double getpeso() {
		
		return peso;
		
	}
	public void setPeso(double peso) {
		this.peso = peso; 
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

}