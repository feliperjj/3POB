package PoB3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String nome = "";
		String email;
		int idade;
		String matricula;
		
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu primeiro nome ");
		nome = sc.next();
		
		System.out.println("Digite sua idade ");
		idade = sc.nextInt();
		System.out.println("Digite sua Matricula ");
		matricula = sc.next();

		System.out.println("Digite seu email ");
		email = sc.next();
		
		
		Aluno aluno = new Aluno(nome,email,idade,matricula);
	
		
		System.out.println(aluno.toString());
		
		
	
		
		
		
		
		
		
//		String nome;
//		String sigla;
//		int periodo;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("digite o nome da disciplina");
//		nome = sc.next();
//		System.out.println("digite a sigla da disciplina");
//		sigla = sc.next();
//		System.out.println("digite o periodo da disciplina");
//		periodo = sc.nextInt();
//		Disciplina disciplina = new Disciplina(nome, sigla, periodo);
////		disciplina.setNome(nome);
////		disciplina.setPeriodo(periodo);
////		disciplina.setSigla(sigla);
//		
//		System.out.println("Disciplina: " + disciplina.toString());
//
//		System.out.println("digite o nome da disciplina");
//		nome = sc.next();
//		System.out.println("digite a sigla da disciplina");
//		sigla = sc.next();
//		System.out.println("digite o periodo da disciplina");
//		periodo = sc.nextInt();
//
//		Disciplina disciplina2 = new Disciplina(nome, sigla, periodo);
//		System.out.println("Disciplina: " + disciplina2.toString());
//		
	
		
		
	}
}
	

	

	