package homework10;

public abstract class Animal {
    private static int animalCount = 0;
    private static int catCount = 0;
    private static int dogCount = 0;

    public Animal() {
        this.countAnimals();
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    //методы для подсчёта количества созданных животных и для вывода этого количества на экран
    public void countAnimals() {
        if (this instanceof Cat) {
            catCount++;
            animalCount++;
        } else if (this instanceof Dog) {
            dogCount++;
            animalCount++;
        }
    }

    public static void printAnimalsCount() {
        String result = "Количество всех животных: " + animalCount + ";\nКоличество котов: " + catCount +
                "\nКоличество собак: " + dogCount + "\n__________________";
        System.out.println(result);
    }

}
