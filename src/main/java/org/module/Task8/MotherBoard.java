package org.module.Task8;

public class MotherBoard {
    static class USB{
        public static String link = "https://mother-board.ru";
        boolean usb1 = true;
        boolean usb2 = true;
        public USB(boolean usb1, boolean usb2){
            this.usb1 = usb1;
            this.usb2 = usb2;
        }
        public void showUSB(){
            int  a = 10;
            int b = 10;
            class Num{
                public void show(){
                    System.out.println(a + b);
                    usb1 = false;
                }
            }

            System.out.println("usb1: " + usb1 + " usb2: " + usb2);
        }

    }
    USB usb = new USB(true,false);
}
