package PoB3;

public class Aluno {
	private String nome;
	private String matricula;
	private String email;
	private int idade;
	  public Aluno(String nome, String email, int idade, String matricula) {
	        this.nome = nome;
	        this.email = email;
	        this.idade = idade;
	        this.matricula = matricula;
	    }

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String toString() {
		return "Nome do Aluno: " + nome + " Matricula: " + matricula + " Idade: " + idade + "Email:" + email;
	}
	
}
