package model;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    @Override
    public void ligar(String numero) {
        System.out.println("CHAMANDO " + numero);
    }

    @Override
    public void atender() {
        System.out.println("ALÔ");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibe página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualiza página");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada");
    }
}
