/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos;

import java.util.Scanner;


/**
 *
 * @author Sylvester Roshan
 */
public class ProductList {
    private Node head,tail;
    private Object temp;
    
    public ProductList(){
        this.head=this.tail=null;
    }

    public Node getHead() {
        return head;
    }
    
    
            
    public boolean isEmpty(){
        return this.head==null;
    }
    
    
    
    public void insertsort(int bcId, String name, int price, int qty ){
        
        
        Node current = head;
        Node temp= null;
        ProductModel newProductModel = new ProductModel(bcId, name, price, qty, price*qty);
        Node newnode= new Node(newProductModel);  
        
        if(head==null)
        {
            newnode.next= head;
            head= newnode;
        }else if(head.getProduct().getBCId() >= newnode.getProduct().getBCId()){
            newnode.next=head;
            head=newnode;
        }else{
           while(current!=null&&current.getProduct().getBCId() < newnode.getProduct().getBCId()){
                temp= current;
                current= current.next;
           }
            newnode.next= current;
            temp.next= newnode;
        }
    }
    
    
    public void insertProduct(){
        
       Scanner in = new Scanner(System.in);
       Scanner inStr= new Scanner(System.in);
        
        System.out.println("Enter Barcode ID");
        int id= in.nextInt();
        System.out.println("Enter Product Name");
        String name= inStr.nextLine();
        System.out.println("Enter Product Price");
        int price= in.nextInt();
        System.out.println("Enter the quantity");
        int qty= in.nextInt();   
        insertsort(id, name, price, qty);
        
    }
    
    
    
    public void addNewProduct(ProductModel newProduct){
        if (isEmpty()){
            this.head=this.tail=new Node(newProduct);
            return;
        }
        Node newNode=new Node (newProduct);
        this.tail.setNext(newNode);
        this.tail= newNode;
    }
    
    public void showListOfProducts(){
        Node selectedNode=this.head;
        while(selectedNode!=null){
            System.out.println(selectedNode.getProduct().getBCId() + "              -  " + selectedNode.getProduct().getItemName() + "        -    " + selectedNode.getProduct().getItemPrice()+ "           -    " + selectedNode.getProduct().getItemQty()+"             -  "+ selectedNode.getProduct().getItemTot());
      
            selectedNode=selectedNode.getNext();
        }
          
}
    public void addManyProducts(ProductModel...listOfProducts){
        for (ProductModel newProduct: listOfProducts){
        addNewProduct(newProduct);
    }
    }
    
    //    
    
    public boolean searchProducts(String selectedItemName){
        boolean isFound= false;
        Node selectedNode = this.head;
        while(selectedNode !=null){
            if (selectedNode.getProduct().getItemName().contains(selectedItemName)){
                System.out.println(selectedNode.getProduct().getBCId() + " - " + selectedNode.getProduct().getItemName() + " - " + selectedNode.getProduct().getItemPrice() + " - " + selectedNode.getProduct().getItemQty()+"  -  "+ selectedNode.getProduct().getItemTot() );
                isFound=true;
            }
            selectedNode= selectedNode.getNext();
        }
        if(!isFound){
                 return false;
        }
        return true;
        
    }
    
    public boolean updateSelectedProduct(int selectedId){
        Scanner scanner = new Scanner(System.in);
        Node selectedNode = this.head;
        while(selectedNode !=null){
            if(selectedNode.getProduct().getBCId()==selectedId){
               String newItemName;
                //
                
               int newBCId, newItemPrice, newItemQty;
                //
                
                System.out.println("Enter Product Details");
                System.out.println("Enter Barcode ID");
                newBCId= scanner.nextInt();
                scanner.nextLine();
                //
            
                System.out.println("Enter Item Name");
                newItemName= scanner.nextLine();
                //
                
                System.out.println("Enter Price");
                newItemPrice=scanner.nextInt();
                scanner.nextLine();
                //
                System.out.println("Enter Quantity");
                newItemQty=scanner.nextInt();
                scanner.nextLine();
                //
                
                selectedNode.getProduct().setBCId(newBCId);
                selectedNode.getProduct().setItemName(newItemName);
                selectedNode.getProduct().setItemPrice(newItemPrice);
                selectedNode.getProduct().setItemQty(newItemQty);
                 return true;
            }
            selectedNode= selectedNode.getNext();
        }
        scanner.close();
        return false;
    }
  
    
    
