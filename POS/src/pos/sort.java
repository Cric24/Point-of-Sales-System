/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos;

import java.util.Scanner;
import static pos.selectionsort.printArray;

/**
 *
 * @author Sylvester Roshan
 */





public class sort {
    
    public void selectionsort(ProductList unitsort){
      
        
    Scanner scanner = new Scanner (System.in);
    int selectedun;
    System.out.println("HOW MANY UNIT PRICE SHOULD BE SORTED");
    selectedun= scanner.nextInt();
    scanner.nextLine();
        
     int arr[]= new int [selectedun];
     int count =  0;
     Node selectedNode= unitsort.getHead();
     
     while(selectedNode !=null){
            arr[count]= selectedNode.getProduct().getItemPrice();
            
            count++;
           
            selectedNode= selectedNode.getNext();
            
            
        }
        
        for(int i=0; i<arr.length-1; i++){
            
            int smallest=i;
            for(int j=i+1; j<arr.length;  j++)
            {
                if(arr[smallest]>arr[j]){
                    
                    smallest= j;
                }
            }
            
            int temp = arr[smallest];
            arr[smallest]= arr[i];
            arr[i]=temp;
        }
        
        printArray(arr);
    }

    
}
