package org.module.OOPTask3;

public class Dog implements Movable, Eat{
    @Override
    public void eat(){
        System.out.println("Dog eating...");
    }
    @Override
    public void move(){
        System.out.println("Dog moving...");
    }
}
