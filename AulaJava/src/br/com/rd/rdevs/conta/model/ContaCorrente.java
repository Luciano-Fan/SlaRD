package br.com.rd.rdevs.conta.model;

public class ContaCorrente extends Conta implements Tributavel{

    private ContaCorrente tipoConta;

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo){
        super(saldo);
    }

    public ContaCorrente(String titular){
        super(titular);
    }
    public ContaCorrente(int numero, String titular, double saldo, double limite, String agencia, String dataDeAbertura) {
        super(numero, titular, saldo, limite, agencia, dataDeAbertura);
    }

    public ContaCorrente(int numero, String titular, double saldo, double limite, String agencia, String dataDeAbertura, ContaCorrente tipoConta) {
        super(numero, titular, saldo, limite, agencia, dataDeAbertura, tipoConta);
        this.tipoConta = tipoConta;
    }

    @Override
    public Conta getTipoConta() {
        return tipoConta;
    }

    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.01;
    }

    @Override
    public boolean sacar(double valorSacado) {


            if(valorSacado <= 0){
                throw new IllegalArgumentException("Valor sacado nao permitido");

            }else if (getSaldo() < valorSacado){
                throw new SaldoInsuficienteException("Valor sacado nao permitido");
            }
            else{
                setSaldo(getSaldo() - valorSacado - 0.1);
                return true;
            }

    }

    @Override
    public String toString() {
        return "Tipo da Conta = Conta Corrente";
    }

}
/**/