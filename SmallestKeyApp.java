/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallestkeyapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 *
 * @author hp
 */
public class SmallestKeyApp {

    
    public static void main(String[] args) {
        
        HashMap<Integer, String> smal = new HashMap<>();
        smal.put(6, "Kristina");
        smal.put(3, "Kate");
        smal.put(5, "Alex");
        smal.put(8, "Steve");
                    
        Object obj = Collections.min(smal.keySet());
        
        System.out.println(obj + "=" + smal.get(obj));
        smal.remove(obj);
        System.out.println(smal);
        
    }
    
}
