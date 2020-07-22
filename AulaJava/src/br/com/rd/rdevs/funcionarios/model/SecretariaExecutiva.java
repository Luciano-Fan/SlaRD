package br.com.rd.rdevs.funcionarios.model;

public class SecretariaExecutiva extends Secretaria {

    public SecretariaExecutiva(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public SecretariaExecutiva(String nome, String cpf, double salario, String login, int senha) {
        super(nome, cpf, salario, login, senha);
    }

    @Override
    public double bonificacao() {
        return 0;
    }
}
