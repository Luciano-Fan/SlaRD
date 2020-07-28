package br.com.rd.rdevs.exJavaLang;

public class ExJavaLang {

    public static void main(String[] args) {

        String testeString = "Exemplo de String";
        int quantidadeChars = testeString.length();

        boolean vazio = testeString.isEmpty();

        String[] split = testeString.split(" ");

        System.out.println(" Vazio: " + vazio + " Contains: " + testeString.contains("String") + " Quantidade de caracteres: " + quantidadeChars );

        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        //Ex2
        for (int i = 0; i < testeString.length(); i++) {
            System.out.println(testeString.charAt(i));
        }
        //Ex3
        String ex3 = "Socorram-me, subi no ônibus em Marrocos";

        for (int i = ex3.length() -1 ; i >= 0 ; i--) {
            System.out.println(ex3.charAt(i));
        }
        //Ex4
        String valor = "123";
        int valorFinal = 0;
        int incremento = 1;

        for (int i = 0; i < valor.length() -1; i++) {
            incremento*=10;
        }

        for (int i = 0 ; i < valor.length(); i++,incremento/=10) {
            valorFinal += (valor.charAt(i)-'0') * incremento;
        }
        System.out.println(valorFinal);

    }

}
