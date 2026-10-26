package org.module.Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(scanner.hasNextInt()){
            list.add(scanner.nextInt());
        }
        try {
            throw new Exception();
        }catch (Exception e){
            for(Integer item : list){
                System.out.println(item.intValue());
            }
        }
    }
}
