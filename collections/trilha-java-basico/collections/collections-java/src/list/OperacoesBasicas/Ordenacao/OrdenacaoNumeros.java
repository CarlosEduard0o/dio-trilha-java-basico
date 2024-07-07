package list.OperacoesBasicas.Ordenacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoNumeros {
    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList();
    }

    public void adicionarNumero(Integer numero) {
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> listaAux = new ArrayList<>(numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(listaAux);
            return listaAux;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> listaAux = new ArrayList<>(numerosList);
        if (!numerosList.isEmpty()) {
            listaAux.sort(Collections.reverseOrder());
            return listaAux;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }
}
