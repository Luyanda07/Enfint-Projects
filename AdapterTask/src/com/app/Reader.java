/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

public class Reader implements UsbInterface{
    UsbAdapter usbAdapter;

    @Override
    public void readUsbInfo(String usbType, Integer size) {
        if(usbType.equalsIgnoreCase("USB 3.0")){
            System.out.println("Reading from usb....");
        }
        else if(usbType.equalsIgnoreCase("SD")){
            usbAdapter = new UsbAdapter(usbType);
            usbAdapter.readUsbInfo(usbType, size);
        }
    }
    
}
