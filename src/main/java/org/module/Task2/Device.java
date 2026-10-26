package org.module.Task2;

public abstract class Device {
    private String name;
    public Device(String name){
        this.name = name;
    }
    public abstract void turnOn();
}
