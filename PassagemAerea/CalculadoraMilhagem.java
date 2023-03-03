package PassagemAerea;

public class CalculadoraMilhagem {

    private Voo vooMilhas;

    public long calcularCustoEmMilhas(Voo trecho) {

        long calcular = (long) trecho.getPrecoBase() * 10;
        return calcular;
    }

    public long calcularMilhasGanhas(Voo trecho) {

        long calcular = (long) trecho.getPrecoBase() * 2;

        return calcular;
    }

    public Voo getVooMilhas() {
        return vooMilhas;
    }

    public void setVooMilhas(Voo vooMilhas) {
        this.vooMilhas = vooMilhas;
    }

}
