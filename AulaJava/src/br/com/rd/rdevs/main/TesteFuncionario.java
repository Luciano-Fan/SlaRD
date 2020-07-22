package br.com.rd.rdevs.main;

import br.com.rd.rdevs.funcionarios.model.Gerente;

public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente funcionario = new Gerente("Luciano","50694565806",2000,"aaaaa",1234,10);
        System.out.println("Nome: " + funcionario.getNome() + "\nCpf: " + funcionario.getCpf() + "\nSalario: " + funcionario.getSalario());
        funcionario.autentica(1234,"aaaaa");
        funcionario.autentica(1234,"aaaaaa");
        funcionario.autentica(11234,"aaaaa");
        funcionario.bonificacao();
        System.out.println(funcionario.getSalario());
        System.out.println(funcionario.getClass());
    }
}
