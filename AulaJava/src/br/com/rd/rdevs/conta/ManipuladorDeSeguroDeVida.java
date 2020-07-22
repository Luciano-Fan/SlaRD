package br.com.rd.rdevs.conta;

import br.com.rd.rdevs.conta.model.SeguroDeVida;

public class ManipuladorDeSeguroDeVida {

    private SeguroDeVida seguroDeVida;

    public ManipuladorDeSeguroDeVida(int numeroApolice, String titular, double valor) {
        criaSeguro(numeroApolice,titular,valor);
    }
    private void criaSeguro(int numeroApolice, String titular, double valor ){
        this.seguroDeVida = new SeguroDeVida(titular, numeroApolice, valor);
    }

    public void mostrarSeguroDeVida() {
        System.out.println("Apolice numero: " + seguroDeVida.getNumeroApolice());
        System.out.println("Titular do seguro: " + seguroDeVida.getTitular());
        System.out.println("Valor do seguro: " + seguroDeVida.getValorSeguro());
    }
}
