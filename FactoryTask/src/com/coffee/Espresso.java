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
public class Espresso implements CoffeeInterface {

    @Override
    public void getIngredients() {
        System.out.println("--- Ingredients to make an Espresso --- " +"\n"
                          +"1. 14–18 grams espresso coffee beans" + "\n"
                          +"2. hot or almost boiling water ");
    }
    
}
