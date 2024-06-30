/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos;

/**
 *
 * @author Sylvester Roshan
 */
public class Node {

    public ProductModel product;
    Node next;
    int BCId;
    
    public Node(ProductModel product){
        this.product= product;
        this.next= null;
        
    }

    
    

    public ProductModel getProduct() {
        return product;
    }

    public void setProduct(ProductModel product) {
        this.product= product;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    
    
}
    


