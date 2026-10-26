package org.module.Task7;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> toDoList = new LinkedList<String>();

        Boss boss = new Boss(toDoList);
        Worker worker = new Worker(toDoList);
        for (int i = 0; i < 5; i ++){
            boss.addTask("Задача - " + (i + 1));
        }

        for(int i = 0; i <= 5; ++i){
            worker.takeTask();
        }

    }
}
