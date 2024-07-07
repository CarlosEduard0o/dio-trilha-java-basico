package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    /**
     * O método put do HashMap serve tanto para adicionar
     * elementos ao HashMap quanto para atualizar.
     * @param nome
     * @param telefone
     */
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        // Como o HashMap trabalha com key não é
        // necessário fazer iteração. Ele já vai
        // direto na key. A key é única
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Carlos", 112233);
        agendaContatos.adicionarContato("Eduardo", 223344);
        agendaContatos.adicionarContato("Rosana", 556677);
        agendaContatos.adicionarContato("Ana", 445588);
        agendaContatos.adicionarContato("Julia", 998877);
        agendaContatos.adicionarContato("Benedito", 115566);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Ana");

        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Carlos"));
    }
}