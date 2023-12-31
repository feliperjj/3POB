package Aluno;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private int opcao = 0;
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public void Processamento() {
        String nome;
        String cpf;
        String matricula;
        String endereco;
        String cep;
        String dataNascStr;

        while (opcao != 2) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite seu nome:");
            nome = sc.nextLine();
            System.out.println("O nome digitado é: " + nome);

            System.out.println("Digite sua Data de Nascimento (dd/MM/yyyy):");
            dataNascStr = sc.nextLine();

            Date dataNasc = null;

            try {
                dataNasc = formatter.parse(dataNascStr);
                System.out.println("A data digitada é: " + dataNascStr);
            } catch (Exception e) {
                System.err.println("Data de nascimento inválida. Tente novamente.");
                continue; 
            }

            System.out.println("Digite sua Matricula (deve conter 10 caracteres):");
            matricula = sc.nextLine();

            if (matricula.length() != 10) {
                System.err.println("A matrícula deve conter exatamente 10 caracteres. Tente novamente.");
                continue;
            }

            System.out.println("A matricula digitada é: " + matricula);
            
            System.out.println("Digite seu endereço:");
            endereco = sc.nextLine();
            
            System.out.println("O endereço digitado é: " + endereco);
           
            System.out.println("Digite seu Cep:");
            cep = sc.nextLine();
            if(cep.length()!=8) {
            	
            	System.err.println("O cep deve conter exatamente 8 caracteres. Tente novamente.");
                continue;
            }
            
            System.out.println("O cep digitado é: " + cep);

            System.out.println("Digite seu CPF:");
            cpf = sc.nextLine();
            
            if(cpf.length()!=10) {
            	
            	System.err.println("O cpf deve conter exatamente 10 caracteres. Tente novamente.");
                continue;
            }
            
            System.out.println("O CPF digitado é: " + cpf);

            Aluno aluno = new Aluno(nome, cpf, dataNasc, matricula, endereco, cep, dataNascStr);
            alunos.add(aluno);
            
            System.out.println("Aluno cadastrado com sucesso:\n" + aluno.toString());

            System.out.println("Existem mais alunos a incluir? 1=Sim / 2=Não ");
            opcao = sc.nextInt();
        }
    }
}
public void AlterarAluno() {
		String matricula;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu a matricula que você quer alterar: ");
		matricula = sc.next();
		//Percorre o vetor de alun para encontrar o objeto de aluno(altALuno), que equivaleria a alunos[i]
		
	    for (Aluno altAluno : alunos) {
	    	if (altAluno.getMatricula() == matricula) {
	    		System.out.println(altAluno.getMatricula());
	    		
	    	}
	        
	    }
	}
	public void ExcluirAluno() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a matrícula do aluno que deseja excluir: ");
    String matriculaExcluir = sc.next();
    
    // Use um Iterator para remover com segurança o aluno da ArrayList
    Iterator<Aluno> iterator = alunos.iterator();
    while (iterator.hasNext()) {
        Aluno aluno = iterator.next();
        if (aluno.getMatricula().equals(matriculaExcluir)) {
            iterator.remove();
            System.out.println("Aluno removido com sucesso.");
            return;
        }
    }
    
    System.out.println("Aluno com a matrícula " + matriculaExcluir + " não encontrado.");
}

public void ListarAluno() {
    System.out.println("Lista de Alunos:");

    for (Aluno aluno : alunos) {
        System.out.println(aluno.toString());
    }
}

public void BuscarAluno() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a matrícula do aluno que deseja buscar: ");
    String matriculaBuscar = sc.next();
    
    for (Aluno aluno : alunos) {
        if (aluno.getMatricula().equals(matriculaBuscar)) {
            System.out.println("Aluno encontrado:\n" + aluno.toString());
            return;
        }
    }
    
    System.out.println("Aluno com a matrícula " + matriculaBuscar + " não encontrado.");
}
