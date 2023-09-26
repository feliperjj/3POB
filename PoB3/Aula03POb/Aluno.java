package Aluno;

import java.util.Date;

public class Aluno {
    private String nome;
    private String cpf;
    private String matricula;
    private String endereco;
    private String cep;
    private String dataNascStr;

    public Aluno(String nome, String cpf, Date dataNasc, String endereco, String cep, String dataNascStr, String matricula) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.endereco = endereco;
        this.cep = cep;
        this.dataNascStr = dataNascStr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getDataNascStr() {
        return dataNascStr;
    }

    public void setDataNascStr(String dataNascStr) {
        this.dataNascStr = dataNascStr;
    }

    
    public String toString() {
        return "Nome do Aluno: " + nome + "\nMatricula: " + matricula + "\nData de Nascimento: " + dataNascStr + "\nEndereço: " + endereco + "\nCEP: " + cep + "\nCPF: " + cpf;
    }
}
