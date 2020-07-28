package br.com.rd.rdevs.main;

import br.com.rd.rdevs.conta.model.Conta;
import br.com.rd.rdevs.conta.model.ContaCorrente;
import br.com.rd.rdevs.conta.model.ContaPoupanca;
import br.com.rd.rdevs.conta.model.SaldoInsuficienteException;

public class TesteConta {

    public static void main(String args[]){
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        Conta minhaConta = new ContaCorrente(1257, "Ivo", 20000, 5000,"2133", "24/08/14",cc);
        Conta outraConta = new ContaPoupanca(1635,"Leo",20000,5000,"2133","10/10/10",cp);

        minhaConta.transferir(outraConta, 3000);
        minhaConta.recuperarDadosParaImpressao();
        outraConta.recuperarDadosParaImpressao();
        System.out.println(Conta.getIdentificador());

        minhaConta.sacar(100);
        outraConta.sacar(1000);

        System.out.println(minhaConta.getSaldo());
        System.out.println(outraConta.getSaldo());

        System.out.println(minhaConta.getTipoConta());
        System.out.println(outraConta.getTipoConta());

        try {
            minhaConta.depositar(300000000);
            minhaConta.sacar(0);

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());

        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }


    }

}

