import Models.Compras;
import Models.Pagamento;

import java.util.Scanner;

class Main{
    static void main() {
        Scanner data = new Scanner(System.in);
        System.out.println("******************************************");
        System.out.println("---- Lançamento de Models.Compras no Credito ----");
        System.out.println("******************************************");

        System.out.println("Digite o limite do seu cartão: ");
        double limiteCredito = data.nextDouble();
        System.out.println(limiteCredito);

        System.out.println("Digite a descrição da compra: ");
        String descCompra = data.next();

        Compras compra1 = new Compras(descCompra, limiteCredito);

        Pagamento cartao = new Pagamento();
        cartao.adicionaComprasNalista(compra1);


    }
}