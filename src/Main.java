import Models.Compras;
import Models.Pagamento;

import java.util.Scanner;

class Main{
    static void main() {
        int ativo = 1;
        Pagamento cartao = new Pagamento();

        Scanner data = new Scanner(System.in);
        System.out.println("******************************************");
        System.out.println("---- Lançamento de Models.Compras no Credito ----");
        System.out.println("******************************************");


        System.out.println("Digite o limite do seu cartão: ");
        double limiteCredito = data.nextDouble();
        System.out.println(limiteCredito);


        while (ativo != 0)
        {
            System.out.println("Digite o valor da compra: ");
            double valorCompra = data.nextDouble();

        System.out.println("Digite a descrição da compra: ");
        String descCompra = data.next();




        System.out.println("Digite 1 para continuar comprando 0 para parar");
        ativo = data.nextInt();

        Compras compra1 = new Compras(descCompra, limiteCredito);

        cartao.adicionaComprasNalista(compra1);

        }

        cartao.exibeComprasDaLista();

    }
}