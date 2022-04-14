/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategydesignpattern;

/**
 * Ref: refactoring.guru/design-patterns/strategy/
 * 
 * @author MoaathAlrajab
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
    
}
