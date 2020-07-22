package br.com.rd.rdevs.funcionarios.model;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String login;
    private int senha;

    public Funcionario () {

    }

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public Funcionario(String nome, String cpf, double salario, String login, int senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.login = login;
        this.senha = senha;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getLogin() {
        return login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha, String login) {
        if (this.senha == senha && login.equals(this.login)) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }

    public abstract double bonificacao();

}
/*
3. Modele no diagrama as classes SecretariaExecutiva e SecretariaAdministraviva de tal forma que elas herdem de uma classe abstrata comum às duas.
*/