package org.module.Test;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add("Hello");
        for (int i = 1; i <= 24; i++) {
            queue.add(i);
        }
        queue.add(new Date());
        queue.add(new Date());

    }
}
