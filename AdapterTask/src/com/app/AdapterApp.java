/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;


public class AdapterApp {
    
    public static void main(String []args){
        Reader reader = new Reader();
        
        reader.readUsbInfo("SD", 64);
        reader.readUsbInfo("Usb 3.0", 128);
    }
    
}
