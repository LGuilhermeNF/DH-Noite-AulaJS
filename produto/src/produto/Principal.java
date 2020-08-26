package produto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Produto p = new Produto();
		
		
		System.out.println("!!!! Cadastrar Produto !!!!");
		System.out.print("Nome: ");
		p.nome = sc.next();
		
		System.out.print("Preço: ");
		p.preco = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		p.quantidade = sc.nextInt();
		
		// RESULTADO
		System.out.println("Nome: " + p.nome + ", Preço: R$ " + p.preco + ", Quantidade: " + p.quantidade + ", Total: R$ " + p.totalValorEstoque());
		System.out.println();
		
		// REMOVENDO QUANTIDADES E ALTERANDO O TOAL
		System.out.print("Digite a quantidade de produtos a serem retirados no estoque: ");
		p.removerProdutos(sc.nextInt());
		System.out.println();
		
		System.out.print("Nome: " + p.nome + ", Preço: R$ " + p.preco + ", Nova quantidade: " + p.quantidade + ", Novo total: R$ " + p.totalValorEstoque());
		System.out.println();
		
		// ADICINANDO QUANTIDADES E ALTERANDO O TOAL
		System.out.print("Digite a quantidade de produtos a serem adicionados no estoque: ");
		p.adicionarProdutos(sc.nextInt());
		System.out.println();
		
		System.out.println("Nome: " + p.nome + ", Preço: R$ " + p.preco + ", Nova quantidade: " + p.quantidade + ", Novo total: R$ " + p.totalValorEstoque());
		System.out.println();
	}

}
