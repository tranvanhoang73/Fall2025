

package com.example.fall2025;

import java.util.Scanner;

public class Fall2025 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
//        LinearSearch ln = new LinearSearch(10);
//        ln.addArray();
//        ln.showArray();
//        int k = ln.find(5);
//        if(k>=0)
//            System.out.println("5 found at " + k);
//        else System.out.println("5 not found.");

//        CountLW lw = new CountLW("");
//        System.out.println("binary of 8 is : " + lw.convertToBinary(8));
//        System.out.println("Hexa of 18 is : " + lw.convertToHexa(18));

          Scanner sc = new Scanner(System.in);
          System.out.println("Nhap so: ");
          double so = sc.nextDouble();
          Calculator1 cl = new Calculator1(so);
          while(true){
                System.out.println("Nhap operator: ");
                char op = sc.next().charAt(0);
                if(op =='='){
                    System.out.println("kq = " +cl.getMemory() );
                    break;
                }
                 System.out.println("Nhap so: ");
                 double so2 = sc.nextDouble();
                 cl.calculater(so2, op);
                 System.out.println(" kq = " + cl.getMemory());
           
          }
          sc.close();
          

 
    }
}
