import model.Iphone;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {
        AparelhoTelefonico aparelhoTelefonico = new Iphone();
        NavegadorInternet navegadorInternet = new Iphone();
        ReprodutorMusical reprodutorMusical = new Iphone();

        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
        aparelhoTelefonico.ligar("35998788987");

        navegadorInternet.exibirPagina("www.youtube.com.br");
        navegadorInternet.atualizarPagina();
        navegadorInternet.adicionarNovaAba();

        reprodutorMusical.selecionarMusica("War - Filipe Ret");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
    }
}