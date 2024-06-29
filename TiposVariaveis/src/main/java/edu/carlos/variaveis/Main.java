package edu.carlos.variaveis;

import edu.carlos.variaveis.smarttv.SmartTv;

public class Main {
    public static void main(String[] args) {
        //Criando uma constante (não pode ser alterada graças ao final)
        final double VALOR_DE_PI = 3.14;
        //Neste caso, a operação de soma é deixado de lado e passa a ser realizado a operação de concatenação
        System.out.println(1+"2"+1);
        testesComOperadoresTernarios();
        smartTV();
    }

    private static void smartTV() {
        SmartTv smartTv = new SmartTv(false, 11, 23);
        System.out.println(smartTv.ligarTv());
        System.out.println(smartTv.subirCanal());
        System.out.println(smartTv.aumentarVolume());
        System.out.println(smartTv.diminuirCanal());
        System.out.println(smartTv.diminuirVolume());
        smartTv.mudarCanal(17);
        System.out.println(smartTv.desligarTv());
    }

    private static void testesComOperadoresTernarios() {
        int a, b;
        a = 5;
        b = 5;
        if (a==b){
            System.out.println("Igual");
        }
        else {
            System.out.println("Diferente");
        }

        //O mesmo, só que de maneira abreviada:
        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        //Abaixo, se a condição for verdadeira retorna 1, se for falsa retorna 0
        int resultadoInt = a == b ? 1 : 0;
        System.out.println(resultadoInt);
    }
}