package Av1;


import java.util.ArrayList;
import java.util.Scanner;

public class Produtos {
    private ArrayList<Produtos> produtos = new ArrayList<>();
    private int opcao = 0;
   







	public void Processamento() {
    	   String nome;
    	    String id;
    	    String valor;
    

        while (opcao != 2) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o nome do Produto:");
            nome = sc.nextLine();
           

            System.out.println("Digite o id do Produto");
            id = sc.nextLine();

   
            System.out.println("Digite o Valor do Produto:");
            valor = sc.nextLine();

           

            
            
        
            Produtos produto = new Produtos();
            produtos.add(produto);
            
            System.out.println("Produto cadastrado com sucesso:\n" + produto.toString());

            System.out.println("Existem mais Produtos a incluir? 1=Sim / 2=Não ");
            opcao = sc.nextInt();
        }
	}
    
        public void ListarProdutos() {
    System.out.println("Lista de Produtos:");
    
    	for (Produtos produtos : produtos) {
        System.out.println(produtos.toString());
    }

}
}
    
