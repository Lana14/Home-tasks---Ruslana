package oop;

public class Dog extends Animal{

    public Dog(String color) {
        super(color);
    }

    //String color = "yellow"; - не конструктор

    public String write(String text) {
        return text;
    }
}
