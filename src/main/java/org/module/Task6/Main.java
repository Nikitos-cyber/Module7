package org.module.Task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try{
           Main main = new Main();
            System.out.println(main.input());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    public String input() throws Exception{

        String s = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            s = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        if (s != null && s.isEmpty()) {
            throw new MyException("String can not be empty!");
        }
        return s;
    }
}


class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}