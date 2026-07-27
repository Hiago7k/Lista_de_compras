package Models;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Pagamento  {
    private String nome;
    private  Compras compra;
    List<Compras> listaDeCompras = new ArrayList<>();


    public void adicionaComprasNalista(Compras compra){
        listaDeCompras.add(compra);
    };



}
