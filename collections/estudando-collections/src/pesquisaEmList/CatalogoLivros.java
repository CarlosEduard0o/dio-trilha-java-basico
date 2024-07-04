package pesquisaEmList;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List <Livro> catalogoLivros;

    public CatalogoLivros() {
        this.catalogoLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        catalogoLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List <Livro> listaLivrosEncontrados = new ArrayList<>();
        if (!catalogoLivros.isEmpty()) {
            for (Livro livro : catalogoLivros) {
                if (livro.getAutor().equals(autor)) {
                    listaLivrosEncontrados.add(livro);
                }
            }
        }
        return listaLivrosEncontrados;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List <Livro> listaLivrosEncontrados = new ArrayList<>();
        if(!catalogoLivros.isEmpty()){
            for (Livro livro : catalogoLivros) {
                if (livro.getAnoPublicacao() >= anoFinal && livro.getAnoPublicacao() <= anoFinal) {
                    listaLivrosEncontrados.add(livro);
                }
            }
        }
        return listaLivrosEncontrados;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroEncontrado = null;
        if (!catalogoLivros.isEmpty()) {
            for (Livro livro : catalogoLivros) {
                if (livro.getTitulo().equals(titulo)) {
                    livroEncontrado = livro;
                }
            }
        }
        return livroEncontrado;
    }
}