    // alternate
    public boolean deleteSelectedProduct(int data){
     Node selectedNode= this.head;
     if (this.head.getProduct().getBCId()== data){
         this.head= this.head.getNext();
         return true;
     }
     
     
     while (selectedNode !=null){
     if(selectedNode.getProduct().getBCId()==data){
         selectedNode.setNext(selectedNode.getNext());
         return true;
     }   
     selectedNode= selectedNode.getNext();
     }
     return false;
    }
    
  
    
    
    public void deleteproduct(){
       Scanner in = new Scanner(System.in);
       if (head== null){
           System.out.println("No record of Products");
       }else{
           System.out.println("Enter the id you want to delete");
           int n= in.nextInt();
           delete(n);
       }
        }   

    public void delete(int data) {
        Node current= head;
        Node temp= null;
        
        if(current.product.bcId==data){
            System.out.println("deleted sucessfully");
            head= head.next;
        }else{
            while(current!=null && current.product.bcId!=data)
            {
                temp= current;
                current= current.next;
            }   
            if (current==null){
                System.out.println("Id not found");
            }else{
                System.out.println("deleted");
                temp.next= current.next;
                current=null;
            }
        }
    }
    
    public void tot(){
        
        
        Node current = head;
        temp=null;
        int num1= current.product.itemPrice;
        int num2=current.product.itemPrice;
        int nextNum;
        int lengthOfSeries;
        System.out.println("Enter length of the series");

        Scanner scan = new Scanner(System.in);
        lengthOfSeries=scan.nextInt();
        scan.close();

        for (int i=0; i<lengthOfSeries;i++){
            System.out.println(num1);
            nextNum= num1+num2;
            num1=num2;
            num2=nextNum;
        }
    }
  
   public boolean FilterProduct_unitprice(int unitprice){
        boolean isFound= false;
        Node selectedNode = this.head;
        while(selectedNode !=null){
            if (selectedNode.getProduct().getItemPrice()> unitprice){
                System.out.println(selectedNode.getProduct().getBCId() + " - " + selectedNode.getProduct().getItemName() + " - " + selectedNode.getProduct().getItemPrice() );
                isFound=true;
            }
            selectedNode= selectedNode.getNext();
        }
        if(!isFound){
                 return false;
        }
        return true;
        
    
   }
   
   
    public boolean FilterProduct_totprice(int totprice){
        boolean isFound= false;
        Node selectedNode = this.head;
        while(selectedNode !=null){
            if (selectedNode.getProduct().getItemTot()>totprice){
                System.out.println(selectedNode.getProduct().getBCId() + " - " + selectedNode.getProduct().getItemName() + " - " + selectedNode.getProduct().getItemTot() );
                isFound=true;
            }
            selectedNode= selectedNode.getNext();
        }
        if(!isFound){
            throw new NullPointerException("ID NOT FOUND");
                 
        }
        return true;
        
    
    
   }
    
    
    public int bill(int bcid){
        boolean isFound= false;
        int tot = 0;
        Node selectedNode = this.head;
        while(selectedNode !=null){
            if (selectedNode.getProduct().getBCId()== bcid){
                
                tot+= selectedNode.getProduct().getItemPrice() * selectedNode.getProduct().getItemQty();
                isFound=true;
            }
            selectedNode= selectedNode.getNext();
        }
        if(!isFound){
            System.out.println("ID NOT FOUND");
            
                 return 0;
        }
        System.out.println("TOTAL OF -- " + bcid);
        return tot;
        
    
   }
    
    
    
    
}
    
   
