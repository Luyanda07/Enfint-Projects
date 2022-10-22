/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee;

/**
 *
 * @author hp
 */
public class CoffeeFactory {
    
    public CoffeeInterface getInstance(String str){
        if (str.equals("bitter")){
            return new Espresso();
        }else if (str.equals("strong")){
            return new Americano();
          }
        return null;
    }
    
}
