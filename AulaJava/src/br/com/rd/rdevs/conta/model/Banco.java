package br.com.rd.rdevs.conta.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
    List <Conta> contas;
    Map<String,Conta> contaMap;

    public Banco() {
        this.contas = new ArrayList<>();
        this.contaMap = new HashMap<>();
    }

    public void adiciona(Conta conta) {
        this.contas.add(conta);
        this.contaMap.put(conta.getTitular(),conta);
    }
    public Conta pega(int x) {
        return this.contas.get(x);
    }
    public int pegaQuantidadeDeContas(){
        return this.contas.size();
    }
    public Conta buscaPorTitular(String nome){
        return this.contaMap.get(nome);
    }

}
