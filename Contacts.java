/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Contacts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashMap<String,String> contacts = new HashMap();
     
        int option;
        
        do{
            option = getOption();
        
          switch(option){
            case 1:
                getContacts(contacts);
                break;
            case 2:
                search(contacts);
                break;
            case 3:
                display(contacts);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option ");
              
          }                
        
        }while(option!= 5);
        
    }
    
    private static int getOption(){
        Scanner input = new Scanner(System.in);
        int option;
        System.out.println("=======================================" + "\n"  
                           + "Enter 1 to add a new contact " + "\n"
                           + "Enter 2 to search for a contact " + "\n"
                           + "Enter 3 to display contacts " + "\n"
                           + "Enter 4 to exit ");
        option = input.nextInt();
        return option;
    }
    private static void getContacts(HashMap<String, String> contacts){
        Scanner input = new Scanner(System.in);
        String name,number;
        System.out.println("Enter your name : ");
        name = input.nextLine();
        
        System.out.println("Enter your cellphone number : ");
        number = input.nextLine();
                
        contacts.put(name, number);
    }

    private static void search(HashMap<String, String> contacts) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Please enter the name of the contact you're looking for: ");
        name = input.nextLine();
        
        if(contacts.containsKey(name)){
            //System.out.println(contacts.values());
            System.out.println(Arrays.asList(contacts.values()));
        }else{
        }
       
    }

    private static void display(HashMap<String, String> contacts) {
        System.out.println(contacts);
    }
    
    
    
}
