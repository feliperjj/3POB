package Av1;
import java.util.ArrayList;
import java.util.Scanner;




public class Carrinho {
    private String nome;
    private String quantidade;
    private String total;
    private int opcao = 0;
	
    
   

    public Carrinho(String nome, String quantidade, String total) {
        
        this.nome = nome;
        this.quantidade = quantidade;
        this.total = total;
        
    
    

      while (opcao != 2) {
          Scanner sc = new Scanner(System.in);

          System.out.println("Digite o nome do Produto que quer incluir ao carrinho:");
          nome = sc.nextLine();
         

          System.out.println("Digite a Quantidade de Produtos desejada");
          quantidade = sc.nextLine();

     
          

         

          
          
      
          Carrinho carro = new Carrinho(nome, quantidade, total);
          Carrinho.add(carro);
          
          System.out.println("Carrinho Completo com sucesso com sucesso:\n" + carro.toString());

          System.out.println("Existem mais Produtos a incluir? 1=Sim / 2=Não ");
          opcao = sc.nextInt();
      }

    
}



