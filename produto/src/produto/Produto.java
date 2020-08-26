package produto;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalValorEstoque() {
		return (preco * quantidade);
	}
	
	public void adicionarProdutos(int qtdProduto) {
		this.quantidade += qtdProduto;
	}
	
	
	public void removerProdutos(int qtdProduto) {
		this.quantidade -= qtdProduto;
	}
}
