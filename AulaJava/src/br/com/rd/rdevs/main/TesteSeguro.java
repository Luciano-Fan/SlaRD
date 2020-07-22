package br.com.rd.rdevs.main;

import br.com.rd.rdevs.conta.ManipuladorDeSeguroDeVida;

public class TesteSeguro {
    public static void main(String[] args) {
        ManipuladorDeSeguroDeVida manipulador1 = new ManipuladorDeSeguroDeVida(1, "Sla", 100);
        ManipuladorDeSeguroDeVida manipulador2 = new ManipuladorDeSeguroDeVida(2, "aaa", 112);

        manipulador1.mostrarSeguroDeVida();
        System.out.println("-------------------------");
        manipulador2.mostrarSeguroDeVida();

    }
}
