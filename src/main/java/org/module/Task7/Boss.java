package org.module.Task7;

import java.util.LinkedList;

public class Boss {
    private LinkedList<String> toDoList;
    public Boss(LinkedList <String> toDoList){
        this.toDoList = toDoList;
    }
    public void addTask(String task){
        toDoList.addFirst(task);
        System.out.println("Boss add Task!");
    }
}
