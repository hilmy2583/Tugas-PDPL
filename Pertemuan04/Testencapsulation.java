package Pertemuan04;

public class Testencapsulation {
    public static void main(String[] Args){
        Encapsulate obj = new Encapsulate();

        obj.setAge(20);
        obj.setRoll(2);
        obj.setName("Muhammad Hilmy");

        System.out.println("Geek Name : " + obj.getName());
        System.out.println("Geek Age  : " + obj.getAge());
        System.out.println("Geek Roll : " + obj.getRoll());
        // System.out.println("Geek Roll : " + obj.geekRoll);
    }
}
