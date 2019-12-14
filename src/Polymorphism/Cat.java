package Polymorphism;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("I can speak MYAu");
    }

    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

}
