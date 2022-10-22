/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletontask;

import java.util.logging.Logger;


public class SingletonTask {
    
    private static final Logger logger = Logger.getLogger(SingletonTask.class.getName());

    
    public static void main(String[] args) {
        
       SingletonTask st = new SingletonTask();
       st.getLogger();
        
    }
    public void getLogger(){
        logger.info("This is my logger");
        System.out.println(logger.getClass());
    }
    
}
