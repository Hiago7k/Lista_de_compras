package Models;

public class Compras {
    private String descCompra;
    private double limiteCredito;

    public Compras(String descCompra, double limiteCredito) {
        this.descCompra = descCompra;
        this.limiteCredito = limiteCredito;
    }

    public String getDescCompra() {
        return descCompra;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }
}
