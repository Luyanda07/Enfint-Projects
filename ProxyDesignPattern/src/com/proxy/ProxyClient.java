/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proxy;

/**
 *
 * @author hp
 */
public class ProxyClient {
    
    public static void main(String []args){
        
        InternetInterface access = new ProxyInternetAccess("Thobani Mathenjwa");  
        access.grantInternetAccess(); 
    }
        
    
}
