package Av1Pob;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
    private String nome;
    private String id;
    private double valor;

    public Produto(String nome, String id, double valor) {
        this.nome = nome;
        this.id = id;
        this.valor = valor;
    }

    
    public String toString() {
        return "Nome: " + nome + ", ID: " + id + ", Valor: " + valor;
    }
}

public class Produtos {
    private ArrayList<Produto> produtos = new ArrayList<>();
    private int opcao = 0;

    public void Processamento() {
        while (opcao != 2) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o nome do Produto:");
            String nome = sc.nextLine();

            System.out.println("Digite o id do Produto:");
            String id = sc.nextLine();

            System.out.println("Digite o Valor do Produto:");
            double valor = sc.nextDouble();

            Produto produto = new Produto(nome, id, valor);
            produtos.add(produto);

            System.out.println("Produto cadastrado com sucesso:\n" + produto.toString());

            System.out.println("Existem mais Produtos a incluir? 1=Sim / 2=Não ");
            opcao = sc.nextInt();
        }
    }

    public void ListarProdutos() {
        System.out.println("Lista de Produtos:");

        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }
    }
}
    
