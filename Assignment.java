/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

enum Level {
    LOW, MEDIUM ,HIGH;
}
public class Assignment {

    
    public static void main(String[] args) {
        Level level = Level.HIGH;
        //System.out.println(level);
        
        switch(level){
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
        
    }
    
}
