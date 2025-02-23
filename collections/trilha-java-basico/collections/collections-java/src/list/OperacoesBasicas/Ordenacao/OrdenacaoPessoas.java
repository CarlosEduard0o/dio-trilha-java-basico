package list.OperacoesBasicas.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listPessoa;

    public OrdenacaoPessoas() {
        this.listPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.listPessoa.add(new Pessoa("Carlos", 25, 1.81));
    }

    public List<Pessoa> ordenarPorIdade() {
        // Colocando todos elementos de listPessoa para
        // pessoaPorIdade
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listPessoa);
        if (!listPessoa.isEmpty()) {
          Collections.sort(pessoasPorIdade);
          return pessoasPorIdade;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
      }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listPessoa);
        if (!listPessoa.isEmpty()) {
          Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
          return pessoasPorAltura;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
      }


    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        // Adicionando pessoas à lista
        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

        // Exibindo a lista de pessoas adicionadas
        System.out.println(ordenacaoPessoas.listPessoa);

        // Ordenando e exibindo por idade
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        // Ordenando e exibindo por altura
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
