package oop;

public class Animal {

    String color;
    int steps = 0;

    public Animal(String color) {
        this.color = color;
    }

    public void run() {
        steps++;
    }
}
