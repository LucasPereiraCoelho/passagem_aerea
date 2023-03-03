package PassagemAerea;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Cidades
        Cidade palhoca = new Cidade(3, "Palhoça", 1224, "Brasil");
        Cidade saoJose = new Cidade(2, "São José", 1111, "Brasil");

        //Voo
        Voo voo1 = new Voo(1, 1, "01/01/2023", 100, 10, palhoca, saoJose);

        //Cartao
        CartaoFidelidade cartao1 = new CartaoFidelidade("13344", 10, CategoriaCartao.GOLD);

        //FormaPagamento
        FormaPagamento cartaoCredito = new FormaPagamento();
        FormaPagamento descontoCarteira = new FormaPagamento();
        FormaPagamento programaMilhagem = new FormaPagamento();

        //Passageiro
        Passageiro lucas = new Passageiro("Lucas", "Pereira", false, cartao1);

        //Reserva
        Reserva reservaVooPendente = new Reserva(1, 5, 7, lucas, StatusReserva.EM_ABERTO, cartaoCredito, voo1);

        //ReservaConfirmada
        Reserva reservaVooConfirmada = new Reserva(1, 5, 7, lucas, StatusReserva.CONFIRMADA, cartaoCredito, voo1);

        //Aeronave
        Aeronave tam1 = new Aeronave(100, "TAManho familia", 12, "TAM");

        //Assento
        Assento assento1 = new Assento("J24");

        //Categoria
        Categoria primeiraClasse = new Categoria("Primeira Classe", 15);
        Categoria economica = new Categoria("Economica", 10);

        List<Categoria> catEconomicaAssentos = new ArrayList<>();
        List<Categoria> catPrimeiraClasse = new ArrayList<>();

        catPrimeiraClasse.add(primeiraClasse);

        //Bilhete
        Bilhete bilhete1 = new Bilhete(reservaVooConfirmada, assento1);

        assento1.setCategoriaAssentos(catPrimeiraClasse);

        System.out.println("Passegeiro " + lucas.getNome());
        System.out.println(bilhete1.toString());

    }

}
