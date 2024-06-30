/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pos;

import java.util.Scanner;

/**
 *
 * @author Sylvester Roshan
 */
public class POS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        ProductList listOfProducts= new ProductList();
        int option;
        Scanner scanner = new Scanner (System.in);
        String isContinue= "yes";
        
        
        
        boolean exit= false;
        do  {
            
            System.out.println(" 1. INSERT PRODUCT DETAILS ");
            System.out.println(" 2. SHOW PRODUCT DETAILS ");
            System.out.println(" 3. SEARCH DETAILS");
            System.out.println(" 4. DELETE DETAILS ");
            System.out.println(" 5. UPDATE DETAILS ");
            System.out.println(" 6. FILTER BY UNIT PRICE");
            System.out.println(" 7. FILTER BY TOTAL PRICE");
            System.out.println(" 8. CALCULATE TOTAL");
            System.out.println(" 9. SORT UNIT PRICE");
            System.out.println(" 10. EXIT ");
        
            System.out.println("CHOOSE NUMBER");
            option=scanner.nextInt();
            scanner.nextLine();
            switch (option){
               case 11: 
                   String newItemName;
                   //
                
                   int newBCId, newItemPrice, newItemQty, newItemTot = 0;
                   //
                
                   System.out.println("Enter Details");
                   System.out.println("Enter Barcode Id");
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
                   newItemQty= scanner.nextInt();
                   scanner.nextLine();
                
                   ProductModel newProduct= new ProductModel(newBCId, newItemName, newItemPrice, newItemQty,newItemTot);
                   //
                
                   System.out.println("Inserted Successfully");
                   listOfProducts.addNewProduct(newProduct);
                
                   break;

                case 2:
                   //
                   System.out.println("BARCODE ID        ITEM NAME      ITEM PRICE        ITEM QUANTITY     TOTAL");
                   listOfProducts.showListOfProducts();
                   break;
                   
               
                case 3: 
                    //
                   
                    String inputItemName;
                    System.out.println("ENTER ITEM NAME");
                    inputItemName = scanner.nextLine();
                    boolean isFound = listOfProducts.searchProducts(inputItemName);
                    if(!isFound){
                        System.out.println("Item not Found");
                    }
                            
                   break;
                case 4: 
                    
                   listOfProducts.deleteproduct();
                    
                   break;
                case 5: 
                    
                    int selectedBCId;
                    System.out.println("CHOOSE THE ID YOU WANT TO UPDATE");
                    selectedBCId= scanner.nextInt();
                    scanner.nextLine();
                    boolean isUpdatedSuccessfully= listOfProducts.updateSelectedProduct(selectedBCId);
                    if (!isUpdatedSuccessfully){
                        System.out.println("Item Not Updated ");
                    }
                            
                   break;
                   
                case 6:
                    
                    int selectedprice;
                    System.out.println("ENTER AMOUNT TO FILTER FOR UNIT PRICE ");
                    selectedprice= scanner.nextInt();
                    scanner.nextLine();
                   listOfProducts.FilterProduct_unitprice(selectedprice);
                   break;
                   case 7:
                    
                    int selectedtotprice;
                    System.out.println("ENTER AMOUNT TO FILTER FOR TOTAL PRICE");
                    selectedtotprice= scanner.nextInt();
                    scanner.nextLine();
                   listOfProducts.FilterProduct_totprice(selectedtotprice);
                   break;
                   case 8:
                       System.out.println("ENTER THE BAR CODE ID TO CALCULATE");
                       newBCId= scanner.nextInt();
                       scanner.nextLine();
                       
                      System.out.println(listOfProducts.bill(newBCId));
                       break;
                   case 9:
                       sort s = new sort();
                       s.selectionsort(listOfProducts);
                       break;
                   case 1:
                       listOfProducts.insertProduct();
                       break;
                case 10:
                    
                    exit=true;
                   break;
                default:
                   System.out.println("");
                   break;
            } 
            if (exit){
                break;
            }
            System.out.println("Do you want to Proceed Again? (yes/no)");
            isContinue= scanner.nextLine();
        } while(isContinue.equals("yes") || isContinue.equals("YES"));
        
        
        
       
        
        System.out.println("#######################################################");
        System.out.println("      THANK YOU FOR USING POINT OF SALES SYSTEM      ");
        System.out.println("#######################################################");
        scanner.close();
        
     
        
        
        
    }  
}
