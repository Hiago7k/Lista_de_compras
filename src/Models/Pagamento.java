package Models;

public class Pagamento {
    private String cartao;
    private double valor;

    public Pagamento(String cartao, double valor) {
        this.cartao = cartao;
        this.valor = valor;
    }
}
