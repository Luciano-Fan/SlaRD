package br.com.rd.rdevs.conta.model;

public abstract class Conta implements Comparable <Conta>{
    private static int identificador = 0;
    private int numero;
    private String titular;
    private double saldo;
    private double limite;
    private String agencia;
    private String dataDeAbertura;
    private Conta tipoConta;

    public Conta() {
        this.identificador+=1;
    }

    public Conta (double saldo){
        this.identificador+=1;
        this.saldo = saldo;
    }
    public Conta(String titular) {
        this.titular = titular;
        this.identificador+=1;
    }

    public Conta(int numero, String titular, double saldo, double limite, String agencia, String dataDeAbertura) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
        this.agencia = agencia;
        this.dataDeAbertura = dataDeAbertura;
    }

    public Conta(int numero, String titular, double saldo, double limite, String agencia, String dataDeAbertura, Conta tipoConta) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
        this.agencia = agencia;
        this.dataDeAbertura = dataDeAbertura;
        this.identificador+=1;

        if(tipoConta instanceof ContaCorrente){
            ContaCorrente conta = new ContaCorrente();
            this.tipoConta = conta;
        }else {
            ContaPoupanca conta = new ContaPoupanca();
            this.tipoConta = conta;
        }

    }

    public abstract Conta getTipoConta() ;

    public void setTipoConta(Conta conta) {
        this.tipoConta = new ContaPoupanca();
    }

    public static int getIdentificador() {
        return identificador;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getDataDeAbertura() {
        return dataDeAbertura;
    }

    public abstract boolean sacar(double valorSacado);

    public boolean depositar(double valorDepositado){

            if (valorDepositado > 0){
                    this.saldo += valorDepositado;
                    return true;
            }else {
                throw new IllegalArgumentException("Valor depositado menor ou igual a zero");
            }
    }

    public boolean transferir (Conta contaAlvo, double valorTransferido){

        if(valorTransferido > 0 && this.saldo > valorTransferido){

            this.saldo -= valorTransferido;
            contaAlvo.saldo += valorTransferido;
            return true;

        }else {
            return false;
        }
    }
    public double calcularRendimento(){
        return this.saldo * 0.1;
    }
    public void recuperarDadosParaImpressao(){

        System.out.println("Titular da conta: " + this.titular);
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Data de abertura: " + this.dataDeAbertura);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Saldo da conta: " + this.saldo);
        System.out.println("Limite da conta: " + this.limite);
        System.out.println("Rendimento da conta: " + this.calcularRendimento() + "\n");

    }


    @Override
    public int /*umaConta*/ compareTo(Conta outraConta) {

        return this.titular.compareTo(outraConta.titular);
    }

}
