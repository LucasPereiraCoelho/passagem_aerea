package PassagemAerea;

import java.util.ArrayList;
import java.util.List;

public class Assento {

    private String posicao;
    private List<Categoria> categoriasAssentos;

    public Assento(String posicao) {
        this.posicao = posicao;
        this.categoriasAssentos = new ArrayList<>();
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public List<Categoria> getCategoriaAssentos() {
        return categoriasAssentos;
    }

    public void setCategoriaAssentos(List<Categoria> categoriaAssentos) {
        this.categoriasAssentos = categoriaAssentos;
    }

    @Override
    public String toString() {
        return "Posição = " + posicao + ", Categoria = " + getCategoriaAssentos();
    }

}
