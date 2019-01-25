package tasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task5 {

    /*
    Для arrayList и linkedList провести 10 тысяч вызовов  add,get и remove методов.
    Замерить время работы методов add, get, remove для каждого из видов списков: arrayList и 
    linkedList (подсказка: использовать System.currentTimeMillis() для замера времени)
    */

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();

        long start, end;

            start = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                arrayList.add(i);
            }
            end = System.currentTimeMillis();
            System.out.println("Time taken for adding 10000 items to a list: " + (end - start) + " ms for ArrayList");

            start = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                linkedList.add(i);
            }
            end = System.currentTimeMillis();
            System.out.println("Time taken for adding 10000 items to a list: " + (end - start) + " ms for LinkedList");

        System.out.println();

            start = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
            }
            end = System.currentTimeMillis();
            System.out.println("Time taken for getting 10000 items from the list: " + (end - start) + " ms for ArrayList");

            start = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
            }
            end = System.currentTimeMillis();
            System.out.println("Time taken for getting 10000 items from the list: " + (end - start) + " ms for LinkedList");

        System.out.println();

            start = System.currentTimeMillis();
                arrayList.removeAll(arrayList);
            end = System.currentTimeMillis();
            System.out.println("Time taken for deletion of 10000 items from the list: " + (end - start) + " ms for ArrayList");

            start = System.currentTimeMillis();
                linkedList.removeAll(linkedList);
            end = System.currentTimeMillis();
            System.out.println("Time taken for deletion of 10000 items from the list: " + (end - start) + " ms for LinkedList");
        }
    }
