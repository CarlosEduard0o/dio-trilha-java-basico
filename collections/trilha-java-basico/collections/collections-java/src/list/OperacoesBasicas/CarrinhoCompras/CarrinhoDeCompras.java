package list.OperacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List <Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double preco, int quantidade){
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List <Item> itensARemover = new ArrayList<>();
        if (!itens.isEmpty()) {
            for (Item item : itens) {
                if (item.getNome().equalsIgnoreCase(nome)) {
                    itensARemover.add(item);
                }
            }
        } else {
            System.out.println("Lista vazia");
        }
        itens.removeAll(itensARemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0.0;
        if (!itens.isEmpty()) {
            for (Item item : itens) {
                valorTotal += (item.getPreco()*item.getQuantidade())
            }            
        } else {
            System.out.println("Lista vazia!");
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(itens);
    }
}
