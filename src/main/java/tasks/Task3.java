package tasks;

public class Task3 {
    public static void main(String[] args) {

        String[] names = {"Боцман", "Пушок", "Мурка", "Боня", "Симба"};
        int[] ages = {1, 2, 2, 5, 3};
        double[] weights = {2.0, 3.5, 4.0, 2.45, 5.2};

        Cat[] cat = new Cat[5];
        for (int i = 0; i < 5; i++) {
           cat[i] = new Cat(names[i], ages[i], weights[i]);
       }

       System.out.println("Имя, возраст, вес");
       for (int i = 0; i < 5; i++) {
           cat[i].printInfo();
       }

       System.out.print(cat[2].getName() + ":");
       cat[2].meow();

       if (cat[2].getIsHungry()){
            System.out.println(cat[2].getName() + " голодная!");
        } else {
           System.out.println(cat[2].getName() + " не голодная!");
       }
       cat[2].eat();
        if (cat[2].getIsHungry()){
            System.out.println(cat[2].getName() + " голодная!");
        } else {
            System.out.println(cat[2].getName() + " не голодная!");
        }
    }
}

 class Cat {
    private String name;
    private int age;
    private double weight;
    private boolean isHungry;

    public Cat(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isHungry = true;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean getIsHungry(){
        return this.isHungry;
    }

    public void printInfo() {
        String years;
        if (age == 1) {
            years = "год";
        } else if (age <= 3) {
            years = "года";
        } else {
            years = "лет";
        }
        System.out.println(this.name + ", " + this.age + " " + years + ", " + this.weight + " кг");
    }

    public void meow() {
        System.out.println(" Meow");
    }
    
    public void eat() {
        this.isHungry = false;
        }
}
