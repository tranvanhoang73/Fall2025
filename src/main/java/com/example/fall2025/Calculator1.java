/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fall2025;

/**
 *
 * @author Admin
 */
public class Calculator1 {
    
   private double memory;

    public Calculator1(double memory) {
        this.memory = memory;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }
    
    public void calculater(double number, char op){
        
        switch(op){
            case '+':
                memory = memory + number;
                break;
            case '-':
                memory = memory - number;
                break;
            default:
                System.out.println("invalid operator.");
                break;
        }
        
    }
    
}
