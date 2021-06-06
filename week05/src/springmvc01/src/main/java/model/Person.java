package model;

public class Person extends Animal {

    private long id;

    private String name;

    @Override
    public void walk() {
        System.out.println("人在走");
    }

    @Override
    public void eat() {
        System.out.println("人在吃");
    }

    @Override
    public void talk() {
        System.out.println("人在说话");
    }

}
