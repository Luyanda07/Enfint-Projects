/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionmethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class CollectionMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        populateList(list);
        replaceElement(list);
    }

    private static void replaceElement(ArrayList<Integer> list) {
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter the index of the integer you would like to replace : ");
       int index = input.nextInt();
       System.out.println("Please enter the integer you're replacing it would : ");
       int num = input.nextInt();
       list.set(index, num);
       System.out.println(list);
    }
    
    private static List populateList(ArrayList<Integer> list){
        Scanner input = new Scanner(System.in);
        int value;
        for(int i=0;i<5;i++){
        System.out.print("Enter values to populate list :");
        value = input.nextInt();
        list.add(value);
        
    }
        System.out.println(list);
        return list;
       
    }
    
}
