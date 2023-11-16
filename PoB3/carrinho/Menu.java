package carrinho;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Menu {
	private ArrayList<Produto> produtos = new ArrayList();
	
	public void Processamento() {
		int opcao = 0;
		Scanner sc = new Scanner(System.in);
		char resposta = 'S';
		
	
		
			do {
				System.out.println("Digite a opção:");
				System.out.println("1- Incluir Produto: ");
				System.out.println("2- Alterar Produto: ");
				System.out.println("3- Excluir Produto: ");
				System.out.println("4- Listar Produtos: ");
				System.out.println("5- Buscar Produto: ");
				System.out.println("6- Sair ");
				
				opcao = sc.nextInt();
				
				System.out.println("opção é: " + opcao);
				
				switch(opcao)
				{
				case 1:
//					ProdutoApplication prodApp = new ProdutoApplication();
//					prodApp.IncluirProduto();
					IncluirProduto();
					break;
				case 2:
//					AlterarProduto();
					break;
				case 3:
//					ExcluirProduto();
					break;
					
				case 4:
//					ListarProduto();
					break;
					
				case 5:
//					BuscarProduto();
					break;
					
				case 6:
					System.exit(0);
					break;
					
				default:
					System.out.println("Opção inválida. Tente novamente!");
				}
				
				
			} while (opcao != 6);
				
					
	}
	public Boolean IncluirProduto() {
		String nome = "";
		String upc; // identificador universal
		String sku;  //identificador da loja/vendedor
		String descricao;
		double valor;
		int estoque = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto ");
			nome = sc.next();
			System.out.println("o nome digitado é: " + nome);
			System.out.println("Digite UPC do produto (somente os numeros): ");
			upc = sc.next();
			System.out.println("Seu UPC é: " + upc);
			System.out.println("Digite sku: ");
			sku = sc.next();
			System.out.println("sua SKU é: " + sku);
			System.out.println("Digite sua descricao: ");
			descricao = sc.next();
			System.out.println("Digite seu valor: ");
			valor = sc.nextDouble();
			System.out.println("valor de valor: " + valor);
			System.out.println("Digite qtd em estoque: ");
			estoque = sc.nextInt();
			System.out.println("valor de valor: " + valor);
			
			ProdutoApplication prodApp = new ProdutoApplication();
			Produto prod = prodApp.IncluirProduto(nome,upc,sku,descricao, valor,estoque);
			
			produtos.add(prod);

//			Produto aluno = new Produto(nome, cpf, matricula, dtAux, endereco, cep);
			
//			alunos.add(aluno);
			

		return true;
	}

}