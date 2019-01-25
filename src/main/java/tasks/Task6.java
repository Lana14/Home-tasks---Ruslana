package tasks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task6 {
    /*
        Создать коллекцию HashSet с типом элементов String.
        Добавить в неё 10 строк:
    арбуз
    банан
    вишня
    груша
    дыня
    ежевика
    женьшень
    земляника
    ирис
    картофель
        Вывести содержимое коллекции на экран, каждый элемент с новой строки.
        Посмотреть, как изменился порядок добавленных элементов.
     */

    public static void main(String[] args) {
        Set<String> grocery  = new HashSet<>();

        grocery.add ("арбуз");
        grocery.add ("банан");
        grocery.add ("вишня");
        grocery.add ("груша");
        grocery.add ("дыня");
        grocery.add ("ежевика");
        grocery.add ("земляника");
        grocery.add ("ирис");
        grocery.add ("картофель");

        Iterator<String> iterator = grocery.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
