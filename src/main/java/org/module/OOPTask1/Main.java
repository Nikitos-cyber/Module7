package org.module.OOPTask1;

public class Main {
    public static void main(String[] args) {
        Moveable[] arr = {
                new Cat(),
                new Transport(),
                new Guitar()
        };
        for(Moveable m : arr){
            m.move();
        }
    }
}
