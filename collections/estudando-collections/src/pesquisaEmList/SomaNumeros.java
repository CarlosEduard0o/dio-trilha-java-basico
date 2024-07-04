package pesquisaEmList;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class SomaNumeros {
    List <Integer> valoresInteiros;

    public SomaNumeros() {
        this.valoresInteiros = new ArrayList<>();
    }
    
    public void adicionarNumero(int numero){
        valoresInteiros.add(numero);
    }

    public void calcularSoma(){
        int resultado = 0;
        if(!valoresInteiros.isEmpty()){
            for (Integer valor : valoresInteiros) {
                resultado += valor;
            }
        }
        System.out.println("A soma dos valores é: " + resultado);
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!valoresInteiros.isEmpty()){
            for (Integer valor : valoresInteiros) {
                if (valor >= maiorNumero) {
                    maiorNumero = valor;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!valoresInteiros.isEmpty()){
            for (Integer valor : valoresInteiros) {
                if (valor <= menorNumero) {
                    menorNumero = valor;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A list está vazia!");
        }
    }

    public void exibirNumeros(){
        if(!valoresInteiros.isEmpty()){
            System.out.println(this.valoresInteiros);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
}
