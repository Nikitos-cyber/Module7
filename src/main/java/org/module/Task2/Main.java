package org.module.Task2;

public class Main {
    public static void main(String[] args) {
        Device[] device = {
                new Laptop("lap"),
                new Smartphone("phone"),
                new Tablet("tablet")
        };

        for(Device item : device){
            item.turnOn();
        }
    }
}
