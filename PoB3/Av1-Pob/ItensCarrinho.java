package Av1;



public class ItensCarrinho {
    private int idProduto;
    private int Quantidade;
    private int Total;
       
        
        
    
public ItensCarrinho( int idProduto, int Quantidade, int Total) {
    super();
    this.idProduto = idProduto;
    this.Quantidade = Quantidade;
    this.Total = Total;
}

    public  int getidProduto() {
        return idProduto;
    }
   public  int getQuantidade() {
   
   return Quantidade;
   
   }
   public int getTotal() {
	   
	   return Total;
   }

 
    
    
    public String toString() {
        return "idProduto " + idProduto + "\nid: " + Quantidade + "\n Valor: " + Total;
    }
}
