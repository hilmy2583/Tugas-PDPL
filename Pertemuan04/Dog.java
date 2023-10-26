package Pertemuan04;

public class Dog {
    String name, breed, color;
    int age;

    public Dog(String name, String breed, String color, int age){
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getBreed(){
        return breed;
    }

    public String getColor(){
        return color;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return("Hi my name is " + getName() + ".\nMy breed, age and color are " + getBreed() + "," + getAge() + "," + getColor());
    }

    public static void main(String[] args) {
        Dog stuffy = new Dog("Stuffy", "Husky", "Grey", 5);
        System.out.println(stuffy.toString());
    }
}
