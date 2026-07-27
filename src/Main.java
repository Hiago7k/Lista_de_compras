import Models.Pagamento;

import java.util.Scanner;

class Main{
    static void main() {
        Scanner data = new Scanner(System.in);
        System.out.println("******************************************");
        System.out.println("---- Lançamento de Compras no Credito ----");
        System.out.println("******************************************");

        System.out.println("Digite o limite do seu cartão: ");
        double limiteCredito = data.nextDouble();
        System.out.println(limiteCredito);

        System.out.println("Digite a descrição da compra: ");
        String descCompra = data.next();


        Pagamento cartao = new Pagamento(descCompra, limiteCredito);
        cartao.exibeDetalhesCompra();


    }
}