
package prjpedidos;

import java.util.ArrayList;
import java.util.List;


public class Pedido {
    public int numPedido;
    public String data;
    public double valorTotal;
    public List<ItemPedido>lista;

  
    public static int numInicial=1;
    
    
    public int gerarNumeroPedido(){
        numInicial+=1; 
        return numInicial;
    }
    
    public Pedido(){
        lista = new ArrayList<>();
    }
}
