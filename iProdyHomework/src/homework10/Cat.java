package homework10;

public class Cat extends Animal {

    @Override
    public void run(int distance) {
        if (distance < 0 || distance > 200) {
            System.out.println("Некорректно введена дистанция бега");
        } else {
            System.out.println("Кот пробежал " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }
}
