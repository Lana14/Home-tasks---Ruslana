package tasks;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = input.nextLine();

        System.out.println("Введите ваш возраст");
        int age = input.nextInt();

        System.out.println("Я "+name+" и мне "+age+" лет!");
    }
}
