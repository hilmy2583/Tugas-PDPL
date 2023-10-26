package Pertemuan05.Inheritance;

public class Hierarchical {
    
}

class Animal{
    void eat(){
        System.out.println("eating...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}

class Cat extends Animal {
    void meow(){
        System.out.println("meowing...");
    }
}

class TestInheritance3 {
    public static void main(String args[]){
        Cat d = new Cat();
        d.meow();
        d.eat();
    }
}
