package Sorted;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static  void main(String[] args){
        Set<Animal> animals = new TreeSet<>(new SortedNameAnimal());
        animals.add(new Animal("Slon","Poll", 1_100));
        animals.add(new Animal("Slon","Alise", 1_200));
        for(Animal animal: animals){
            System.out.println(animal);
        }

    }

}
