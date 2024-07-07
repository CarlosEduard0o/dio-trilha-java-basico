package list.OperacoesBasicas.ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefasList;

    public ListaTarefas() {
        this.tarefasList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefasList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemovidas = new ArrayList<>();
        if (!tarefasList.isEmpty()) {
            for (Tarefa tarefa : tarefasList) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasRemovidas.add(tarefa);                    
                }
            }
            tarefasList.removeAll(tarefasRemovidas);
        }
    }

    public int obterNumeroTotalDeTarefas(){
        return tarefasList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefasList);
    }
}
