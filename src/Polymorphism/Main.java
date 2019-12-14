package Polymorphism;

public class Main {

    public static void main(String[] args) {

       Animal cat = new Cat ("Vaska");

       Animal dog = new Dog("Barbos");

       cat.voice();

       dog.voice();

       Cat cat1 = new Cat("Murzik");

       cat1.sum(4,6, 9);
    }
}
