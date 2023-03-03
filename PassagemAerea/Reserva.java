package PassagemAerea;

public class Reserva {

    private int codigo;
    private int data;
    private int dataLimite;
    private Passageiro passageiro;
    private StatusReserva status;
    private FormaPagamento formaPagamento;
    private Voo voo;

    public Reserva(int codigo, int data, int dataLimite, Passageiro passageiro, StatusReserva status, FormaPagamento formaPagamento, Voo voo) {
        this.codigo = codigo;
        this.data = data;
        this.dataLimite = dataLimite;
        this.passageiro = passageiro;
        this.status = status;
        this.formaPagamento = formaPagamento;
        this.voo = voo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(int dataLimite) {
        this.dataLimite = dataLimite;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public StatusReserva getStatus() {
        return status;
    }

    public void setStatus(StatusReserva status) {
        this.status = status;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        return "Código = " + codigo + ", Data = " + data + ", DataLimite = " + dataLimite + ", Status = " + status + ", Voo = " + voo;
    }

}
