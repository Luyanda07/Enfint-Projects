
import com.coffee.CoffeeFactory;
import com.coffee.CoffeeInterface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class CoffeeApp {
    
    public static void main(String []args){
        CoffeeFactory cf = new CoffeeFactory();
        CoffeeInterface obj = cf.getInstance("bitter");
        obj.getIngredients();
    }
    
}
