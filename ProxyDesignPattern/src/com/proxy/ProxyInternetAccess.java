/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proxy;


public class ProxyInternetAccess implements InternetInterface{
    
    private String employeeName;  
    private InternetAccess  access;
    
    public ProxyInternetAccess(String employeeName) {  
            this.employeeName = employeeName;  
    }
    
    @Override
    public void grantInternetAccess() {
        if (getRole(employeeName) > 4)   
            {  
                access = new InternetAccess(employeeName);  
                access.grantInternetAccess();  
            }   
            else   
            {  
                System.out.println("No Internet access granted. Your job level is below 5");  
            }  
    }

    private int getRole(String employeeName) {
         return 3;
    }
    
}
