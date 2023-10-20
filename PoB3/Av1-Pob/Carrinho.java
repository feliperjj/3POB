package Av1Pob;
import java.util.ArrayList;
import java.util.Scanner;

public class Carrinho {
    private String nome;
    private int quantidade;
    private double total;
    private ArrayList<Carrinho> items;  
    private int opcao = 1;  

    public Carrinho() {
        items = new ArrayList<>();
        while (opcao != 2) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o nome do Produto que quer incluir ao carrinho:");
            nome = sc.nextLine();

            System.out.println("Digite a Quantidade de Produtos desejada:");
            quantidade = sc.nextInt();

            System.out.println("Digite o Preço Unitário do Produto:");
            double precoUnitario = sc.nextDouble();

            total += quantidade * precoUnitario;  

           
            items.add(new Carrinho(nome, quantidade, total));

            System.out.println("Carrinho Completo com sucesso:\n" + items.toString());

            System.out.println("Existem mais Produtos a incluir? 1=Sim / 2=Não ");
            opcao = sc.nextInt();
        }
    }

   
    public Carrinho(String nome, int quantidade, double total) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.total = total;
    }


    public String toString() {
        return "Nome: " + nome + ", Quantidade: " + quantidade + ", Total: " + total;
    }

    public static void main(String[] args) {
        
        new Carrinho();
    }
}

