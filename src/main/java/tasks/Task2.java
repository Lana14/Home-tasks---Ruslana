package tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число");

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println();
        for (int i = 9; i >= 0; i--){
            System.out.println(array[i]);
        }
        System.out.println();
    }
}
