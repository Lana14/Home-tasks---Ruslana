package tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task4 {

    /*
        Есть класс Cat с полем имя (name, String).
    Создать коллекцию HashMap<String, Cat>.
    Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
    Вывести результат на экран, каждый элемент с новой строки.
     */
    public static void main(String[] args) {

        class Cat {

            private String color;

            public Cat(String color) {
                this.color = color;
            }

            @Override
            public String toString() {
                return color;
            }
        }

        Map<String, Cat> catMap = new HashMap<>();
        catMap.put("Боцман", new Cat("рыжий"));
        catMap.put("Пушок", new Cat("черный"));
        catMap.put("Том", new Cat("белый"));
        catMap.put("Симба", new Cat("трехцветный"));
        catMap.put("Мурка", new Cat("черный"));
        catMap.put("Боня", new Cat("серый"));
        catMap.put("Васька", new Cat("черно-белый"));
        catMap.put("Фунтик", new Cat("коричневый"));
        catMap.put("Барсик", new Cat("рыжий"));
        catMap.put("Капитошка", new Cat("полосатый"));

        Set<Map.Entry<String, Cat>> entries = catMap.entrySet();
        for (Map.Entry cat : entries) {
            System.out.println(cat.getKey() + " " + cat.getValue());
        }
    }
}

