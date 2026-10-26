package org.module.OOPTask3;

public class Mouse implements Movable, Edible {
    @Override
    public void move(){
        System.out.println("Mouse moving...");
    }

    @Override
    public void beEaten(){
        System.out.println("Mouse be eaten...");
    }

}
