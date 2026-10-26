package org.module.Task1;

public class Main {
    public static void main(String[] args){
        User user1 = new User("ngolomazdin", "golomazdin1212@gmail.com");
        User user2 = new User("ngolomazdin", "golomazdin1212@gmail.com");
        User user3 = new User("rick", "grick@gmail.com");
        User user4 = user3;
        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user3));
        System.out.println(user3.equals(user4));
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
    }
}
