//kj
package com.example.fall2025;

public class Calculator {
    
    private double memory;

    public Calculator(double memory) {
        this.memory = memory;
    }

    public double getMemory() {
        return memory;
    }
    
    public void calculator(double number, char operator){      
        switch(operator){
            case('+'):
                memory+=number;
                break;
            case('-'):
                memory-=number;
                break;
            default:
                System.out.println("Unsupported operator: " + operator);         
        } 
    }
    
    
    
}
