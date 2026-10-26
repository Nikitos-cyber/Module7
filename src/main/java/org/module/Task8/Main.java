package org.module.Task8;

public class Main {
    public static void main(String[] args) {
        MotherBoard.USB usb = new MotherBoard.USB(true,false);
        usb.showUSB();
        System.out.println(MotherBoard.USB.link);
    }
}
