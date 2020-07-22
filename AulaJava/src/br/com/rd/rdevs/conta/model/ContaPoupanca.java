package br.com.rd.rdevs.conta.model;

public class ContaPoupanca extends Conta {

    private ContaPoupanca tipoConta;

    public ContaPoupanca (){
    }

    public ContaPoupanca(int numero, String titular, double saldo, double limite, String agencia, String dataDeAbertura) {
        super(numero, titular, saldo, limite, agencia, dataDeAbertura);
    }

    public ContaPoupanca(int numero, String titular, double saldo, double limite, String agencia, String dataDeAbertura, ContaPoupanca tipoConta) {
        super(numero, titular, saldo, limite, agencia, dataDeAbertura, tipoConta);
        this.tipoConta = tipoConta;
    }

    @Override
    public Conta getTipoConta() {
        return tipoConta;
    }

    @Override
    public boolean sacar(double valorSacado) {

            if(valorSacado <= 0){
                throw new IllegalArgumentException("Valor sacado nao permitido");
            }else if (getSaldo() < valorSacado){
                throw new SaldoInsuficienteException("Valor sacado nao permitido");
            }else{
                this.setSaldo(this.getSaldo() - valorSacado);
                return true;
            }

    }
    @Override
    public String toString() {
        return "Tipo da Conta = Poupanca";
    }

}
