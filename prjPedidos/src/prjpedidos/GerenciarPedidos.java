package prjpedidos;

import java.util.ArrayList;
import java.util.List;

public class GerenciarPedidos {
    public static List<Produto> listaProduto;
    public static List<Pedido> listaPedidos;

    public static void main(String[] args) {
        listaProduto = new ArrayList<>() ;
        listaPedidos = new ArrayList<>() ;
        
        MenuView menu = new MenuView();
        menu.setVisible(true);
        
        
    }
    
    
    public static void adicionarProduto (Produto produto){
        listaProduto.add(produto);
    }
    
    public static void adicionarPedido (Pedido pedido){
        listaPedidos.add(pedido);
    }
    
}
