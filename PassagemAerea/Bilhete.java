package PassagemAerea;

public class Bilhete {

    private Passageiro passageiroBilhete;
    private Reserva reservaBilhete;
    private Voo vooBilhete;
    private Assento assentoBilhete;

    public Bilhete(Reserva reserva, Assento assento) {

        this.reservaBilhete = reserva;
        this.assentoBilhete = assento;

    }

    public Passageiro getPassageiroBilhete() {
        return passageiroBilhete;
    }

    public void setPassageiroBilhete(Passageiro passageiroBilhete) {
        this.passageiroBilhete = passageiroBilhete;
    }

    public Reserva getReservaBilhete() {
        return reservaBilhete;
    }

    public void setReservaBilhete(Reserva reservaBilhete) {
        this.reservaBilhete = reservaBilhete;
    }

    public Voo getVooBilhete() {
        return vooBilhete;
    }

    public void setVooBilhete(Voo vooBilhete) {
        this.vooBilhete = vooBilhete;
    }

    public Assento getAssentoBilhete() {
        return assentoBilhete;
    }

    public void setAssentoBilhete(Assento assentoBilhete) {
        this.assentoBilhete = assentoBilhete;
    }

    @Override
    public String toString() {
        return "Reserva = " + reservaBilhete + ", Assento = " + assentoBilhete + '}';
    }

}
