package org.module.Task2;

public class Smartphone extends Device{
    public Smartphone(String name){
        super(name);
    }
    @Override
    public void turnOn(){
        System.out.println("Smartphone on");
    }
}
