package Models;

public class Compras {
    private String descCompra;
    private double limiteCredito;
    private double valorCompra

    public Compras(String descCompra, double limiteCredito, double valorCompra) {
        this.descCompra = descCompra;
        this.limiteCredito = limiteCredito;
        this.valorCompra = valorCompra;
    }

    public String getDescCompra() {
        return descCompra;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    
}
