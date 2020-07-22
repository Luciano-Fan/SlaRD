package br.com.rd.rdevs.funcionarios.model;

public class Presidente extends Funcionario {

    private int numeroDeFuncionariosGerenciados;
    private String login;
    private int senha;

    public Presidente(String nome, String cpf, double salario, int numeroDeFuncionariosGerenciados, String login, int senha) {
        super(nome, cpf, salario);
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
        this.login = login;
        this.senha = senha;
    }

    @Override
    public double bonificacao() {
        return getSalario()* 1.2 + 600;
    }
}
