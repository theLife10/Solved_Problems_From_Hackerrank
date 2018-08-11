import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSort {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        int key;
        int i;
        for(int j=2; j < ar.length; j++){
            key=ar[j];
            i=j-1;
            while(i >= 0 && ar[i] > key){
                ar[i+1]=ar[i];
                printArray(ar);
                i--;
              
            }
           
            ar[i+1]=key;
            
        }
         printArray(ar);
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
       
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}

