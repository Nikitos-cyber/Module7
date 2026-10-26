package org.module.Task9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(100);


        for(int i = 0; i < 100; ++i){
            list.add(i);
        }

        for(int num : list){
            System.out.print(num + "\t");
        }

        for(int i = 0; i < list.size() / 2 ; ++i ){
            int num = list.get(i);
            list.set(i,list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, num);
        }


        System.out.println("\n--------------------------------------------------------------");

        for(int num : list){
            System.out.print(num + "\t");
        }

    }
}
