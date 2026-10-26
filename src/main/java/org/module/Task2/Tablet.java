package org.module.Task2;

public class Tablet extends Device{
    public Tablet(String name){
        super(name);
    }
    @Override
    public void turnOn(){
        System.out.println("Tablet on");
    }
}
