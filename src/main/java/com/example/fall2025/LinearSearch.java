package com.example.fall2025;

import java.util.Random;
public class LinearSearch { 
   private int[]  array;

   public LinearSearch(int n) {
        this.array = new int[n];
    }
    
   public void addArray(int m){
       Random  random = new Random();
       for(int i = 0; i<=array.length-1;i++){
           this.array[i] = random.nextInt(m);
       }
    }
   
   public void showArray(){    
        for(int i = 0; i<=array.length-1;i++){
            System.out.print(" " + this.array[i]);
        }
        System.out.println("");
   }
   
   public int find(int x){   
       for(int i = 0; i<=array.length-1;i++){
           if(x == this.array[i])
               return i;
        }  
       return -1;       
   }
    
}
