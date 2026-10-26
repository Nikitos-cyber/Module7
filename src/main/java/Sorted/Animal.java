package Sorted;

public class Animal implements Comparable <Animal>{
    private String animalBreed;
    private String name;
    private int weight;
    public Animal(String animalBreed, String name,int weight){
        this.animalBreed = animalBreed;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "{ Breed: " + animalBreed + " Name: " + name + " Weight: " + weight + " }";
    }

    @Override
    public int compareTo(Animal animal){
        if(weight < animal.weight)
            return -1;
        if(weight == animal.weight)
            return 0;
        return 1;
    }

}
