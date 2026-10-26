package org.module.Task7;

import java.util.LinkedList;

public class Worker {
    private LinkedList<String> toDoList;
    public Worker(LinkedList<String> toDoList){
        this.toDoList = toDoList;
    }
    public void takeTask(){
        Object obj = toDoList.pollLast();
        if(obj != null) {
            System.out.println("Completed task " + obj);
        }else {
            System.out.println("Working end..");
        }
    }
}
