/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proxy;


public class InternetAccess implements InternetInterface{
    
    private String employeeName;  
    public InternetAccess(String empName) {  
        this.employeeName = empName;  
    }  

    @Override
    public void grantInternetAccess() {
        
    }
    
}
