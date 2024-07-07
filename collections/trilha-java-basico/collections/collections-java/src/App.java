import java.util.ArrayList;

import list.OperacoesBasicas.CarrinhoCompras.CarrinhoDeCompras;
import list.OperacoesBasicas.ListaTarefas.ListaTarefas;

public class App {
    public static void main(String[] args) throws Exception {
        // listaTarefas();
        CarrinhoCompras();
        
    }

    private static void listaTarefas() {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println(listaTarefas.obterNumeroTotalDeTarefas());
        listaTarefas.adicionarTarefa("Pagar Contas");
        listaTarefas.adicionarTarefa("Pagar Contas");
        listaTarefas.adicionarTarefa("Fazer compras");
        listaTarefas.adicionarTarefa("Capinar lote");
        listaTarefas.adicionarTarefa("Encher o tanque do carro");
        System.out.println(listaTarefas.obterNumeroTotalDeTarefas());

        listaTarefas.removerTarefa("Pagar Contas");
        System.out.println(listaTarefas.obterNumeroTotalDeTarefas());
        listaTarefas.obterDescricoesTarefas();
    }

    private static void CarrinhoCompras() {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
    }
}
