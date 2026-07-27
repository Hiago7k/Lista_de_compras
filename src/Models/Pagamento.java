package Models;

public class Pagamento {
    private String descCompra;
    private double valor;

    public Pagamento(String descCompra, double valor) {
        this.descCompra = descCompra;
        this.valor = valor;
    }

    public void exibeDetalhesCompra(){
        System.out.println(valor);
        System.out.println(descCompra);
    };
}
