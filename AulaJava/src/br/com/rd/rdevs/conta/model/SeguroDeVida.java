package br.com.rd.rdevs.conta.model;

public class SeguroDeVida implements Tributavel {
    private double valorSeguro;
    private double taxa;
    private int numeroApolice;
    private String titular;

    public SeguroDeVida(String titular, int numeroApolice, double valorSeguro) {
        this.valorSeguro = valorSeguro;
        this.numeroApolice = numeroApolice;
        this.titular = titular;
    }

    public int getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
            this.valorSeguro = valorSeguro;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public double getValorImposto() {
        return taxa + valorSeguro;
    }
}
