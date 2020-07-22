package br.com.rd.rdevs.funcionarios.model;

public class Gerente extends Funcionario {
    private int numeroDeFuncionariosGerenciados;
    private String login;
    private int senha;

    public Gerente(String nome, String cpf, double salario, String login, int senha, int numeroDeFuncionariosGerenciados) {
        super(nome, cpf, salario);
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
        this.login = login;
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }

    @Override
    public boolean autentica(int senha, String login) {
        if (this.senha == senha && login.equals(this.login)) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }

    }

    @Override
    public double bonificacao() {
        return this.getSalario() * 1.15 + 500;
    }
}
