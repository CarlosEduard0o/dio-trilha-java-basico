import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        // String alunos [] = {"Carlos", "Eduardo", "Felipe", "Julia"};
        // testandoEstruturaFor(alunos);
        // testandoEstruturaWhile(alunos);
        teste();
    }

    private static void teste() {
        int num = 5, count = 1;
        do {
            num += count;
            System.out.println(num);
        } while (count <= 3);
    }

    private static void testandoEstruturaWhile(String[] alunos) {
        // whileComEstruturaSimples(50);
        whileComEstruturaDoWhile();
    }

    private static void testandoEstruturaFor(String[] alunos) {
        imprimeNomeDosAlunos(alunos);
        imprimeNomeDosAlunosComForEach(alunos);
        imprimeNomeDosAlunosComForComBreak(5);
        imprimeNomeDosAlunosComForComContinue(5);
    }


    private static void imprimeNomeDosAlunos(String[] alunos) {
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }
    }

    private static void imprimeNomeDosAlunosComForEach(String[] alunos) {
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }

    /**
     * Ao detectar o break o resto do for é interrompido
     * @param quantidade
     */
    private static void imprimeNomeDosAlunosComForComBreak(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            if(i == 3)
                break;
            System.out.println(i);    
        }
    }

    /**
     * Ao chegar na condição do continue, nada acontece.
     * Mas diferente do break, as demais iterações são realizadas.
     * @param quantidade
     */
    private static void imprimeNomeDosAlunosComForComContinue(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            if(i == 3)
                continue;
            System.out.println(i);    
        }
    }

    /**
     * Método para retornar um valor 
     * aleatorio entre 2 e 8
     * @return
     */
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }

    /**
     * Método que subtrai valores aleatórios da
     * valor passado como parâmetro até chegar em 0.
     * @param mesada
     */
    private static void whileComEstruturaSimples(double mesada) {
        while (mesada>0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada) 
                valorDoce = mesada;
                
            System.out.println("Doce do valor: " + valorDoce + " R$ adicionado no carrinho");
            mesada = mesada - valorDoce;
            }
            System.out.println("Mesada: " + mesada);
            System.out.println("Joãozinho gastou toda a sua mesada em doces");
        }
    

    /**
     * Faça enquanto...O Do While testa a condição após
     * executar o bloco, enquanto o while simples testa antes.
     * Ou seja, com Do While o bloco será executado ao menos 1 vez
     */
    private static void whileComEstruturaDoWhile() {
        System.out.println("Discando...");
        do {
           System.out.println("Telefone tocando");
        } while (tocando());
            System.out.println("Alô !!!");
    }

    /**
     * atendeu recebe true quando o valor aleatorio
     * gerado for igual a 1. Caso contrário fica
     * recebendo false. Quando atender = false,
     * retorna que o telefone parou de tocar,
     * pois atendeu.
     * @return
     */
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Adendeu? " + atendeu);
        //negando o ato de continuar tocando
        return !atendeu;
    }
}