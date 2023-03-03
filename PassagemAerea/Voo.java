package PassagemAerea;

import java.util.ArrayList;
import java.util.List;

public class Voo {

    private int numero;
    private int duracao;
    private String date;
    private double precoBase;
    private int milhas;
    private Cidade origem;
    private Cidade destino;
    private List<Aeronave> aeronaves;

    public Voo(int numero, int duracao, String date, double precoBase, int milhas, Cidade origem, Cidade destino) {
        this.numero = numero;
        this.duracao = duracao;
        this.date = date;
        this.precoBase = precoBase;
        this.milhas = milhas;
        this.origem = origem;
        this.destino = destino;
        this.aeronaves = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public int getMilhas() {
        return milhas;
    }

    public void setMilhas(int milhas) {
        this.milhas = milhas;
    }

    public Cidade getOrigem() {
        return origem;
    }

    public void setOrigem(Cidade origem) {
        this.origem = origem;
    }

    public Cidade getDestino() {
        return destino;
    }

    public void setDestino(Cidade destino) {
        this.destino = destino;
    }

    public List<Aeronave> getAeronaves() {
        return aeronaves;
    }

    public void setAeronaves(List<Aeronave> aeronaves) {
        this.aeronaves = aeronaves;
    }

    @Override
    public String toString() {
        return "{Origem = " + origem + ", Destino = " + destino + '}';
    }

}
