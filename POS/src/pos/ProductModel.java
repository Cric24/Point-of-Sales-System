/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos;

/**
 *
 * @author Sylvester Roshan
 */
public class ProductModel {
    
    
    //Student id method
    public int bcId;
   //student name method
    private String itemName;
    //srudent age method
    public int itemPrice;
    //quantity method
    private int itemQty;
    //Total method
    public int itemTot;
    //Full Total method
   
   
    
    public ProductModel(int bcId, String itemName, int itemPrice, int itemQty, int itemTot) {
        this.bcId = bcId;
        this.itemName = itemName;
        this.itemPrice = itemPrice ;
        this.itemQty= itemQty;
        this.itemTot= itemTot;
        
     
        
    }

    public int getBCId() {
        return bcId;
    }

    public void setBCId(int bcId) {
        this.bcId = bcId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice= itemPrice  ;
    }
    
   public int getItemQty(){
       return itemQty;
   }
   
   public void setItemQty(int itemQty){
       this.itemQty=itemQty;
   }
   
   public int getItemTot(){
       this.itemTot= itemPrice * itemQty;
       return itemTot;
   }
    
   public void setItemTot(int itemTot){
       this.itemTot= itemTot;
      
   }
  
   
}
    

