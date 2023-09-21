package aula03;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Principal{
	private ArrayList<Aluno> alunos = New ArrayList();
	
	private int opcao = 0;
	private String dataRecebida;
	
	
	public void Processamento() {
		String nome = "";
		String cpf;
		
		String matricula;
		String endereco;
		String cep;
		String dataNasc;  
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		formatter.parse(dataNasc);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome ");
		nome = sc.nextLine();
		System.out.println("O nome digitado é"+nome);
		
		System.out.println("Digite sua Data de Nascimento ");
		dataNasc = sc.next();
		System.out.println("A data digitada é "+ dataNasc);
		
		System.out.println("Digite sua Matricula ");
		matricula = sc.next();
		System.out.println("A matricula digitada é "+ matricula);
		
		System.out.println("Digite seu endereço ");
		endereco = sc.next();
		System.out.println("O endereço digitado é "+ endereco);
		
		System.out.println("Digite seu Cep ");
		cep = sc.next();
		System.out.println("O cep digitado é"+ cep);
		
		Aluno aluno = new Aluno(nome,cpf,dataNasc,matricula,endereco,cep);
	
		alunos.add(aluno);
		System.out.println(aluno.toString());
		
	}


	private Date dataNasc(String dataRecebida2) {
		// TODO Auto-generated method stub
		return null;
	}
	
}