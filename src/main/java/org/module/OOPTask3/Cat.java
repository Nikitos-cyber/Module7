package org.module.OOPTask3;

public class Cat implements Eat,Edible,Movable{
    @Override
    public void eat(){
        System.out.println("Cat eating...");
    }
    @Override
    public void beEaten(){
        System.out.println("Cat be eaten...");
    }
    @Override
    public void move(){
        System.out.println("Cat moving...");
    }
}
