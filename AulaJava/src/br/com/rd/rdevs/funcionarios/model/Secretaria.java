package br.com.rd.rdevs.funcionarios.model;

public abstract class Secretaria extends Funcionario{

    public Secretaria(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public Secretaria(String nome, String cpf, double salario, String login, int senha) {
        super(nome, cpf, salario, login, senha);
    }


}