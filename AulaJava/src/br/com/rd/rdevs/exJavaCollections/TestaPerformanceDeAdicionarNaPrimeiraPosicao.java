package br.com.rd.rdevs.exJavaCollections;

import br.com.rd.rdevs.conta.model.Conta;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {

    public static void main(String[] args) {
        System.out.println("Iniciando...");
        long inicio = System.currentTimeMillis();
        // trocar depois por ArrayList
        List<Integer> teste = new LinkedList<>();
        List<Integer> teste1 = new ArrayList<>();

        for (int i = 0; i < 30000; i++) {
            teste1.add(0, i);
        }
        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo gasto: " + tempo);

        inicio = System.currentTimeMillis();

        for (int i = 0; i < 30000; i++) {
            teste1.get(i);
        }

        fim = System.currentTimeMillis();
        tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo gasto: " + tempo);

    }
}
