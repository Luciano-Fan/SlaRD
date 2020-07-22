package br.com.rd.rdevs.main;

import br.com.rd.rdevs.funcionarios.model.Gerente;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Sla","123456789",9000,"admin",12345,0);
        System.out.println("\nNome: " + gerente.getNome() + "\nCpf: " + gerente.getCpf() + "\nSalario: " + gerente.getSalario());
        gerente.autentica(1234,"admin");
        gerente.autentica(12345,"admim");
        gerente.autentica(12345,"admin");
        gerente.bonificacao();
        System.out.println(gerente.getSalario());
    }
}
