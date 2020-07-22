package br.com.rd.rdevs.funcionarios.model;

public class Diretor extends Funcionario {

    private int numeroDeFuncionariosGerenciados;
    private String login;
    private int senha;


    public Diretor(String nome, String cpf, double salario, int numeroDeFuncionariosGerenciados, String login, int senha) {
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
        return getSalario()* 1.15 + 600;
    }
}
