package org.module.Task2;

public class Laptop extends Device{
    public Laptop(String name){
        super(name);
    }
    @Override
    public void turnOn(){
        System.out.println("Laptop on");
    }
}
