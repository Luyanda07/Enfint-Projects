/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

/**
 *
 * @author hp
 */
public class UsbAdapter implements UsbInterface{
    
    MemoryCardInterface memoryCardInterface;

    public UsbAdapter(String usbType) {
        if(usbType.equalsIgnoreCase("SD")){
            memoryCardInterface = new MemoryCard();
        }
    }

    @Override
    public void readUsbInfo(String usbType,Integer size) {
        if(usbType.equalsIgnoreCase("SD")){
            memoryCardInterface.readMemoryCardInfo(usbType, size);
          
     }
    } 
}
